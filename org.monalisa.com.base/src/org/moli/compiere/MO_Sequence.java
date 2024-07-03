package org.moli.compiere;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MSequence;


public class MO_Sequence extends MSequence {

	private static final long serialVersionUID = 1L;

	public MO_Sequence(Properties ctx, int AD_Sequence_ID, String trxName) {
		super(ctx, AD_Sequence_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Sequence(Properties ctx, int AD_Client_ID, String sequenceName, int StartNo, String trxName) {
		super(ctx, AD_Client_ID, sequenceName, StartNo, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Sequence(Properties ctx, int AD_Client_ID, String tableName, String trxName) {
		super(ctx, AD_Client_ID, tableName, trxName);
		// TODO Auto-generated constructor stub
	}


	public MO_Sequence(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Sequence(Properties ctx, String AD_Sequence_UU, String trxName) {
		super(ctx, AD_Sequence_UU, trxName);
		// TODO Auto-generated constructor stub
	}

}
