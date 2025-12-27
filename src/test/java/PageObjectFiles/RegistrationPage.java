package PageObjectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityFiles.BrowserInitialization;

public class RegistrationPage extends BrowserInitialization{

	public RegistrationPage (WebDriver driver)
	{
	   BrowserInitialization.driver = driver;
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	@CacheLookup
	WebElement registerLink;
	
	@FindBy(xpath="//div[@id='rightPanel']")
	@CacheLookup
	WebElement registrationPage;
	
	@FindBy(name="customer.firstName")
	@CacheLookup
	WebElement firstnameFiled;
	
	@FindBy(id="customer.lastName")
	@CacheLookup
	WebElement lastnameField;
	
	@FindBy(name="customer.address.street")
	@CacheLookup
	WebElement addressField;
	
	@FindBy(name="customer.address.city")
	@CacheLookup
	WebElement cityField;
	
	@FindBy(name="customer.address.state")
	@CacheLookup
	WebElement stateField;
	
	@FindBy(name="customer.address.zipCode")
	@CacheLookup
	WebElement zipcodeField;
	
	@FindBy(name="customer.phoneNumber")
	@CacheLookup
	WebElement phoneField;
	
	@FindBy(name="customer.ssn")
	@CacheLookup
	WebElement ssnField;
	
	@FindBy(name="customer.username")
	@CacheLookup
	WebElement usernameField;
	
	@FindBy(name="customer.password")
	@CacheLookup
	WebElement passwordField;
	
	@FindBy(name="repeatedPassword")
	@CacheLookup
	WebElement confirmPassField;
	
	@FindBy(xpath="//input[@value='Register']")
	@CacheLookup
	WebElement registerButton;
	
	@FindBy(linkText="Log Out")
	@CacheLookup
	WebElement logoutButton;
	
	
	public void registerLink()
	{
		registerLink.click();
	}
	
	public void registrationPage()
	{
	   if (!registrationPage.isDisplayed())
	   {
		 System.out.println("Registration Link is not working");
	   }
	}
	
	public void fname_lname(String fname, String lname)
	{ 
		firstnameFiled.sendKeys(fname);
		lastnameField.sendKeys(lname);
	}
	
	public void adress_city_state(String add, String city, String state)
	{ 
		addressField.sendKeys(add);
		cityField.sendKeys(city);
		stateField.sendKeys(state);
	}
	
	public void zip_phone_ssn(String zip, String phone, String ssn)
	{ 
		zipcodeField.sendKeys(zip);
		phoneField.sendKeys(phone);
		ssnField.sendKeys(ssn);
	}
	
	public void uname_pass_cpass(String uname, String pass, String cpass)
	{ 
		usernameField.sendKeys(uname);
		passwordField.sendKeys(pass);
		confirmPassField.sendKeys(cpass);
	}
	
	public void registerButton()
	{
		registerButton.click(); 
	}
	
	public void logoutButton()
	{
		logoutButton.click(); 
	}
	
}
