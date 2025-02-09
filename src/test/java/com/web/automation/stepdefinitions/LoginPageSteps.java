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
	
	@Then("User verify the the E-Mail Address and Password fields have the placeholder")
	public void userVerifyTheTheEMailAddressAndPasswordFieldsHaveThePlaceholder() {
		String emailPlaceholder = "E-Mail Address";
		String passwordPlaceholder = "Password";
	    Assert.assertEquals(emailPlaceholder, loginPage.emailAddressElement().getAttribute("placeholder"));
	    Assert.assertEquals(passwordPlaceholder, loginPage.passwordElement().getAttribute("placeholder"));
	}
	
	@Then("User clicks the browser back button")
	public void userClicksTheBrowserBackButton() throws InterruptedException {
	    driver.navigate().back();
	    Thread.sleep(10000);
	}
	
	@When("User clicks the Logout from the dropdown")
	public void userClicksTheLogoutFromTheDropdown() {
	    loginPage.logoutElement().click();
	}

	@When("User clicks the change your password link")
	public void userClicksTheChangeYourPasswordLink() {
	   loginPage.changeYourPasswordElement().click();
	}
	
	@When("User enters the {string} in password field in change password")
	public void userEntersTheInPasswordFieldInChangePassword(String newPassword) {
	   loginPage.changePasswordElement().sendKeys(newPassword);
	}
	
	@When("User enters the {string} in password confirm field in change password")
	public void userEntersTheInPasswordConfirmFieldInChangePassword(String newPassword) {
		loginPage.changePasswordConfirmElement().sendKeys(newPassword);
	}
	
	@When("User clicks the continue button")
	public void userClicksTheContinueButton() {
	    loginPage.continueButtonElement().click();
	}
	
	@Then("User verify the success message displayed after changing the password")
	public void userVerifyTheSuccessMessageDisplayedAfterChangingThePassword() {
	   String passwordSuccessMessage = "Success: Your password has been successfully updated.";
	   Assert.assertEquals(passwordSuccessMessage, loginPage.changePasswordSuccessMessageElement().getText());
	}
}
