
Feature: Xero Bank Account Add
  

  
  Scenario: HomePage
    Given User is on homepage
    When user clicks on Login Button
   
    And  User enters username and password and click on login button
   Then Dashboard Page is displayed
    When user clicks on Bank Account under Accounting tab
    Then user is on BankAccount page
    When  user clicks on Add Bank Account button
    And  user selects ANZ(NZ)
    Then User is on Banking Page
    When user enters Accountname,select accounttype,enters account number and click on continue button
    Then user is on BankAccounts page
    And  user clicks on formbutton

  
