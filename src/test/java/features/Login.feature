Feature: Check if login module works
  Background:
    Given Open the Browser

  Scenario: TST_01_01 Verification of correct login procedure
    When Enter the Username and Password and click login
    Then Check if logged and close browser

  Scenario: TST_01_02 Verification of wrong credentials login denial
    When Enter wrong username and password and click login
    Then Check if still on login page and close browser
    
  Scenario: TST_01_03 Verification of no login login denial
    When Enter a password and no login
    Then Check if still on login page and close browser
    
  Scenario: TST_01_04 Verification of no password login denial
    When Enter a valid login and no password
    Then Check if still on login page and close browser
    
  Scenario: TST_01_05 Verification of no credentials login denial
	When Enter no credentials
	Then Check if still on login page and close browser