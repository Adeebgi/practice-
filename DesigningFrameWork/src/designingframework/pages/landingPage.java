package designingframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import designingFrameWrok.AbstractPage.Abstract;

public class landingPage extends Abstract{
	WebDriver driver;
	public landingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(css="#userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userpassword;
	
	@FindBy(id="login")
	WebElement login;


public void LoginToApplication(String email,String password) 
{
	userEmail.sendKeys(email);
	userpassword.sendKeys(password);
	login.click();	
}

public void goTO()
{
	driver.get("https://rahulshettyacademy.com/client");
}
}