package com.web.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;

<<<<<<< HEAD
import com.web.automation.base.Base;
=======
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
import com.web.automation.pages.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegisterPageSteps {

<<<<<<< HEAD
	private WebDriver driver;
=======
	WebDriver driver;
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
	RegisterPage registerPage;
	
	@When("User select Register from the dropdown")
	public void userSelectRegisterFromTheDropdown() {
<<<<<<< HEAD
		driver = Base.getDriver();
=======
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
		registerPage.registerOptionElement().click();
	}

	@Then("User successfully navigated to Register Page")
	public void userSuccessfullyNavigatedToRegisterPage() {
		String expectedHeader = "Register Account";
		Assert.assertEquals(expectedHeader, registerPage.registerAccountHeaderWebElement().getText());
	}
}
