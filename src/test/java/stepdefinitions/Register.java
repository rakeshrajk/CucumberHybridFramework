package stepdefinitions;

import java.util.Map;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RegistrationPage;

public class Register {
	WebDriver driver;
	RegistrationPage registrationPage;
	
	@Given("User navigate to Registration Account page")
	public void user_navigate_to_registration_account_page() {
		driver =DriverFactory.getDriver();
		registrationPage= new RegistrationPage(driver);
		registrationPage.MyAccountClick();
		registrationPage.Register();
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
	    
	Map<String, String>	Neha = dataTable.asMap(String.class, String.class);
	registrationPage.firstname(Neha.get("firstName"));
	registrationPage.lastname(Neha.get("lastNmae"));
	registrationPage.email(Neha.get("email"));
	registrationPage.telephone(Neha.get("telephone"));
	registrationPage.cinfmpsd(Neha.get("password"));
	registrationPage.inputpsd(Neha.get("password"));
	}

	@When("User select privacy policy")
	public void user_select_privacy_policy() {
		registrationPage.SelectPolicy();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		registrationPage.ClickContinue();
	   
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		Assert.assertEquals("Your Account Has Been Created!",registrationPage.AccountCreatedSuccessfuly()); 
	    
	}

	@When("User selects yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
		registrationPage.NewsLetterSelection();
	}

	@Then("User should get a proper warning about duplicate email")
	public void user_should_get_a_proper_warning_about_duplicate_email() {
		 Assert.assertTrue(registrationPage.Duplicateemail().contains("Warning: E-Mail Address is already registered!"));
			
	    
	}

	@When("User dont enters any details into fields")
	public void user_dont_enters_any_details_into_fields() {
	    //intentionally kept blank
	}

	@When("Clicks on continue button")
	public void clicks_on_continue_button() {
		registrationPage.ClickContinue();
	}

	@Then("User should get a proper warning message for every mandatory field")
	public void user_should_get_a_proper_warning_message_for_every_mandatory_field() {
		
		
		 Assert.assertTrue(registrationPage.agree_to_the_Privacy_Policy().contains("Warning: You must agree to the Privacy Policy!"));  
	     Assert.assertEquals("First Name must be between 1 and 32 characters!", registrationPage.Errorfirstname());
	     Assert.assertEquals("Last Name must be between 1 and 32 characters!", registrationPage.Errorinputlastname());
	     Assert.assertEquals("E-Mail Address does not appear to be valid!", registrationPage.Errorinputemail());
	     Assert.assertEquals("Telephone must be between 3 and 32 characters!", registrationPage.Errorinputtelephone());
	     Assert.assertEquals("Password must be between 4 and 20 characters!", registrationPage.Errorinputpassword());
	
	
	
	}


}
