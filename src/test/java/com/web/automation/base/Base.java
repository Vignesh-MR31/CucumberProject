package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {

	private WebDriver driver;
	 
    public WebDriver getDriver() {
        return driver;
    }
 
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
 
    public void setupController() {
        this.driver = new ChromeDriver();
    }
 
    public void teardownController() {
        if (driver != null) {
            driver.quit();
        }
    }
}
