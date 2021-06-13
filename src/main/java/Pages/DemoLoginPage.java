package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class DemoLoginPage {
	WebDriver driver;
	
	By usernamelogin = By.name(("user_name"));
	
	By passwordlogin = By.name(("password"));
	
	By loginsubmit = By.xpath(("//button[@name='mark_attendance']//preceding::button"));
	
	public DemoLoginPage(WebDriver driver )
	{
		this.driver=driver;
	}
	
	public void BuffaloCartDemoUsernameLogin(String text)
	{
		driver.findElement(usernamelogin).sendKeys(text);
	}
	
	public void BuffaloCartDemoPasswordLogin(String text)
	{
		driver.findElement(passwordlogin).sendKeys(text);
	}
	
	public void BuffaloCartDemoSignin()
	{
		//driver.findElement(loginsubmit).sendKeys(Keys.RETURN);
		driver.findElement(loginsubmit).click();
	}
}

