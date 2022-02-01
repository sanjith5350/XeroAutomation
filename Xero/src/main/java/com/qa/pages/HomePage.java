package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class HomePage extends TestBase {

	
	
	
	@FindBy(xpath="//div[@class='Responsive__Wrapper-sc-19pjhln-0 cWaBAA']//a[@class='Button__Element-lxf8rm-0 ftKSfc Button'][normalize-space()='Log in']")
	WebElement lognBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public LoginPage clickonlogin() {
		
		lognBtn.click();
		return new LoginPage();
		
		
}
}
