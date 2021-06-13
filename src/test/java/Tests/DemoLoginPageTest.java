package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class DemoLoginPageTest {
	
	static WebDriver driver;
	
	public static void main(String args[])
	{
		demoLoginPageTest();
	}
public static void demoLoginPageTest()
{
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://buffalocart.com/demo/erp/admin/dashboard");
	
	LoginPage loginpgobj = new LoginPage(driver);
	loginpgobj.BuffaloCartUsernameLogin("admin"); 
	loginpgobj.BuffaloCartPasswordLogin("123456");
	loginpgobj.BuffaloCartSignin();
	driver.close();
}
}

