package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {

	
	@Test
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\altaf\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.yahoo.com");
		
		
	}

}
