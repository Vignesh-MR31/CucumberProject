package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.automation.utils.PropertyLoader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private WebDriver driver;
	
	@Before
	public void setup() {
		driver = Base.InitializeDriver();
		driver.manage().window().maximize();
		driver.get(PropertyLoader.loadProperty().getProperty("URL"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
