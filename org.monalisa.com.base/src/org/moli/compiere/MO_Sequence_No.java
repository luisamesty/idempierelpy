package org.moli.compiere;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.adempiere.exceptions.DBException;
import org.compiere.model.MDocType;
import org.compiere.model.MSequence;
import org.compiere.model.MSysConfig;
import org.compiere.model.PO;
import org.compiere.model.X_AD_Sequence_No;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Trx;
import org.compiere.util.Util;

public class MO_Sequence_No extends X_AD_Sequence_No {

	private static final long serialVersionUID = 1L;

	private static final int QUERY_TIME_OUT = 30;
	
	private static final String NoYearNorMonth = "-";
	
	/**	Sequence for Table Document No's	*/
	private static final String	PREFIX_DOCSEQ = "DocumentNo_";
	/**	Start Number			*/
	public static final int		INIT_NO = 1000000;	//	1M
	/**	Start System Number		*/
	public static final int		INIT_SYS_NO = 200000;   // start number for iDempiere
	/** Static Logger			*/
	private static CLogger 		s_log = CLogger.getCLogger(MSequence.class);
	
	/** Standard Constructor */
    public MO_Sequence_No (Properties ctx, int AD_Sequence_No_ID, String trxName)
    {
      super (ctx, AD_Sequence_No_ID, trxName);
      /** if (AD_Sequence_No_ID == 0)
        {
			setAD_Sequence_ID (0);
			setCalendarYearMonth (null);
			setCurrentNext (0);
        } */
    }

