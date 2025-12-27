package stepDefinationFiles;

import java.util.List;

import PageObjectFiles.LoginPage;
import PageObjectFiles.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityFiles.BrowserInitialization;


public class StepDefinations extends BrowserInitialization{

	 
	@Given("User launches the appliaction {string}")
	public void user_launches_the_appliaction(String url) 
	{
		BrowserInitialization.browser_open(url);
	}

	@When("User clicks on Register link")
	public void user_clicks_on_register_link() 
	{
	   rp = new RegistrationPage(driver);
	   rp.registerLink();
	}

	@Then("User will get the registration window on same page")
	public void user_will_get_the_registration_window_on_same_page() 
	{
	   rp.registrationPage();
	}

	@When("User enters firstName as {string} and lastName as {string}")
	public void user_enters_first_name_as_and_last_name_as(String fname, String lname) 
	{
	  rp.fname_lname(fname, lname); 
	}

	@When("User enters address as {string} and city as {string} and state as {string}")
	public void user_enters_address_as_and_city_as_and_state_as(String add, String city, String state) 
	{
	   rp.adress_city_state(add, city, state);
	}

	@When("User enters zip code as {string} and phone number as {string} and ssn as {string}")
	public void user_enters_zip_code_as_and_phone_number_as_and_ssn_as(String zip, String phone, String ssn) 
	{
	  rp.zip_phone_ssn(zip, phone, ssn); 
	}

	@When("User enters userName as {string} and password as {string} and confirms password as {string}")
	public void user_enters_user_name_as_and_password_as_and_confirms_password_as(String uname, String pass, String cpass) 
	{
	  rp.uname_pass_cpass(uname, pass, cpass); 
	}

	@When("Clicks on register button")
	public void clicks_on_register_button() 
	{
	  rp.registerButton();
	}

	@Then("User will get successful registration message.")
	public void user_will_get_successful_registration_message() 
	{
	   if (driver.getTitle().equals("ParaBank | Customer Created"))
	   {
		 System.out.println("User is created");
	   }
	   else
	   {
		 System.out.println("User is not created please check");
	   }
	}

	@Then("User clicks on logout button")
	public void user_clicks_on_logout_button() 
	{
	   rp.logoutButton();
	}

	@Then("User closes the application")
	public void user_closes_the_application() throws InterruptedException 
	{
	   driver.close(); 
	   Thread.sleep(5000);
	}
	
	// --------------------------------------------- Log In Page ---------------------------------------------
	
	@Given("User launches the app {string}")
	public void user_launches_the_app(String url)
	{
		BrowserInitialization.browser_open(url);
		lp = new LoginPage(driver);
	}
	
	@When("User enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) 
	{
	   List<List<String>> data = dataTable.cells(); 
	   lp.credentials(data.get(0).get(0), data.get(0).get(1));
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() 
	{
	   lp.loginButton();
	}

	@Then("User should succesfully logged in to the application")
	public void user_should_succesfully_logged_in_to_the_application() 
	{
		if (driver.getTitle().equals("ParaBank | Accounts Overview"))
		   {
			 System.out.println("Loged In");
		   }
		   else
		   {
			 System.out.println("Not Logged In");
		   }  
		BrowserInitialization.browser_close();
	}
	
}
