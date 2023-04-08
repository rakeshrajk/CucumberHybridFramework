package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

WebDriver driver;
	
	public SearchPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="//input[@name='search']")
	WebElement productSearch;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement Searchbtn;
	
	@FindBy(linkText="HP LP3065")
	WebElement ProductDisplayed;
	
	@FindBy(xpath="//input[@id='button-search']/following-sibling::p")
	WebElement no_product_matching;
	
	public void productSearch(String Productname)
	{
		productSearch.sendKeys(Productname); 
	}
	public void ClickonSearchBtn()
	{
		Searchbtn.click(); 
	}
	public Boolean productdisplayed()
	{
		Boolean flag= ProductDisplayed.isDisplayed();
		
		return flag;
	}
	public String no_product_matching()
	{
		return no_product_matching.getText();
	}
	

	
	
}
