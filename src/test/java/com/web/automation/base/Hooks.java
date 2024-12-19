package com.web.automation.base;

import org.openqa.selenium.WebDriver;

import com.web.automation.utils.PropertyLoader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private WebDriver driver;
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

	@After
	public void tearDown() {
		driver.quit();
	}
}
