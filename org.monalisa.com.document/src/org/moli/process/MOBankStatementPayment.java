package org.moli.process;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.model.MBankStatement;
import org.compiere.model.MBankStatementLine;
//import org.compiere.model.MInvoice;
//import org.compiere.model.MPayment;
import org.compiere.model.MProcessPara;
import org.compiere.model.X_I_BankStatement;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.AdempiereSystemError;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.Env;
import org.moli.compiere.MO_Invoice;
import org.moli.compiere.MO_Payment;

public class MOBankStatementPayment  extends SvrProcess {

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			if (para[i].getParameter() == null)
				;
			else
				MProcessPara.validateUnknownParameter(getProcessInfo().getAD_Process_ID(), para[i]);
		}
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		int Table_ID = getTable_ID();
		int Record_ID = getRecord_ID();
		if (log.isLoggable(Level.INFO)) log.info ("Table_ID=" + Table_ID + ", Record_ID=" + Record_ID);
		
		if (Table_ID == X_I_BankStatement.Table_ID)
			return createPayment (new X_I_BankStatement(getCtx(), Record_ID, get_TrxName()));
		else if (Table_ID == MBankStatement.Table_ID)
			return createPayment (new MBankStatement(getCtx(), Record_ID, get_TrxName()));
		else if (Table_ID == MBankStatementLine.Table_ID)
			return createPayment (new MBankStatementLine(getCtx(), Record_ID, get_TrxName()));
		
		throw new AdempiereSystemError("??");
	}	//	doIt

	/**
	 * 	Create Payment for Import
	 *	@param ibs import bank statement
	 *	@return Message
	 *  @throws Exception if not successful
	 */
	private String createPayment (X_I_BankStatement ibs) throws Exception
	{
		if (ibs == null || ibs.getC_Payment_ID() != 0)
			return "--";
		if (log.isLoggable(Level.FINE)) log.fine(ibs.toString());
		if (ibs.getC_Invoice_ID() == 0 && ibs.getC_BPartner_ID() == 0)
			throw new AdempiereUserError ("@NotFound@ @C_Invoice_ID@ / @C_BPartner_ID@");
		if (ibs.getC_BankAccount_ID() == 0)
			throw new AdempiereUserError ("@NotFound@ @C_BankAccount_ID@");
		//
		MO_Payment payment = createPayment (ibs.getC_Invoice_ID(), ibs.getC_BPartner_ID(),
			ibs.getC_Currency_ID(), ibs.getStmtAmt(), ibs.getTrxAmt(), 
			ibs.getC_BankAccount_ID(), ibs.getStatementLineDate() == null ? ibs.getStatementDate() : ibs.getStatementLineDate(), 
			ibs.getDateAcct(), ibs.getDescription(), ibs.getAD_Org_ID());
		if (payment == null)
			throw new AdempiereSystemError("Could not create Payment");
		
		ibs.setC_Payment_ID(payment.getC_Payment_ID());
		ibs.setC_Currency_ID (payment.getC_Currency_ID());
		ibs.setTrxAmt(payment.getPayAmt(true));
		ibs.saveEx();
		//
		StringBuilder retString = new StringBuilder("@C_Payment_ID@ = ").append(payment.getDocumentNo());
		if (payment.getOverUnderAmt().signum() != 0)
			retString.append(" - @OverUnderAmt@=").append(payment.getOverUnderAmt());
		return retString.toString();
	}	//	createPayment - Import

	/**
	 * Create Payment for Bank Statement
	 * Process all lines with TrxAmt+Invoice+BP and no Payment
	 * @param mBankStatement
	 * @return Message
	 * @throws Exception if not successful
	 */
	private String createPayment(MBankStatement bs) throws Exception {
		int count = 0;
		for (MBankStatementLine line : bs.getLines(false)) {
			if (line.getC_Payment_ID() == 0
				&& line.getTrxAmt().signum() > 0
				&& line.getC_Invoice_ID() > 0
				&& line.getC_BPartner_ID() > 0) {
				createPayment(line);
				count++;
			}
		}
		return String.valueOf(count);
	}

	/**
	 * 	Create Payment for BankStatement
	 *	@param bsl bank statement Line
	 *	@return Message
	 *  @throws Exception if not successful
	 */
	private String createPayment (MBankStatementLine bsl) throws Exception
	{
		if (bsl == null || bsl.getC_Payment_ID() != 0)
			return "--";
		if (log.isLoggable(Level.FINE)) log.fine(bsl.toString());
		if (bsl.getC_Invoice_ID() == 0 && bsl.getC_BPartner_ID() == 0)
			throw new AdempiereUserError ("@NotFound@ @C_Invoice_ID@ / @C_BPartner_ID@");
		//
		MBankStatement bs = new MBankStatement (getCtx(), bsl.getC_BankStatement_ID(), get_TrxName());
		//
		MO_Payment payment = createPayment (bsl.getC_Invoice_ID(), bsl.getC_BPartner_ID(),
			bsl.getC_Currency_ID(), bsl.getStmtAmt(), bsl.getTrxAmt(), 
			bs.getC_BankAccount_ID(), bsl.getStatementLineDate(), bsl.getDateAcct(),
			bsl.getDescription(), bsl.getAD_Org_ID());
		if (payment == null)
			throw new AdempiereSystemError("Could not create Payment");
		//	update statement
		bsl.setPayment(payment);
		bsl.saveEx();
		//
		StringBuilder retString = new StringBuilder("@C_Payment_ID@ = ").append(payment.getDocumentNo());
		if (payment.getOverUnderAmt().signum() != 0)
			retString.append(" - @OverUnderAmt@=").append(payment.getOverUnderAmt());
		return retString.toString();
	}	//	createPayment


	/**
	 * 	Create actual Payment
	 *	@param C_Invoice_ID invoice
	 *	@param C_BPartner_ID partner ignored when invoice exists
	 *	@param C_Currency_ID currency
	 *	@param StmtAmt statement amount
	 *	@param TrxAmt transaction amt
	 *	@param C_BankAccount_ID bank account
	 *	@param DateTrx transaction date
	 *	@param DateAcct	accounting date
	 *	@param Description description
	 *	@param AD_Org_ID org
	 *	@return payment
	 */
	private MO_Payment createPayment (int C_Invoice_ID, int C_BPartner_ID, 
		int C_Currency_ID, BigDecimal StmtAmt, BigDecimal TrxAmt,
		int C_BankAccount_ID, Timestamp DateTrx, Timestamp DateAcct, 
		String Description, int AD_Org_ID)
	{
		//	Trx Amount = Payment overwrites Statement Amount if defined
		BigDecimal PayAmt = TrxAmt;
		if (PayAmt == null || Env.ZERO.compareTo(PayAmt) == 0)
			PayAmt = StmtAmt;
		if (C_Invoice_ID == 0
			&& (PayAmt == null || Env.ZERO.compareTo(PayAmt) == 0))
			throw new IllegalStateException ("@PayAmt@ = 0");
		if (PayAmt == null)
			PayAmt = Env.ZERO;
		//
		MO_Payment payment = new MO_Payment (getCtx(), 0, get_TrxName());
		payment.setAD_Org_ID(AD_Org_ID);
		payment.setC_BankAccount_ID(C_BankAccount_ID);
		payment.setTenderType(MO_Payment.TENDERTYPE_Check);
		if (DateTrx != null)
			payment.setDateTrx(DateTrx);
		else if (DateAcct != null)
			payment.setDateTrx(DateAcct);
		if (DateAcct != null)
			payment.setDateAcct(DateAcct);
		else
			payment.setDateAcct(payment.getDateTrx());
		payment.setDescription(Description);
		//
		if (C_Invoice_ID != 0)
		{
			MO_Invoice invoice = new MO_Invoice (getCtx(), C_Invoice_ID, null);
			payment.setC_DocType_ID(invoice.isSOTrx());		//	Receipt
			payment.setC_Invoice_ID(invoice.getC_Invoice_ID());
			payment.setC_BPartner_ID (invoice.getC_BPartner_ID());
			if (PayAmt.signum() != 0)	//	explicit Amount
			{
				payment.setC_Currency_ID(C_Currency_ID);
				if (invoice.isSOTrx())
					payment.setPayAmt(PayAmt);
				else	//	payment is likely to be negative
					payment.setPayAmt(PayAmt.negate());
				BigDecimal discountAmt = invoice.getDiscountAmt(payment.getDateTrx());
				payment.setDiscountAmt(discountAmt);
				BigDecimal overUnderAmt = invoice.getOpenAmt().subtract(payment.getPayAmt()).subtract(discountAmt);
				payment.setOverUnderAmt(overUnderAmt);
			}
			else	// set Pay Amout from Invoice
			{
				payment.setC_Currency_ID(invoice.getC_Currency_ID());
				payment.setPayAmt(invoice.getOpenAmt());
			}
		}
		else if (C_BPartner_ID != 0)
		{
			payment.setC_BPartner_ID(C_BPartner_ID);
			payment.setC_Currency_ID(C_Currency_ID);
			if (PayAmt.signum() < 0)	//	Payment
			{
				payment.setPayAmt(PayAmt.abs());
				payment.setC_DocType_ID(false);
			}
			else	//	Receipt
			{
				payment.setPayAmt(PayAmt);
				payment.setC_DocType_ID(true);
			}
		}
		else
			return null;
		payment.saveEx();
		//
		if (!payment.processIt(MO_Payment.DOCACTION_Complete)) {
			log.warning("Payment Process Failed: " + payment.getDocumentNo() + " " + payment.getProcessMsg());
			throw new IllegalStateException("Payment Process Failed: " + payment.getDocumentNo() + " " + payment.getProcessMsg());
			
		}
		payment.saveEx();
		return payment;		
	}	//	createPayment

} // MOBankStatementPayment
