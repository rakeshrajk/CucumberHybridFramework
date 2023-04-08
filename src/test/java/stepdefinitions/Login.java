package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class Login {
	WebDriver driver;
  LoginPage loginpage;
	
	
	@Given("User has navigated to login page")
	public void User_has_navigated_to_login_page()
	{
		
		driver =DriverFactory.getDriver();
		loginpage= new LoginPage(driver);
		loginpage.MyAccountClick();
		loginpage.loginlink();
		
		
	}
	@When("Users enter valid email address {string} into email field")
	public void users_enter_valid_email_address_into_email_field(String email) {
		
		loginpage.sendEmail(email);
	   
	}

	@When("User has entered valid password {string} into password vield")
	public void user_has_entered_valid_password_into_password_vield(String pwd) {
		loginpage.sendpsd(pwd);
	   
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
	   
		loginpage.clicklogin();
	}

	@Then("User should get successfully loged in")
	public void user_should_get_successfully_loged_in() {
		Assert.assertTrue(loginpage.loginsuccessfuly());
		
	    
	}

	@When("Users enter invalid email address {string} into email field")
	public void users_enter_invalid_email_address_into_email_field(String InvalidEmail) {
		loginpage.sendEmail(InvalidEmail);
	}

	@When("User has entered invalid password {string} into password vield")
	public void user_has_entered_invalid_password_into_password_vield(String InvalidPassword) {
		loginpage.sendpsd(InvalidPassword);
	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
	   Assert.assertTrue(loginpage.warningmsg().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	@When("Users dont enter email address into email field")
	public void users_dont_enter_email_address_into_email_field() {
		loginpage.sendEmail("");
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
		loginpage.sendpsd("");
	}

	

}
