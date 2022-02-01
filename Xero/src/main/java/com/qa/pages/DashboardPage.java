package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class DashboardPage extends TestBase {


	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String dashboardTitle() {
		return driver.getTitle();
	}
	
	public BankAccountPage accountClick() 
	{

		
		driver.findElement(By.xpath("//button[normalize-space()='Accounting']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ol[contains(@class,'xnav-verticalmenu')]//li//a[contains(text(),'Bank accounts')]"));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals("Bank accounts")) {
				list.get(i).click();
				
			}
				
			
		}
		return new BankAccountPage();
	}

	
}
