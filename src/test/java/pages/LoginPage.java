package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage{
	private WebDriver driver;
    private String usernameInputLocator = "userLogin";
    private String passwordInputLocator = "passwordLogin";
    private String loginButtonLocator = "login";
    
    private By loginField;
    private By loginPassField;
    private By loginButton;
    private WebDriverWait wait;
    
    public LoginPage() {
    	driver = new ChromeDriver();
    	driver.get("http://kmg.hcm.pl/testowanie/");
    	wait = new WebDriverWait(driver, 3);	
    }
    
    public void login(String loginCredential, String passCredential) {   	
    	wait.until(ExpectedConditions.elementToBeClickable(loginField.id(usernameInputLocator))).sendKeys(loginCredential);
    	wait.until(ExpectedConditions.elementToBeClickable(loginPassField.id(passwordInputLocator))).sendKeys(passCredential);
    	wait.until(ExpectedConditions.elementToBeClickable(loginButton.id(loginButtonLocator))).sendKeys(Keys.ENTER);
    }
    
    public boolean isMainContainerVisible() throws Throwable {
    	try {
    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("maincontainer")))); 
    		return true;
    	} catch(TimeoutException e) {
    		return false;
    	}
    }
    
    public void closeDriver() {
    	driver.close();
    }
        
}
