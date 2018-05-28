package test.java.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

final public class Initialization {
    static Initialization instance = null;

    public static Initialization getInstance()
    {
        if (instance == null)
            instance = new Initialization();
        return instance;
    }

    private Initialization() {
        System.setProperty("webdriver.chrome.driver","C:/selenium/chromedriver.exe");
    }
}
