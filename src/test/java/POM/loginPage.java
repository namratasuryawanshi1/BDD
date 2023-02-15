package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	public loginPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id="Email")private WebElement email;
	@FindBy(id="Password") private WebElement password;
	@FindBy(xpath="//button[@class='button-1 login-button']")private WebElement  loginbutton;
	@FindBy(xpath="//a[@text()='Logout']")private WebElement logoutbutton; 
	
	
	public void enterEmail(String emailAdd)
	{	
		email.clear();
		email.sendKeys(emailAdd);
		
	}
	public void enterpwd(String pwd)
	{	password.clear();
		password.sendKeys(pwd);
		
	}
	public void clickonlogin()
	{
		loginbutton.click();
		
	}
	
	public void clickonlogout()
	{
		logoutbutton.click();
		
	}
}
