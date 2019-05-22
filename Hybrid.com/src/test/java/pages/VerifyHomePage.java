package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage extends BrowserFactory{
	@BeforeMethod
	public void setUp() throws Exception
	{

		driver= BrowserFactory.getBrowser("chrome");
	    driver.get(DataProviderFactory.getconfig().getApplicationUrl());
	}
		
	@Test
	public void testHomePage() throws Exception
	{
	    Homepage home= PageFactory.initElements(driver, Homepage.class);
	    String title= home.getApplicationTitle();
	    System.out.println(title);
	    Assert.assertTrue(title.contains("Log In"));


	}


	@AfterMethod
	public void tearDown()
	{
		 BrowserFactory.closeBrowser(driver);
	}

}
