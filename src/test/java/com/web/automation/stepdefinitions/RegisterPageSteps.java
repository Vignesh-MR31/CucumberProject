package com.web.automation.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.web.automation.base.TestContext;
import com.web.automation.pages.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {

	private WebDriver driver;
	RegisterPage registerPage;
	
	public RegisterPageSteps(TestContext context) {
		driver = context.driver;
	}
	
	@When("User select Register from the dropdown")
	public void userSelectRegisterFromTheDropdown() {
		registerPage = new RegisterPage(driver);
		registerPage.registerOptionElement().click();
	}

	@Then("User successfully navigated to Register Page")
	public void userSuccessfullyNavigatedToRegisterPage() {
		String expectedHeader = "Register Account";
		Assert.assertEquals(expectedHeader, registerPage.registerAccountHeaderWebElement().getText());
	}
}
