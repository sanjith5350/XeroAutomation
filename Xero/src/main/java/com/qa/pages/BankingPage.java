package com.qa.pages;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class BankingPage extends TestBase {
	
	@FindBy(xpath="//input[@id='accountname-1025-inputEl']")
	WebElement accountName;
	@FindBy(xpath="//input[@id='accounttype-1027-inputEl']")
    WebElement accountType;
	@FindBy(xpath="//input[@id='accountnumber-1056-inputEl']")
    WebElement accountNumber;
	
	@FindBy(xpath="//span[@id='common-button-submit-1015-btnInnerEl']")
	WebElement continueBtn;
	
	public String bankingPageTitle() {
		return driver.getTitle();
	}
	
	
	public BankingPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public BankAccounts newBank()

	{
		accountName.sendKeys("sanju12");
		accountType.sendKeys(Keys.DOWN);
		accountType.sendKeys(Keys.RETURN);
		accountNumber.sendKeys("62267343507000");
		continueBtn.click();
		return new BankAccounts();
	}

	
	
}
