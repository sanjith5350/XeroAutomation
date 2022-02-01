package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//input[@id='xl-form-email']")
	WebElement username;
	@FindBy(xpath="//input[@id='xl-form-password']")
    WebElement password;
	@FindBy(xpath="//button[@id='xl-form-submit']")
	WebElement submitBtn;
	
	public LoginPage()
	
	{
		PageFactory.initElements(driver, this);
		
	}
	public String dashboardTitle() {
		return driver.getTitle();
	}


	
	public DashboardPage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		return new DashboardPage();
		
}
}