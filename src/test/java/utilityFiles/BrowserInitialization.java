package utilityFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjectFiles.LoginPage;
import PageObjectFiles.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInitialization {

	public static String browser="Chrome";
	public static WebDriver driver;
	public RegistrationPage rp;
	public LoginPage lp;
	
	public static void browser_open(String browserr)
	{
	  switch(browser)
	  {
		case "Chrome":
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
			
		  try
		  {
			if((browserr.length()==0 )||(!browserr.contains(".") ||(!browserr.contains("com"))||(!browserr.contains("https"))))
			{
			   throw new URLException("URL is Incorrect");
			}
			else
			{
			  driver.get(browserr);
			  driver.manage().window().maximize();
			  break;
			}
		  }
		  
		  catch(URLException E)
		  {
			System.out.println(E);
			driver.get(browserr);
			break;
		  }
			
		case "IE":
		   WebDriverManager.iedriver().setup();
		   driver= new InternetExplorerDriver();
		   break;			
	  }	
   }
	
	public static void browser_close()
	{
		driver.close();
	}
 }