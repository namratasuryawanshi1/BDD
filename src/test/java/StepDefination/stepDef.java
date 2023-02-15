package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.loginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDef {
	public WebDriver driver;
	public loginPage loginpg;
@Given("User launch Chrome browser")

public void user_launch_chrome_browser() 
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	loginpg =new loginPage(driver);
}

@When("User open url {string}")
public void user_open_url(String url) 
{
	driver.get(url);
}
    

@When("User enters email as {string} and password as {string}")
public void user_enters_email_as_and_password_as(String emailAdd, String pwd) 
{
	loginpg.enterEmail(emailAdd);
	loginpg.enterpwd(pwd);
}
    

@When("click on login")
public void click_on_login() 
{
	loginpg.clickonlogin();
}
   

@Then("page title should be {string}")
public void page_title_should_be(String expected) 
{
	String actualTitle=driver.getTitle();
	
	if(actualTitle.equalsIgnoreCase(expected))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertFalse(false);
	}
}
    

@When("User click on log out link")
public void user_click_on_logout_link() 
{
	loginpg.clickonlogout();
}
    
@Then("close browser")
public void close_browser() 
{
	driver.close();
	driver.quit();
}
    


}
