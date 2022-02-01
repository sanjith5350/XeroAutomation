package com.qa.pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class BankAccountPage extends TestBase{
	@FindBy(xpath="//span[@class='text']")
	WebElement addBankAccount;

	public String bankAccountPageTitle() {
		return driver.getTitle();
	}
	
	public BankAccountPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public BankSearchPAge addBankAccount()
	{
		addBankAccount.click();
		return new BankSearchPAge();
	}

}
