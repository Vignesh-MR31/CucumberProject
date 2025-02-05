package com.web.automation.stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;

import com.web.automation.base.TestContext;
import com.web.automation.pages.LandingPage;
import com.web.automation.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
	
	private WebDriver driver;
	LoginPage loginPage;
	LandingPage landingPage;
	Actions actions;
	
	public LoginPageSteps(TestContext context) {
		driver = context.driver;
	}
	
	@Given("User open the application using the URL")
	public void userOpenTheApplicationUsingTheURL() {
		landingPage = new LandingPage(driver);
		String expectedFeaturedHeader = "Featured";
		Assert.assertEquals(expectedFeaturedHeader, landingPage.featuredHeaderElement().getText());
	}
	
	@When("User clicks the My Account dropdown")
	public void userClicksTheMyAccountDropdown() {
		loginPage = new LoginPage(driver);
		loginPage.myAccountElement().click();
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
	
	@When("User clicks the forgotten password link")
	public void userClicksTheForgottenPasswordLink() {
	    loginPage.forgottenPasswordElement().click();
	}
	
	@Then("User successfully navigated to forgot your password page")
	public void userSuccessfullyNavigatedToForgotYourPasswordPage() {
	    String expectedHeader = "Forgot Your Password?";
	    Assert.assertEquals(expectedHeader, loginPage.forgotYourPasswordElement().getText());
	}
	
	@When("User enters the {string} email address using tab key")
	public void userEntersTheEmailAddressUsingTabKey(String email) {
	   actions = new Actions(driver);
	   for(int i=0; i<22;i++) {
		   actions.keyDown(Keys.TAB).build().perform();
	   }
	   loginPage.emailAddressElement().sendKeys(email);
	}
	
	@When("User enters the {string} password using tab key")
	public void userEntersThePasswordUsingTabKey(String password) {
		actions = new Actions(driver);
		actions.keyDown(Keys.TAB).build().perform();
		loginPage.passwordElement().sendKeys(password);
	}
}
