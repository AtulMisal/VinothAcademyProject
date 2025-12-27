package PageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityFiles.BrowserInitialization;

public class LoginPage extends BrowserInitialization {

	public LoginPage(WebDriver driver)
	{
		BrowserInitialization.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement userNameField;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement passField;
	
	@FindBy(xpath="//input[@value='Log In']")
	@CacheLookup
	WebElement logInButton;
	
	
	public void credentials(String uname, String pass)
	{
		userNameField.sendKeys(uname);
		passField.sendKeys(pass);
	}
	
	public void loginButton() 
	{
		logInButton.click();
	}
}
