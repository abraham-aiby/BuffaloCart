package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.UserDetailsPage;

//import Pages.LoginPage;

public class UserDetailsPageTest {
	
	
	static WebDriver driver;
	
@Test	
public void userDetailsPageTest()
{
	
	UserDetailsPage userdetailspgobj = new UserDetailsPage(driver);
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	userdetailspgobj.BuffaloCartAllusers();
	userdetailspgobj.BuffaloCartSearchcolumns("Sneha");
	userdetailspgobj.BuffaloCartIdentifyName();
}
	/*
	@AfterMethod
	 public void aftMet()
	  {
	    driver.close();
	  }
*/
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://buffalocart.com/demo/erp/admin/dashboard");
		
	}}
