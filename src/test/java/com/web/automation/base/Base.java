package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

<<<<<<< HEAD
import com.web.automation.utils.PropertyLoader;

=======
<<<<<<< HEAD
import com.web.automation.utils.PropertyLoader;

=======
<<<<<<< HEAD
import com.web.automation.utils.PropertyLoader;

=======
<<<<<<< HEAD
import com.web.automation.utils.PropertyLoader;

=======
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
>>>>>>> main
>>>>>>> main
>>>>>>> main
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {
<<<<<<< HEAD
	 
    public static WebDriver InitializeDriver() {
    	WebDriver driver;
=======
<<<<<<< HEAD
	 
    public static WebDriver InitializeDriver() {
    	WebDriver driver;
=======
<<<<<<< HEAD
	 
    public static WebDriver InitializeDriver() {
    	WebDriver driver;
=======

<<<<<<< HEAD
	private static WebDriver driver;
	 
    public static WebDriver InitializeDriver() {
>>>>>>> main
>>>>>>> main
>>>>>>> main
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
<<<<<<< HEAD
    }  
   
=======
<<<<<<< HEAD
    }  
   
=======
<<<<<<< HEAD
    }  
   
=======
    }
    
    public static WebDriver getDriver() {
    	return driver;
    }
 
    
   
=======
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
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
>>>>>>> main
>>>>>>> main
>>>>>>> main
}
