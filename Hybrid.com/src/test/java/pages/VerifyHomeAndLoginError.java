package pages;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomeAndLoginError extends BrowserFactory{
	@BeforeMethod
	public void setUp() throws Exception
	{

		driver= BrowserFactory.getBrowser("chrome");
		//driver= new FirefoxDriver();
	    driver.get(DataProviderFactory.getconfig().getApplicationUrl());
	}
		
	@Test
	public void testHomePage() throws Exception
	{
	    Homepage home= PageFactory.initElements(driver, Homepage.class);
	    String title= home.getApplicationTitle();
	    System.out.println(title);
	    Assert.assertTrue(title.contains("Log In"));
	    home.clickOnEmail(DataProviderFactory.getexcel().getData(0, 0));
	    //home.clickOnEmail("altafff");
        home.clickOnPassword(DataProviderFactory.getexcel().getData(0, 1));
        //home.clickOnPassword("altaffff");
        home.click();
	    Thread.sleep(5000);

	    LoginErrorPage loginError= PageFactory.initElements(driver, LoginErrorPage.class);
	    System.out.println(loginError.applicationTitle());
	    loginError.verifyError();
	    Thread.sleep(5000);
	    


	}


	@AfterMethod
	public void tearDown()
	{
		 BrowserFactory.closeBrowser(driver);
	}

}
