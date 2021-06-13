package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginPageTest {
	
	static WebDriver driver;
	
@Test	
public void loginPageTest()
{
	
	LoginPage loginpgobj = new LoginPage(driver);
	loginpgobj.BuffaloCartUsernameLogin("admin"); 
	loginpgobj.BuffaloCartPasswordLogin("123456");
	loginpgobj.BuffaloCartSignin();
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
