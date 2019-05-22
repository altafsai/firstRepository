package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

public class DataProviderFactory {
	public static ConfigDataProvider getconfig() throws Exception
	{
		ConfigDataProvider config= new ConfigDataProvider();
		return config;
	}
	

	public static ExcelDataProvider getexcel() throws Exception
	{
		ExcelDataProvider excel= new ExcelDataProvider();
		return excel;
	}

}
