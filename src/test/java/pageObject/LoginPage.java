package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
public LoginPage(WebDriver d)
{
	driver = d;
	PageFactory.initElements(d, this);
}

@FindBy(xpath="//span[text()='My Account']")
WebElement MyAccount;

@FindBy(linkText="Login")
WebElement loginlink;

@FindBy(id="input-email")
WebElement Emailid;

@FindBy(id="input-password")
WebElement pwd;

@FindBy(xpath="//input[@value='Login']")
WebElement loginbtn;

@FindBy(linkText="Edit your account information")
WebElement Edit_your_account_information;

@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
WebElement Email_not_match_msg;

public void sendEmail(String email)
{
	Emailid.sendKeys(email);
}
public void sendpsd(String psd)
{
	pwd.sendKeys(psd);
}
public void clicklogin()
{
	loginbtn.click();
}
public void MyAccountClick()
{
	MyAccount.click();
}
public void loginlink()
{
	loginlink.click();
}
public Boolean loginsuccessfuly()
{
	Boolean flag= Edit_your_account_information.isDisplayed();
	
	return flag;
}
public String warningmsg()
{
	return Email_not_match_msg.getText();
}




}
