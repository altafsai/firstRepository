package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import factory.BrowserFactory;

public class Screenshot extends BrowserFactory{
	

	public String Screenshot(String name) throws Exception
	{
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		String dest= "C:\\Users\\altaf\\eclipse-workspace-practice\\com.hybrid.com\\Screenshots\\"+name+System.currentTimeMillis()+".png";
		File destination= new File(dest);
		FileUtils.copyFile(src, destination);
		return dest;
	}

}
