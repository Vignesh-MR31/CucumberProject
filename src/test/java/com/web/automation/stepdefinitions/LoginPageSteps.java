package com.web.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;

<<<<<<< HEAD
import com.web.automation.base.TestContext;
import com.web.automation.pages.LandingPage;
=======
import com.web.automation.base.Base;
>>>>>>> main
import com.web.automation.pages.LoginPage;
import com.web.automation.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
	
<<<<<<< HEAD
	private WebDriver driver;
	LoginPage loginPage;
	LandingPage landingPage;
=======
<<<<<<< HEAD
	private WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;
	
	@Given("User open the application using the URL")
	public void userOpenTheApplicationUsingTheURL() {
		driver = Base.getDriver();
=======
	WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;
>>>>>>> main
	
	public LoginPageSteps(TestContext context) {
		driver = context.driver;
	}
	
	@Given("User open the application using the URL")
	public void userOpenTheApplicationUsingTheURL() {
<<<<<<< HEAD
		landingPage = new LandingPage(driver);
		String expectedFeaturedHeader = "Featured";
		Assert.assertEquals(expectedFeaturedHeader, landingPage.featuredHeaderElement().getText());
=======
		driver.get("https://tutorialsninja.com/demo");
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
>>>>>>> main
	}
	
	@When("User clicks the My Account dropdown")
	public void userClicksTheMyAccountDropdown() {
		loginPage = new LoginPage(driver);
<<<<<<< HEAD
		loginPage.myAccountElement().click();
=======
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
		registerPage = new RegisterPage(driver);
	}
	
	@When("User select Login from the dropdown")
	public void userSelectLoginFromTheDropdown() {
		loginPage.loginOptionElement().click();
	}
	
	@Then("User successfully navigated to Login Page")
	public void userSuccessfullyNavigatedToLoginPage() {
		String expectedTitle = "Account Login";
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}

	@When("User enters {string} email address")
	public void userEntersEmailAddress(String email) {
		loginPage.emailAddressElement().sendKeys(email);
	}
	
	@When("User enters {string} password")
	public void userEntersPassword(String password) {
	    loginPage.passwordElement().sendKeys(password);
	}
	
	@When("User clicks the Login button")
	public void userClicksTheLoginButton() {
		loginPage.loginButtonElement().click();
	}
	
	@Then("User verify the My Account page is displayed")
	public void userVerifyTheMyAccountPageIsDisplayed() {
	    String expectedHeader = "My Account";
	    Assert.assertEquals(expectedHeader, loginPage.myAccountHeaderElement().getText());
	}

	@Then("User verify the warning message displayed")
	public void userVerifyTheWarningMessageDisplayed() {
	    String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
	    Assert.assertEquals(expectedWarningMessage, loginPage.warningMessageElement().getText());
	}
}
