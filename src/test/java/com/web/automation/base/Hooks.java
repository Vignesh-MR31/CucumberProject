package com.web.automation.base;

import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> main
>>>>>>> main

import com.web.automation.utils.PropertyLoader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private WebDriver driver;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
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

<<<<<<< HEAD
=======
=======
	
	@Before
	public void setup() {
		driver = Base.InitializeDriver();
		driver.manage().window().maximize();
		driver.get(PropertyLoader.loadProperty().getProperty("URL"));
	}
	
>>>>>>> main
>>>>>>> main
	@After
	public void tearDown() {
		driver.quit();
	}
}
