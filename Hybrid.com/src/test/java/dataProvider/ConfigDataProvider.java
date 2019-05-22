package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import factory.BrowserFactory;

public class ConfigDataProvider extends BrowserFactory{
	
	Properties pro;
	public ConfigDataProvider() 
	{
		File src= new File("./Configuration/config.properties");
		try {FileInputStream fis= new FileInputStream(src);
		pro= new Properties();
		pro.load(fis);
		
		}
		catch (Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
		
		
	}
	
	public String getApplicationUrl()
	{
		String data= pro.getProperty("url");
	    return data;
	}
	
	public String chromePath()
	{
		String data= pro.getProperty("chromePath");
	    return data;
	}

}
