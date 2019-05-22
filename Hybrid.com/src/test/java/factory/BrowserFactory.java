package factory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) throws Exception
	{
	if(browserName.equalsIgnoreCase("chrome"))
	{
		//ConfigDataProvider config= new ConfigDataProvider();
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getconfig().chromePath());
		driver= new ChromeDriver();
	}
	
	if(browserName.equalsIgnoreCase("firefox"))
	{
		//ConfigDataProvider config= new ConfigDataProvider();
		//System.setProperty("webdriver.chrome.driver", DataProviderFactory.getconfig().chromePath());
		driver= new FirefoxDriver();
	}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
}

public static void closeBrowser(WebDriver ldriver)
{
	ldriver.quit();
}

}
