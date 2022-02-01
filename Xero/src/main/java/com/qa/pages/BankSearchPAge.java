package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class BankSearchPAge extends TestBase{
	@FindBy(xpath="//input[@id='bankSearch-input']")
	WebElement bankSearch;
	public BankSearchPAge()
	{
		PageFactory.initElements(driver, this);
		
	}
	

	public BankingPage addBank() throws InterruptedException {
		bankSearch.sendKeys("ANZ");
		Thread.sleep(5000);
		
	
		driver.findElement(By.xpath("//div[@class='xui-panel xui-contentblock']//a[@class='xui-contentblockitem xui-contentblockitem-layout xui-contentblockitem-rowlink']//div[@class='xui-contentblockitem--headings']")).click();	
	

		
		
		
	
	return new BankingPage();

}
}
