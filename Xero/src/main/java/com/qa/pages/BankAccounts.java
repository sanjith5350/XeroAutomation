package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class BankAccounts extends TestBase {
	
	@FindBy(xpath="//span[normalize-space()=\"I've got a form\"]")
	WebElement formBtn;
	
	
	public BankAccounts()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String bankAccountsPageTitle() {
		return driver.getTitle();
	}
	
	
	
	public void finalStep()
	{
		formBtn.click();
	}
	

	
	
}
