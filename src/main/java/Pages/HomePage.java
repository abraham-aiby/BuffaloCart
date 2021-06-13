package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(id="s-menu")
	public WebElement searchtextbox;
	
	
	@FindBy(xpath="//a[@title='User']")
	public WebElement userstextbox ;
	
	public HomePage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void BuffaloCartSearchTextbox(String text)
	{
		searchtextbox.sendKeys(text);
	}
	public void BuffaloCartUsersTextbox()
	{
		userstextbox.click();
	}
}
