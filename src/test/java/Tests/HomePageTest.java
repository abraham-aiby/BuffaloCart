package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest {
	
	static WebDriver driver;
	
	
@Test
public void homePageTest()
{
	//LoginPage lp = new LoginPage();
	//lp.loginPageTest();
    HomePage homepgobj = new HomePage(driver);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	homepgobj.BuffaloCartSearchTextbox("user");
	homepgobj.BuffaloCartUsersTextbox();
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