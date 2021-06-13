package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='All Users']")
	public WebElement allusers;
	
	@FindBy(xpath="//input[@type='search'and@class='form-control input-sm']")
	public WebElement searchcolumns;
	
	@FindBy(xpath="//a[text()='Sneha Mathew']")
	public WebElement identifyname;
	
	
	public UserDetailsPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void BuffaloCartAllusers()
	{
		allusers.click();
	}
	
	public void BuffaloCartSearchcolumns(String text)
	{
		searchcolumns.sendKeys(text);
	}
	
	public void BuffaloCartIdentifyName()
	{
		identifyname.click();
	}
}
