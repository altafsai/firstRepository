package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;



import factory.BrowserFactory;
import factory.DataProviderFactory;
import utility.Screenshot;

public class VerifyHomeAndLoginError2withReportVersion3 extends BrowserFactory{
	
	//ExtentReports report;
	//ExtentTest logger;
		
		
		//@BeforeMethod
		public void setUp() throws Exception
		{   
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\altaf\\eclipse-workspace-practice\\Hybrid.com\\Reports\\Report1.html");
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);


			//report= new ExtentReports("C:\\Users\\altaf\\eclipse-workspace-practice\\Hybrid.com\\Reports\\Report1.html", true);
			//logger= report.startTest("Verification");
	        driver= BrowserFactory.getBrowser("chrome");
		    driver.get(DataProviderFactory.getconfig().getApplicationUrl());
		    logger.log(LogStatus.INFO, "Application is running");
		}
/*			
		//@Test
		public void testHomePage() throws Exception
		{
		    Homepage home= PageFactory.initElements(driver, Homepage.class);
		    String title= home.getApplicationTitle();
		    System.out.println(title);
		    Assert.assertTrue(title.contains("Log In"));
		    Screenshot ut= new Screenshot();
		    //String info= sc.
		    //String p= Screenshot.Screenshot("n");
		    //logger.log(LogStatus.INFO, logger.addScreenCapture(ut.Screenshot("info")));
		    //logger.log(LogStatus.PASS, "Title verified");
		    home.clickOnEmail(DataProviderFactory.getexcel().getData("Sheet1", 0, 0));
		    home.clickOnPassword(DataProviderFactory.getexcel().getData("Sheet1", 0, 1));
		    home.click();
		    //logger.log(LogStatus.PASS, "login successfully");
		    Thread.sleep(5000);

		    LoginErrorPage loginError= PageFactory.initElements(driver, LoginErrorPage.class);
		    System.out.println(loginError.applicationTitle());
		    //logger.log(LogStatus.FAIL, "Error is identified");
		    loginError.verifyError();
		    //logger.log(LogStatus.PASS, "Error is identified");
		    Thread.sleep(5000);
		    


		}


		//@AfterMethod
		public void tearDown(ITestResult result) throws Exception
		{
			if(ITestResult.FAILURE==result.getStatus())
			{   Screenshot ut= new Screenshot();
				String temp= ut.Screenshot(result.getName());
				//logger.log(LogStatus.FAIL, logger.addScreenCapture(temp));
			}
			
			 BrowserFactory.closeBrowser(driver);
			 //.endTest(logger);
			 //report.flush();
		}*/

}
