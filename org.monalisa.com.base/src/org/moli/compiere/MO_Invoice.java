package org.moli.compiere;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MInvoice;
import org.compiere.process.DocAction;
import org.compiere.process.DocOptions;
import org.compiere.process.IDocsPostProcess;
import org.compiere.util.CLogger;

public class MO_Invoice extends MInvoice implements DocAction, DocOptions, IDocsPostProcess {

	private static final long serialVersionUID = 1L;

	/**	Process Message 			*/
	private String		am_processMsg = null;
	
	static CLogger log = CLogger.getCLogger(MO_Invoice.class);
	
	public MO_Invoice(Properties ctx, int C_Invoice_ID, String trxName) {
		super(ctx, C_Invoice_ID, trxName);
	}

	public MO_Invoice (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MInvoice

	
	@Override
	public int customizeValidActions(String docStatus, Object processing, String orderType, String isSOTrx,
			int AD_Table_ID, String[] docAction, String[] options, int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getAm_processMsg() {
		return am_processMsg;
	}

	public void setAm_processMsg(String am_processMsg) {
		this.am_processMsg = am_processMsg;
	}
	
	

}
