package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SearchPage;

public class Search {
	
	WebDriver driver;
	SearchPage searchPage;
	
	@Given("User open the Application")
	public void user_open_the_application() {
		driver =DriverFactory.getDriver();
		searchPage = new SearchPage(driver);
	}

	@When("User enters valid product {string} into search box field")
	public void user_enters_valid_product_into_search_box_field(String productDetail) {
		searchPage.productSearch(productDetail); 
	}

	@When("User clicks on the Search button")
	public void user_clicks_on_the_search_button() {
		searchPage.ClickonSearchBtn();
	}

	@Then("User should get valid product displayed in search result")
	public void user_should_get_valid_product_displayed_in_search_result() {
	    Assert.assertTrue(searchPage.productdisplayed());
	} 

	@When("User enters invalid product {string} into search box field")
	public void user_enters_invalid_product_into_search_box_field(String invalidproduct) {
		searchPage.productSearch(invalidproduct); 
	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	    Assert.assertEquals("There is no product that matches the search criteria.", searchPage.no_product_matching());
	}

	@When("User dont enter any product name into the search box field")
	public void user_dont_enter_any_product_name_into_the_search_box_field() {
	    
	}


}
