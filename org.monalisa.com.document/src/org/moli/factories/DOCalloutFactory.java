package org.moli.factories;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.compiere.model.MInvoice;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.moli.callout.DO_Invoice_callout;

public class DOCalloutFactory implements IColumnCalloutFactory {

	CLogger log = CLogger.getCLogger(DOCalloutFactory.class);
	
	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		
		List<IColumnCallout> list = new ArrayList<IColumnCallout>();

		// *********************************
		// TableRef: C_Invoice
		// *********************************
		if (tableName.equalsIgnoreCase(MInvoice.Table_Name)) {
//			// FieldRef: C_DocType_ID
//			if (columnName.equalsIgnoreCase(MInvoice.COLUMNNAME_C_DocType_ID)) {
//				log.warning("------------MO-AMDCalloutFactory tableName:"+tableName+"  columnName:"+columnName);
//				list.add(new DO_Invoice_callout());
//			}
//			// FieldRef: C_DocTypeTarget_ID
//			if (columnName.equalsIgnoreCase(MInvoice.COLUMNNAME_C_DocTypeTarget_ID)) {
//				log.warning("------------MO-AMDCalloutFactory tableName:"+tableName+"  columnName:"+columnName);
//				list.add(new DO_Invoice_callout());
//			}
//			// FieldRef: AD_Org_ID
//			if (columnName.equalsIgnoreCase(MInvoice.COLUMNNAME_AD_Org_ID)) {
//				log.warning("------------MO-AMDCalloutFactory tableName:"+tableName+"  columnName:"+columnName);
//				list.add(new DO_Invoice_callout());
//			}
		}
		return list != null ? list.toArray(new IColumnCallout[0]) : new IColumnCallout[0];
	}

}
