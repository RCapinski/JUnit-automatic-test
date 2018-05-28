package test.java.stepdefinition;

import test.java.pages.LoginPage;
import test.java.pages.Initialization;
import test.java.data.Data;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.UnhandledAlertException;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class Login {

    private Initialization init = Initialization.getInstance();
    private LoginPage loginPage;
    private Data data = new Data();

    @Given("^Open the Browser$")
    public void open__the_Browser() throws Throwable {
        init.getInstance();
        this.loginPage = new LoginPage();
    }		

    @When("^Enter the Username and Password and click login$")					
    public void enter_the_Username_and_Password_and_click_login() throws Throwable {
        this.loginPage.login(data.dataCase1[0], data.dataCase1[1]);
    }		

    @Then("^Check if logged and close browser$")					
    public void Close_browser() throws Throwable {
    	Assert.assertTrue("Main page not visible!", this.loginPage.isMainContainerVisible());
    	this.loginPage.closeDriver();
    }		
    
    @When("^Enter wrong username and password and click login$")
    public void enter_wrong_username_and_password_and_click_login() throws Throwable {
        this.loginPage.login(data.dataCase2[0], data.dataCase2[1]);
    }
    
    @Then("^Check if still on login page and close browser$")
    public void check_if_still_on_login_page_and_close_browser() throws Throwable {
    	Assertions.assertThrows(UnhandledAlertException.class, () -> {this.loginPage.isMainContainerVisible();}, "123");
    	this.loginPage.closeDriver();
    }

    @When("^Enter a password and no login$")
    public void enter_a_password_and_no_login() throws Throwable {
    	this.loginPage.login(data.dataCase3[0], data.dataCase3[1]);
    }

    @When("^Enter a valid login and no password$")
    public void enter_a_valid_login_and_no_password() throws Throwable {
    	this.loginPage.login(data.dataCase4[0], data.dataCase4[1]);
    }

    @When("^Enter no credentials$")
    public void enter_no_credentials() throws Throwable {
    	this.loginPage.login(data.dataCase5[0], data.dataCase5[1]);
    }

}