package hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigUtils;

public class MyHooks {
	WebDriver driver;

	@Before
	public void setup() throws IOException
	{
		Properties prop1= ConfigUtils.configReader();
		 DriverFactory.initializeBrowser(prop1.getProperty("browser"));
		 driver =DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop1.getProperty("url"));
	}
	@After
	public void tearDown()   
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
