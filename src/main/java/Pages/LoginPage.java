package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="user_name")
	public WebElement usernamelogin ;
	
	@FindBy(name="password")
	public WebElement passwordlogin ;
	
	@FindBy(xpath="//button[@name='mark_attendance']//preceding::button")
	public WebElement loginsubmit ;
	
	public LoginPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void BuffaloCartUsernameLogin(String text)
	{
	usernamelogin.sendKeys(text);
	}
	
	public void BuffaloCartPasswordLogin(String text)
	{
		passwordlogin.sendKeys(text);
	}
	
	public void BuffaloCartSignin()
	{
		loginsubmit.click();//sendKeys(Keys.RETURN);
	}
}
