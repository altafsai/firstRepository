package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginErrorPage {
	WebDriver driver;
	public LoginErrorPage(WebDriver Idriver)
	{
		this.driver=Idriver;
	}

	//By Error= By.xpath("//div[@id='globalContainer']/div[3]/div/div/div");
	By Error= By.xpath("//a[@class='_42ft _4jy0 _62c3 _4jy4 _517h _51sy']");
		
	public void verifyError()
	{
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(Error));
		String text=element.getText();
		Assert.assertEquals(text, "The password you’ve entered is incorrect. Forgot Password?", "	different");
	}

	public String applicationTitle()
	{
		return driver.getTitle();
	}
}
