package com.qa.stepDefinitions;

import com.qa.pages.BankAccountPage;
import com.qa.pages.BankAccounts;
import com.qa.pages.BankSearchPAge;
import com.qa.pages.BankingPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
//import static org.junit.Assert.*;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class XeroSteps extends TestBase {
	
	LoginPage lognPage;
	DashboardPage dashboardPAge;
	BankSearchPAge banksearchPage;
	BankingPage bankingPage;
	BankAccounts bankAccounts ;
	BankAccountPage bankaccountPage;

	@Given("User is on homepage")
	public void user_is_on_homepage() {
	   TestBase.initialization();
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		HomePage homePage= new HomePage();
		
	homePage.clickonlogin();
	}

	@When("User enters username and password and click on login button")
	public void user_enters_username_and_password_and_click_on_login_button() throws InterruptedException {
		LoginPage lognPage=new LoginPage();
		Thread.sleep(2000);
	lognPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Then("Dashboard Page is displayed")
	public void dashboard_page_is_displayed() throws InterruptedException {
		DashboardPage dashboardPAge=new DashboardPage();
		System.out.println("User is on dashboard page");
		Thread.sleep(2000);
	}

	@When("user clicks on Bank Account under Accounting tab")
	public void user_clicks_on_bank_account_under_accounting_tab() throws InterruptedException  {
		
		DashboardPage dashboardPAge=new DashboardPage();
		Thread.sleep(10000);
		
		dashboardPAge.accountClick();
	}

	@Then("user is on BankAccount page")
	public void user_is_on_bank_account_page() {
		BankAccountPage bankaccountPage=new BankAccountPage();
		System.out.println("User is on Bank Account Page");
	}

	@When("user clicks on Add Bank Account button")
	public void user_clicks_on_add_bank_account_button() throws InterruptedException  {
		BankAccountPage bankaccountPage=new BankAccountPage();
			    bankaccountPage.addBankAccount();
			    Thread.sleep(2000);
	   
	}

	@When("user selects ANZ\\(NZ)")
	public void user_selects_anz_nz() throws InterruptedException {
		BankSearchPAge banksearchPage=new BankSearchPAge();
		Thread.sleep(10000);
		banksearchPage.addBank();
	}

	@Then("User is on Banking Page")
	public void user_is_on_banking_page() {
		BankingPage bankingPage=new BankingPage();
		System.out.println("User is on banking page");
//		
	}

	@When("user enters Accountname,select accounttype,enters account number and click on continue button")
	public void user_enters_accountname_select_accounttype_enters_account_number_and_click_on_continue_button() throws InterruptedException {
		BankingPage bankingPage=new BankingPage();
		Thread.sleep(10000);
	   bankingPage.newBank();
	}

	@Then("user is on BankAccounts page")
	public void user_is_on_bank_accounts_page() {
		BankAccounts bankAccounts = new BankAccounts();
		System.out.println("User is on bank Accounts pAge");
		
	}

	@Then("user clicks on formbutton")
	public void user_clicks_on_formbutton() throws InterruptedException {
		BankAccounts bankAccounts = new BankAccounts();
		Thread.sleep(10000);
	    bankAccounts.finalStep();
	}
}
