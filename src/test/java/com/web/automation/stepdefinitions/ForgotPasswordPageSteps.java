package com.web.automation.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.web.automation.base.TestContext;
import com.web.automation.pages.ForgotPasswordPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ForgotPasswordPageSteps {
	private WebDriver driver;
	ForgotPasswordPage forgotPasswordPage;
	
	public ForgotPasswordPageSteps(TestContext context) {
		driver = context.driver;
	}
	
	private ForgotPasswordPage forgotPasswordPageDriverInstance() {
		forgotPasswordPage = new ForgotPasswordPage(driver);
		return forgotPasswordPage;
	}
	
	@When("User Enters the existing {string} email address")
	public void userEntersTheExistingEmailAddress(String email) {
		forgotPasswordPageDriverInstance();
		forgotPasswordPage.emailTextBoxElement().sendKeys(email);
	}
	
	@When("User clicks the continue button in Forgot Password Page")
	public void userClicksTheContinueButtonInForgotPasswordPage() {
		forgotPasswordPage.continueButtonElement().click();
	}
	
	@Then("User verify the email address not found message is displayed")
	public void userVerifyTheEmailAddressNotFoundMessageIsDisplayed() {
	    String expectedErrorMessage = "Warning: The E-Mail Address was not found in our records, please try again!";
	    Assert.assertEquals(expectedErrorMessage,forgotPasswordPage.emailNotFoundMessageElement().getText());
	}

	@Then("User verify the placehold text is displayed in the E-mail address field")
	public void userVerifyThePlaceholdTextIsDisplayedInTheEMailAddressField() {
		forgotPasswordPageDriverInstance();
	    String expectedPlaceholder = "E-Mail Address";
	    String actualPlaceholder = forgotPasswordPage.emailTextBoxElement().getAttribute("placeholder");
	    Assert.assertEquals(expectedPlaceholder, actualPlaceholder);
	}

}
