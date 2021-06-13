package Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileCreationPage {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath="//a[text()='New User']")//xpath
    public WebElement newusertext;
	
    @FindBy(name="fullname")
	public WebElement fullname;
    
    
    @FindBy(id="check_employment_id")
    public WebElement employmentid;
	
	
    @FindBy(id="check_username")
    public WebElement username;
	
	
    @FindBy(id="new_password")
    public WebElement password;
	
	
    @FindBy(name="confirm_password")
    public WebElement confirmpassword;
	
	
    @FindBy(id="check_email_addrees")
    public WebElement email;
	
    @FindBy(xpath="//span[text()='English (United States)']")
    public WebElement localeddown;
    
   
	
    @FindBy(xpath="//li[@class='select2-selection__rendered']")//dropdown
    //select2-language-ls-container
    public WebElement languageddown;
	
	
    @FindBy(name="phone")
    public WebElement phone;
	
	
    @FindBy(name="mobile")
    public WebElement mobile;
	
	
    @FindBy(name="skype")
    public WebElement skype;
	
	
	@FindBy(name="avatar")//Robot
    public WebElement profilephoto;
	
	
   @FindBy(id="user_type")//dropdown
    public WebElement usertypeddown;
	
	
    @FindBy(xpath="//span[@class='filter-option pull-left']")//dropdown
    public WebElement directionddown;
    
    @FindBy(xpath="//span[@title ='Select Designation']")//select2-designations_id-qs-container
    public WebElement designationddown;
    
    @FindBy(xpath="//option[@Value='1'and text()='Manager']")
    public WebElement desiginput;
    
    @FindBy(xpath="//input[@name='department_head_id']//following::span")
    public WebElement deptheadchkbox;
	
    @FindBy(xpath="//input[@name='permission']//following::span")//radiobutton
    public WebElement permissionradiobtn1 ;
	
	
    @FindBy(xpath="//button[text()='Create User']")
    public WebElement createuserbutton;
	
	public ProfileCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void BuffaloCartNewuser()
	{
		newusertext.click();//sendKeys(Keys.RETURN);
	}
	
	public void BuffaloCartFullName(String text)
	{
		fullname.sendKeys(text);
	}
	
	public void BuffaloCartEmploymentid(String text)
	{
		employmentid.sendKeys(text);
	}
	public void BuffaloCartUsername(String text)
	{
		username.sendKeys(text);
	}
	public void BuffaloCartPassword(String text)
	{
		password.sendKeys(text);
	}
	public void BuffaloCartConfirmPassword(String text)
	{
		confirmpassword.sendKeys(text);
	}
	public void BuffaloCartEmail(String text)
	{
		email.sendKeys(text);
	}
	public void BuffaloCartPhone(String text)
	{
		phone.sendKeys(text);
	}
	public void BuffaloCartMobile(String text)
	{
		mobile.sendKeys(text);
	}
	public void BuffaloCartSkype(String text)
	{
		skype.sendKeys(text);
	}
	public void BuffaloCartProfilephoto(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(profilephoto).click().build().perform();
	}
	public void BuffaloCartUsertype(String text)
	{
		Select select = new Select(usertypeddown);
		select.selectByVisibleText(text);
		//driver.findElement(usertypeddown).sendKeys(text);
	}
	
	public void BuffaloCartLocaleddown(String text)
	{
		localeddown.click();
		//input.sendkeys(text);
		languageddown.click();
		
	}
	
	public void BuffaloCartLanguageddown(String text)
	{
		Select select = new Select(languageddown);
		select.selectByVisibleText(text);
		//driver.findElement(languageddown).sendKeys(text);
	}
	public void BuffaloCartDirection(String text)
	{
		Select select = new Select(directionddown);
		select.selectByVisibleText(text);
		//driver.findElement(directionddown).sendKeys(text);
	}
	
	public void BuffaloCartDesignationddown()
	{
		designationddown.click();
		desiginput.click();
		
		
	}
	
	
	public void BuffaloCartCreateuserbutton() 
	{
		createuserbutton.click();
	}
	
}
