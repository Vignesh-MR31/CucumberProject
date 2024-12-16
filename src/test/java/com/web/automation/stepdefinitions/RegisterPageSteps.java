package com.web.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.web.automation.base.Base;
import com.web.automation.pages.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegisterPageSteps {

	private WebDriver driver;
	RegisterPage registerPage;
	
	@When("User select Register from the dropdown")
	public void userSelectRegisterFromTheDropdown() {
		driver = Base.getDriver();
		registerPage.registerOptionElement().click();
	}

	@Then("User successfully navigated to Register Page")
	public void userSuccessfullyNavigatedToRegisterPage() {
		String expectedHeader = "Register Account";
		Assert.assertEquals(expectedHeader, registerPage.registerAccountHeaderWebElement().getText());
	}
}
