package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	WebDriver driver;
	public Homepage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath="//input[@data-testid='royal_email'][@name='email']") WebElement email;
	@FindBy(xpath="//input[@data-testid='royal_pass'][@name='pass']") WebElement password;
	@FindBy(xpath="//input[@aria-label='Log In']") WebElement click;

	public void clickOnEmail(String data)
	{
		email.sendKeys(data);
	}

	public void clickOnPassword(String data)
	{
		password.sendKeys(data);
	}

	public void click()
	{
		click.sendKeys(Keys.ENTER);
	}

	public String getApplicationTitle()
	{
		return driver.getTitle();
	}

}
