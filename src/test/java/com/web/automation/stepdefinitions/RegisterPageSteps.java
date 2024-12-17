package com.web.automation.stepdefinitions;

<<<<<<< HEAD
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.web.automation.base.TestContext;
=======
import org.openqa.selenium.WebDriver;

<<<<<<< HEAD
import com.web.automation.base.Base;
=======
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
>>>>>>> main
import com.web.automation.pages.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD

public class RegisterPageSteps {

	private WebDriver driver;
	RegisterPage registerPage;
	
	public RegisterPageSteps(TestContext context) {
		driver = context.driver;
	}
	
	@When("User select Register from the dropdown")
	public void userSelectRegisterFromTheDropdown() {
		registerPage = new RegisterPage(driver);
=======
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
>>>>>>> main
		registerPage.registerOptionElement().click();
	}

	@Then("User successfully navigated to Register Page")
	public void userSuccessfullyNavigatedToRegisterPage() {
		String expectedHeader = "Register Account";
		Assert.assertEquals(expectedHeader, registerPage.registerAccountHeaderWebElement().getText());
	}
}
