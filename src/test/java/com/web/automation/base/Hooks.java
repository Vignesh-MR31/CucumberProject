package com.web.automation.base;

import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
=======
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> main

import com.web.automation.utils.PropertyLoader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private WebDriver driver;
<<<<<<< HEAD
	private TestContext context;

	public Hooks(TestContext context) {
		this.context = context;
	}

	@Before
	public void setup() {
		driver = Base.InitializeDriver();
		context.driver = driver;
		driver.manage().window().maximize();
		driver.get(PropertyLoader.loadProperty().getProperty("URL"));
	}

=======
	
	@Before
	public void setup() {
		driver = Base.InitializeDriver();
		driver.manage().window().maximize();
		driver.get(PropertyLoader.loadProperty().getProperty("URL"));
	}
	
>>>>>>> main
	@After
	public void tearDown() {
		driver.quit();
	}
}