    /** Standard Constructor */
    public MO_Sequence_No (Properties ctx, int AD_Sequence_No_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Sequence_No_ID, trxName, virtualColumns);
      /** if (AD_Sequence_No_ID == 0)
        {
			setAD_Sequence_ID (0);
			setCalendarYearMonth (null);
			setCurrentNext (0);
        } */
    }

    /** Standard Constructor */
    public MO_Sequence_No (Properties ctx, String AD_Sequence_No_UU, String trxName)
    {
      super (ctx, AD_Sequence_No_UU, trxName);
      /** if (AD_Sequence_No_UU == null)
        {
			setAD_Sequence_ID (0);
			setCalendarYearMonth (null);
			setCurrentNext (0);
        } */
    }

    /** Standard Constructor */
    public MO_Sequence_No (Properties ctx, String AD_Sequence_No_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Sequence_No_UU, trxName, virtualColumns);
      /** if (AD_Sequence_No_UU == null)
        {
			setAD_Sequence_ID (0);
			setCalendarYearMonth (null);
			setCurrentNext (0);
        } */
    }

    /** Load Constructor */
    public MO_Sequence_No (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }
	
    
    /** Column name Prefix */
    public static final String COLUMNNAME_Prefix = "Prefix";


    /** Column name Suffix */
    public static final String COLUMNNAME_Suffix = "Suffix";
    
    /**
	 * Set Prefix.
	 * 
	 * @param Prefix Prefix before the sequence number
	 */
	public void setPrefix(String Prefix) {
		set_Value(COLUMNNAME_Prefix, Prefix);
	}

	/**
	 * Get Prefix.
	 * 
	 * @return Prefix before the sequence number
	 */
	public String getPrefix() {
		return (String) get_Value(COLUMNNAME_Prefix);
	}


	/**
	 * 	Get next Document No for table
	 *	@param AD_Client_ID client
	 *	@param TableName table name
	 * 	@param trxName optional Transaction Name
	 *	@return document no or null
	 */
	public static String getDocumentNo (int AD_Client_ID, String TableName, String trxName)
	{
		return getDocumentNo(AD_Client_ID, TableName, trxName, null);

	}
	
	/**
	 * 	Get next Document No for table (when the document doesn't have a c_doctype)
	 *	@param AD_Client_ID client
	 *	@param TableName table name
	 * 	@param trxName optional Transaction Name
	 *  @param po - used to get the date, org and parse context variables
	 *	@return document no or null
	 */
	public static String getDocumentNo (int AD_Client_ID, String TableName, String trxName, PO po)
	{
		if (TableName == null || TableName.length() == 0)
			throw new IllegalArgumentException("TableName missing");

		MSequence seq = get(Env.getCtx(), TableName, trxName, /*tableID=*/false);
		if (seq == null || seq.get_ID() == 0) {
			if (!MSequence.createTableSequence(Env.getCtx(), TableName, trxName, /*tableID=*/false))
				throw new AdempiereException("Could not create table sequence");
			seq = get(Env.getCtx(), TableName, trxName, /*tableID=*/false);
			if (seq == null || seq.get_ID() == 0)
				throw new AdempiereException("Could not find table sequence");
		}
		
		return getDocumentNoFromSeq(seq, trxName, po);
	}	//	getDocumentNo

	/**
	 * Get next document no from sequence
	 * @param seq
	 * @param trxName
	 * @param po
	 * @return document no or null
	 */
	public static String getDocumentNoFromSeq(MSequence seq, String trxName, PO po) {
		//	Check AdempiereSys
		boolean adempiereSys = false;
		if (Ini.isClient()) 
		{
			adempiereSys = Ini.isPropertyBool(Ini.P_ADEMPIERESYS);
		} 
		else
		{
			String sysProperty = Env.getCtx().getProperty(Ini.P_ADEMPIERESYS, "N");
			adempiereSys = "y".equalsIgnoreCase(sysProperty) || "true".equalsIgnoreCase(sysProperty);
		}
		if (adempiereSys && Env.getAD_Client_ID(Env.getCtx()) > 11)
			adempiereSys = false;
		//

		int AD_Sequence_ID = seq.getAD_Sequence_ID();
		boolean isStartNewYear = seq.isStartNewYear();
		boolean isStartNewMonth = seq.isStartNewMonth();
		String dateColumn = seq.getDateColumn();
		boolean isUseOrgLevel = seq.isOrgLevelSequence();
		String orgColumn = seq.getOrgColumn();
		int startNo = seq.getStartNo();
		int incrementNo = seq.getIncrementNo();
		String prefix = seq.getPrefix();
		String suffix = seq.getSuffix();
		String decimalPattern = seq.getDecimalPattern();

		String selectSQL = null;
		if (isStartNewYear || isUseOrgLevel) {
			selectSQL = "SELECT y.CurrentNext, s.CurrentNextSys "
					+ "FROM AD_Sequence_No y, AD_Sequence s "
					+ "WHERE y.AD_Sequence_ID = s.AD_Sequence_ID "
					+ "AND s.AD_Sequence_ID = ? "
					+ "AND y.CalendarYearMonth = ? "
					+ "AND y.AD_Org_ID = ? "
					+ "AND s.IsActive='Y' AND s.IsTableID='N' AND s.IsAutoSequence='Y' "
					+ "ORDER BY s.AD_Client_ID DESC";
		} else {
			selectSQL = "SELECT s.CurrentNext, s.CurrentNextSys "
					+ "FROM AD_Sequence s "
					+ "WHERE s.AD_Sequence_ID = ? "
					+ "AND s.IsActive='Y' AND s.IsTableID='N' AND s.IsAutoSequence='Y' "
					+ "ORDER BY s.AD_Client_ID DESC";
		}
		if (DB.isOracle() == false)
		{
			if ( isStartNewYear || isUseOrgLevel  ) {
				selectSQL = selectSQL + " FOR UPDATE OF y";
			} else {
				selectSQL = selectSQL + " FOR UPDATE OF s";
			}
		}
		else
		{
			if (isStartNewYear || isUseOrgLevel) {
				selectSQL = selectSQL + " FOR UPDATE OF y.";
			} else {
				selectSQL = selectSQL + " FOR UPDATE OF s.";
			}
			
			if(adempiereSys)
				selectSQL = selectSQL + "CurrentNextSys";
			else
				selectSQL = selectSQL + "CurrentNext";
		}		
		if (!DB.isOracle() && !DB.isPostgreSQL())
			selectSQL = DB.getDatabase().convertStatement(selectSQL);
		Connection conn = null;
		Trx trx = trxName == null ? null : Trx.get(trxName, true);
		//
		
		String calendarYearMonth = NoYearNorMonth;
		int docOrg_ID = 0;
		int next = -1;

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			if (trx != null)
				conn = trx.getConnection();
			else
				conn = DB.getConnection(false);
			//	Error
			if (conn == null)
				return null;

			if (isStartNewYear)
			{
				SimpleDateFormat sdf = null;
				if (isStartNewMonth)
					sdf = new SimpleDateFormat("yyyyMM");
				else
					sdf = new SimpleDateFormat("yyyy");
				
				if (po != null && dateColumn != null && dateColumn.length() > 0)
				{
					Date docDate = (Date)po.get_Value(dateColumn);
					calendarYearMonth = sdf.format(docDate);
				}
				else
				{
					calendarYearMonth = sdf.format(new Date());
				}
			}
			
			if (isUseOrgLevel)
			{
				if (po != null && orgColumn != null && orgColumn.length() > 0)
				{
					docOrg_ID = po.get_ValueAsInt(orgColumn);
				}
			}

			pstmt = conn.prepareStatement(selectSQL,
				ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			int index = 1;
			pstmt.setInt(index++, AD_Sequence_ID);
			if (isUseOrgLevel || isStartNewYear) {
				pstmt.setString(index++, calendarYearMonth);
				pstmt.setInt(index++, docOrg_ID);
			}

			//
			if (DB.getDatabase().isQueryTimeoutSupported())
			{
				int timeout = MSysConfig.getIntValue(MSysConfig.MSEQUENCE_GETNEXT_TIMEOUT, QUERY_TIME_OUT, Env.getAD_Client_ID(Env.getCtx())); // default 30 seconds
				pstmt.setQueryTimeout(timeout);
			}
			rs = pstmt.executeQuery();

			if (rs.next())
			{
				if (s_log.isLoggable(Level.FINE)) s_log.fine("AD_Sequence_ID="+AD_Sequence_ID);

				PreparedStatement updateSQL = null;
				try
				{
					if (adempiereSys) {
						String updateCmd = "UPDATE AD_Sequence SET CurrentNextSys = CurrentNextSys + ? WHERE AD_Sequence_ID = ?";
						if (!DB.isOracle() && !DB.isPostgreSQL())
							updateCmd = DB.getDatabase().convertStatement(updateCmd);
						updateSQL = conn.prepareStatement(updateCmd);
						next = rs.getInt(2);
					} else {
						String sql;
						if (isStartNewYear || isUseOrgLevel)
							sql = "UPDATE AD_Sequence_No SET CurrentNext = CurrentNext + ? WHERE AD_Sequence_ID=? AND CalendarYearMonth=? AND AD_Org_ID=?";
						else
							sql = "UPDATE AD_Sequence SET CurrentNext = CurrentNext + ? WHERE AD_Sequence_ID=?";
						if (!DB.isOracle() && !DB.isPostgreSQL())
							sql = DB.getDatabase().convertStatement(sql);
						updateSQL = conn.prepareStatement(sql);
						next = rs.getInt(1);
					}
					updateSQL.setInt(1, incrementNo);
					updateSQL.setInt(2, AD_Sequence_ID);
					if (isStartNewYear || isUseOrgLevel) {
						updateSQL.setString(3, calendarYearMonth);
						updateSQL.setInt(4, docOrg_ID);
					}
					updateSQL.executeUpdate();
				}
				finally
				{
					DB.close(updateSQL);
					updateSQL = null;
				}
			}
			else
			{ // did not find sequence no
				if (isUseOrgLevel || isStartNewYear) 
				{	// create sequence (CurrentNo = StartNo + IncrementNo) for this year/month/org and return first number (=StartNo)
					next = startNo;

					X_AD_Sequence_No seqno = new X_AD_Sequence_No(Env.getCtx(), 0, trxName);
					seqno.setAD_Sequence_ID(AD_Sequence_ID);
					seqno.setAD_Org_ID(docOrg_ID);
					seqno.setCalendarYearMonth(calendarYearMonth);
					seqno.setCurrentNext(startNo + incrementNo);
					seqno.saveEx();
				}
				else	// standard
				{
					s_log.warning ("(Sequence)- no record found - " + seq);
					next = -2;
				}
			}
			//	Commit
			if (trx == null)
			{
				conn.commit();
			}
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, "(DocType) [" + trxName + "]", e);
			if (DBException.isTimeout(e))
				throw new AdempiereException("GenerateDocumentNoTimeOut", e);
			else
				throw new AdempiereException("GenerateDocumentNoError", e);
		}
		finally
		{
			DB.close(rs, pstmt);
			pstmt = null;rs = null;
			//	Finish
			try
			{
				if (trx == null && conn != null) {
					conn.close();
					conn = null;
				}
			}
			catch (Exception e)
			{
				s_log.log(Level.SEVERE, "(DocType) - finish", e);
			}
		}
		//	Error
		if (next < 0)
			return null;

		//	create DocumentNo
		StringBuilder doc = new StringBuilder();
		if (prefix != null && prefix.length() > 0) {
			String prefixValue = Env.parseVariable(prefix, po, trxName, false);
			if (!Util.isEmpty(prefixValue))
				doc.append(prefixValue);
		}

		if (decimalPattern != null && decimalPattern.length() > 0)
			doc.append(new DecimalFormat(decimalPattern).format(next));
		else
			doc.append(next);

		if (suffix != null && suffix.length() > 0) {
			String suffixValue = Env.parseVariable(suffix, po, trxName, false);
			if (!Util.isEmpty(suffixValue))
				doc.append(suffixValue);
		}

		String documentNo = doc.toString();
		if (s_log.isLoggable(Level.FINER)) s_log.finer (documentNo + " (" + incrementNo + ")"
				+ " - Sequence=" + AD_Sequence_ID + " [" + trx + "]");
		return documentNo;
	}

	/**
	 * 	Get Document No based on Document Type
	 *	@param C_DocType_ID document type
	 * 	@param trxName optional Transaction Name
	 *	@return document no or null
	 *  @deprecated
	 */
	@Deprecated
	public static String getDocumentNo(int C_DocType_ID, String trxName)
	{
		return getDocumentNo (C_DocType_ID, trxName, false);
	}	//	getDocumentNo

	/**
	 * 	Get next Document No based on Document Type
	 *	@param C_DocType_ID document type
	 * 	@param trxName optional Transaction Name
	 *  @param definite asking for a definitive or temporary sequence
	 *	@return document no or null
	 */
	public static String getDocumentNo (int C_DocType_ID, String trxName, boolean definite)
	{
		return getDocumentNo(C_DocType_ID, trxName, definite, null);
	}

	/**
	 * 	Get next Document No based on Document Type
	 *	@param C_DocType_ID document type
	 * 	@param trxName optional Transaction Name
	 *  @param definite asking for a definitive or temporary sequence
	 *  @param po
	 *	@return document no or null
	 */
	public static String getDocumentNo (int C_DocType_ID, String trxName, boolean definite, PO po)
	{
		if (C_DocType_ID == 0)
		{
			s_log.severe ("C_DocType_ID=0");
			return null;
		}

		MDocType dt = MDocType.get (Env.getCtx(), C_DocType_ID);	//	wrong for SERVER, but r/o
		if (dt != null && !dt.isDocNoControlled())
		{
			if (s_log.isLoggable(Level.FINER)) s_log.finer("DocType_ID=" + C_DocType_ID + " Not DocNo controlled");
			return null;
		}
		if (definite && ! dt.isOverwriteSeqOnComplete()) {
			s_log.warning("DocType_ID=" + C_DocType_ID + " Not Sequence Overwrite on Complete");
			return null;
		}
		if (dt == null || dt.getDocNoSequence_ID() == 0)
		{
			s_log.warning ("No Sequence for DocType - " + dt);
			return null;
		}
		if (definite && dt.getDefiniteSequence_ID() == 0)
		{
			s_log.warning ("No Definite Sequence for DocType - " + dt);
			return null;
		}
		int seqID = ( definite ? dt.getDefiniteSequence_ID() : dt.getDocNoSequence_ID() );
		MSequence seq = new MSequence(Env.getCtx(), seqID, trxName);
		
		if (CLogMgt.isLevel(Level.FINER))
			s_log.log(Level.FINER, "DocType_ID=" + C_DocType_ID + " [" + trxName + "]");

		return getDocumentNoFromSeq(seq, trxName, po);
	}	//	getDocumentNo

	/**
	 * 	Get Sequence
	 *	@param ctx context
	 *	@param tableName table name
	 *	@return Sequence
	 */
	public static MSequence get (Properties ctx, String tableName)
	{
		return get(ctx, tableName, null);
	}

	/**
	 *  Get the tableID sequence based on the TableName 
	 *  @param ctx
	 *  @param tableName
	 *  @param trxName
	 *  @return sequence
	 */
	public static MSequence get (Properties ctx, String tableName, String trxName)
	{
		return get (ctx, tableName, trxName, true);
	}

	/**
	 * 	Get Sequence
	 *	@param ctx context
	 *	@param tableName table name
	 *  @param trxName optional transaction name
	 *  @param tableID IsTableID flag
	 *	@return Sequence
	 */
	public static MSequence get (Properties ctx, String tableName, String trxName, boolean tableID)
	{
		if (! tableID) {
			tableName = PREFIX_DOCSEQ + tableName;
		}

		String sql = "SELECT * FROM AD_Sequence "
			+ "WHERE UPPER(Name)=?"
			+ " AND IsTableID=?";
		if (! tableID)
			sql = sql + " AND AD_Client_ID=?";
		MSequence retValue = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			pstmt.setString(1, tableName.toUpperCase());
			pstmt.setString(2, ( tableID ? "Y" : "N" ) );
			if (! tableID)
				pstmt.setInt (3, Env.getAD_Client_ID(Env.getCtx()));
			rs = pstmt.executeQuery();
			if (rs.next ())
				retValue = new MSequence (ctx, rs, trxName);
			if (rs.next())
				s_log.log(Level.SEVERE, "More then one sequence for " + tableName);
		}
		catch (Exception e)
		{
			throw new DBException(e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
		return retValue;
	}	//	get

	public static int getQueryTimeOut() {
		return QUERY_TIME_OUT;
	}

	public static String getNoyearnormonth() {
		return NoYearNorMonth;
	}

	public static String getPrefixDocseq() {
		return PREFIX_DOCSEQ;
	}

	public static int getInitNo() {
		return INIT_NO;
	}

	public static int getInitSysNo() {
		return INIT_SYS_NO;
	}

	public static String getColumnnamePrefix() {
		return COLUMNNAME_Prefix;
	}

	public static String getColumnnameSuffix() {
		return COLUMNNAME_Suffix;
	}



}
