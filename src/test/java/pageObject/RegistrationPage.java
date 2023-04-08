package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath="//span[text()='My Account']")
	WebElement MyAccount;

	@FindBy(linkText="Register")
	WebElement Registerlink;

	@FindBy(id="input-firstname")
	WebElement firstname;

	@FindBy(id="input-lastname")
	WebElement lastname;

	@FindBy(id="input-email")
	WebElement email;

	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-password")
	WebElement inputpsd;
	@FindBy(id="input-confirm")
	WebElement cinfmpsd;
	

	@FindBy(xpath="//input[@name='agree']")
	WebElement privacypolicy;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement createdSuccessfully;

	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	WebElement Newsletter;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	WebElement Duplicatedwarningemail;

	

	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	WebElement agree_to_the_Privacy_Policy;
	

	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	WebElement Errorfirstname;

	

	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	WebElement Errorinputlastname;

	

	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	WebElement Errorinputemail;

	

	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	WebElement Errorinputtelephone;

	

	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	WebElement Errorinputpassword;

	public void MyAccountClick()
	{
		MyAccount.click(); 
	}
    public void Register()
	{
		Registerlink.click();
	}
	public void firstname(String name)
	{
		firstname.sendKeys(name); 
	}
	public void lastname(String latname)
	{
		lastname.sendKeys(latname); 
	}
	public void email(String email1)
	{
		email.sendKeys(email1); 
	}
	public void telephone(String tele)
	{
		telephone.sendKeys(tele); 
	}
	public void inputpsd(String inputpsd1)
	{
		inputpsd.sendKeys(inputpsd1); 
	}
	public void cinfmpsd(String cinfmpsd1)
	{
		cinfmpsd.sendKeys(cinfmpsd1); 
	}
	
	public void SelectPolicy()
	{
		privacypolicy.click(); 
	}
	
	public void ClickContinue()
	{
		continuebtn.click(); 
	}
	
	public String AccountCreatedSuccessfuly()
	{
		return createdSuccessfully.getText();
	}
	
	public void NewsLetterSelection()
	{
		Newsletter.click(); 
	}
	public String Duplicateemail()
	{
		return Duplicatedwarningemail.getText();
	}
	
	public String agree_to_the_Privacy_Policy()
	{
		return agree_to_the_Privacy_Policy.getText();
	}
	public String Errorfirstname()
	{
		return Errorfirstname.getText();
	}
	public String Errorinputlastname()
	{
		return Errorinputlastname.getText();
	}
	public String Errorinputemail()
	{
		return Errorinputemail.getText();
	}
	public String Errorinputtelephone()
	{
		return Errorinputtelephone.getText();
	}
	public String Errorinputpassword()
	{
		return Errorinputpassword.getText();
	}
	
}
