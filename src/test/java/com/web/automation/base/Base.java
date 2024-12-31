package com.web.automation.base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;
import com.web.automation.utils.PropertyLoader;

import io.cucumber.java.Scenario;

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
    		break;
    	}
        return driver;
    }
    
    
   public static void takesScreenshot(Scenario scenario) {
	   TakesScreenshot screen = (TakesScreenshot)driver;
	   final byte[] screenshot = screen.getScreenshotAs(OutputType.BYTES);
	   scenario.attach(screenshot, "image/png", "screenshot");
	   String path = System.getProperty("user.dir")+"/test-results/screenshots/";
	   File folder = new File(path+scenario.getName().replace(' ', '_')+".png");
	   if(!folder.exists()) {
		   folder.mkdirs();
	   }
	   try {
		Files.write(screenshot, folder);
	   } catch (IOException e) {
		e.printStackTrace();
	   }
   }
}
