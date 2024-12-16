package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.web.automation.utils.PropertyLoader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {

	private static WebDriver driver;
	 
    public static WebDriver InitializeDriver() {
    	String browser = PropertyLoader.loadProperty().getProperty("Browser");
    	switch(browser) {
    	case "chrome":
    		driver = new ChromeDriver();
    		break;
    	case "edge":
    		driver = new EdgeDriver();
    		break;
    	case "firefox":
    		driver = new FirefoxDriver();
    		break;
    	default:
    		driver = new ChromeDriver();
    	}
        return driver;
    }
    
    public static WebDriver getDriver() {
    	return driver;
    }
 
    
   
}
