
package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ProfileCreationPage;

public class ProfileCreationPageTest {
	
	
	
	static WebDriver driver;
	
@Test	
public void profileCreationPageTest()
{
	

	ProfileCreationPage profilecrtnpgobj = new ProfileCreationPage(driver);
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	profilecrtnpgobj.BuffaloCartNewuser();
	profilecrtnpgobj.BuffaloCartFullName("Aiby Ann Abraham");
	profilecrtnpgobj.BuffaloCartEmploymentid("131122");
	profilecrtnpgobj.BuffaloCartUsername("aabraham");
	profilecrtnpgobj.BuffaloCartPassword("aabraham123456");
	profilecrtnpgobj.BuffaloCartConfirmPassword("aabraham123456");
	profilecrtnpgobj.BuffaloCartEmail("xyz123@gmail.com");
	//profilecrtnpgobj.BuffaloCartLocaleddown();profilecrtnpgobj.BuffaloCartLocaleddownItems();
	//profilecrtnpgobj.BuffaloCartLanguageddown("English");
	profilecrtnpgobj.BuffaloCartPhone("8281888888");
	profilecrtnpgobj.BuffaloCartMobile("8281888888");
	profilecrtnpgobj.BuffaloCartSkype("aaiby_skype");
	//profilecrtnpgobj.BuffaloCartProfilephoto(driver);
	profilecrtnpgobj.BuffaloCartUsertype("Staff");
	profilecrtnpgobj.BuffaloCartDesignationddown();
	//profilecrtnpgobj.BuffaloCartDirection("LTR");
    //profilecrtnpgobj.BuffaloCartDeptheadchkbox();
	//profilecrtnpgobj.BuffaloCartPermission();
	profilecrtnpgobj.BuffaloCartCreateuserbutton();
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
