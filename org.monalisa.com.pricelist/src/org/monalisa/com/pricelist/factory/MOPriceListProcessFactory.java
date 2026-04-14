package org.monalisa.com.pricelist.factory;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.M_PriceList_Create;
import org.compiere.process.ProcessCall;
import org.monalisa.com.pricelist.process.MO_PriceList_Create;

public class MOPriceListProcessFactory implements IProcessFactory
{
	@Override
	public ProcessCall newProcessInstance(String className)
	{
		if (M_PriceList_Create.class.getName().equals(className))
			return new MO_PriceList_Create();
		return null;
	}
}
