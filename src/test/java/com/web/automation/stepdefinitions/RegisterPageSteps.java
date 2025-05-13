package com.web.automation.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;

import com.web.automation.base.TestContext;
import com.web.automation.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {

	private WebDriver driver;
	RegisterPage registerPage;
	
	public RegisterPageSteps(TestContext context) {
		driver = context.driver;
	}
	
	public RegisterPage registerPageDriverInstance() {
		registerPage = new RegisterPage(driver);
		return registerPage;
	}
	
	@When("User select Register from the dropdown")
	public void userSelectRegisterFromTheDropdown() {
		registerPageDriverInstance();
		registerPage.registerOptionElement().click();
	}

	@Then("User successfully navigated to Register Page")
	public void userSuccessfullyNavigatedToRegisterPage() {
		registerPageDriverInstance();
		String expectedHeader = "Register Account";
		Assert.assertEquals(expectedHeader, registerPage.registerAccountHeaderWebElement().getText());
	}
	
	@When("User enters the personal details and passwords")
	public void userEntersThePersonalDetailsAndPasswords(DataTable dataTable) {
		List<Map<String, String>> registerDetails = dataTable.asMaps();
		registerPage.firstNameTextBoxWebElement().sendKeys(registerDetails.get(0).get("firstName"));
		registerPage.lastNameTextBoxWebElement().sendKeys(registerDetails.get(0).get("lastName"));
		registerPage.emailTextBoxWebElement().sendKeys(registerDetails.get(0).get("email"));
		registerPage.telephoneTextBoxWebElement().sendKeys(registerDetails.get(0).get("telephone"));
		registerPage.passwordTextBoxWebElement().sendKeys(registerDetails.get(0).get("password"));
		registerPage.passwordConfirmTextBoxWebElement().sendKeys(registerDetails.get(0).get("passwordConfirm"));
	}
	
	@When("User selects subscribe radio button as {string}")
	public void userSelectsSubscribeRadioButtonAs(String subscribeOption) {
	    if(subscribeOption.equalsIgnoreCase("yes")) {
	    	registerPage.subscribeYesRadiobuttonWebElement().click();
	    }
	    else {
	    	registerPage.subscribeNoRadiobuttonWebElement().click();
	    }
	}
	
	@When("User selects privacy policy checkbox")
	public void userSelectsPrivacyPolicyCheckbox() {
	    registerPage.privacyPolicyCheckboxWebElement().click();
	}
	
	@When("User clicks continue button")
	public void userClicksContinueButton() {
	    registerPage.continueButtonWebElement().click();
	}
	
	@Then("User verify the account is successfully registered")
	public void userVerifyTheAccountIsSuccessfullyRegistered() {
	    String expectedAccountCreaterHeader = "Your Account Has Been Created!";
	    Assert.assertEquals(expectedAccountCreaterHeader,registerPage.accountCreatedHeaderWebElement().getText());
	}
	
	@Then("User verify the warning messages displayed in fields")
	public void userVerifyTheWarningMessagesDisplayedInFields() {
	    String firstNameWarning = "First Name must be between 1 and 32 characters!";
	    String lastNameWarning = "Last Name must be between 1 and 32 characters!";
	    String emailWarning = "E-Mail Address does not appear to be valid!";
	    String telephoneWarning = "Telephone must be between 3 and 32 characters!";
	    String passwordWarning = "Password must be between 4 and 20 characters!";
	    String privacyPolicyWarning = "Warning: You must agree to the Privacy Policy!";
	    Assert.assertEquals(firstNameWarning,registerPage.firstNameWarningWebElement().getText());
	    Assert.assertEquals(lastNameWarning,registerPage.lasttNameWarningWebElement().getText());
	    Assert.assertEquals(emailWarning,registerPage.emailWarningWebElement().getText());
	    Assert.assertEquals(telephoneWarning,registerPage.telephoneWarningWebElement().getText());
	    Assert.assertEquals(passwordWarning,registerPage.passwordWarningWebElement().getText());
	    Assert.assertEquals(privacyPolicyWarning,registerPage.privacyPolicyWarningWebElement().getText());
	}
	
	@Then("User verify the warning message displayed in register page")
	public void userVerifyTheWarningMessageDisplayedInRegisterPage() {
	    String expectedWarningMessage = "Warning: E-Mail Address is already registered!";
	    Assert.assertEquals(expectedWarningMessage,registerPage.warningMessageWebElement().getText());
	}

	@When("User clicks Login column option")
	public void userClicksLoginColumnOption() {
	    registerPage.loginColumnOptionWebElement().click();
	}
	
	@When("User clicks Login page link")
	public void userClicksLoginPageLink() {
	    registerPage.loginPageLinkWebElement().click();
	}
	
	@When("User enters the space {string} in the mandatory fields")
	public void userEntersTheSpaceInTheMandatoryFields(String space) {
		 registerPage.firstNameTextBoxWebElement().sendKeys(space);
		 registerPage.lastNameTextBoxWebElement().sendKeys(space);
		 registerPage.emailTextBoxWebElement().sendKeys(space);
		 registerPage.telephoneTextBoxWebElement().sendKeys(space);
		 registerPage.passwordTextBoxWebElement().sendKeys(space);
		 registerPage.passwordConfirmTextBoxWebElement().sendKeys(space);
	}


	@Then("User verify the Privacy Policy checkbox is not selected by default")
	public void userVerifyThePrivacyPolicyCheckboxIsNotSelectedByDefault() {
	    Assert.assertEquals(false, registerPage.privacyPolicyCheckboxWebElement().isSelected());
	}
	

	@Then("User verify the warning message displayed when registering the account without selecting the Privacy Policy checkbox")
	public void userVerifyTheWarningMessageDisplayedWhenRegisteringTheAccountWithoutSelectingThePrivacyPolicyCheckbox() {
		String privacyPolicyWarning = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyWarning,registerPage.privacyPolicyWarningWebElement().getText());
	}

	@When("User enters the password {string} in password field")
	public void userEntersThePasswordInPasswordField(String password) {
		registerPage.passwordTextBoxWebElement().sendKeys(password);
	}
	
	@When("User enter the password {string} in confirm password field")
	public void userEnterThePasswordInConfirmPasswordField(String confirmPassword) {
		registerPage.passwordConfirmTextBoxWebElement().sendKeys(confirmPassword);
	}
	
	@Then("User verify the characters in password and confirm password field is hidden")
	public void userVerifyTheCharactersInPasswordAndConfirmPasswordFieldIsHidden() {
		String hiddenValue = "password";
		Assert.assertEquals(hiddenValue, registerPage.passwordTextBoxWebElement().getAttribute("type"));
		Assert.assertEquals(hiddenValue, registerPage.passwordConfirmTextBoxWebElement().getAttribute("type"));
		
	}

	@When("User clicks privacy policy link")
	public void userClicksPrivacyPolicyLink() {
	    registerPage.privacyPolicyLinkWebElement().click();
	}
	
	@Then("User verify the privacy policy")
	public void userVerifyThePrivacyPolicy() throws InterruptedException {
		Thread.sleep(3000);
	    String expectedPrivacyPolicyHeader = "Privacy Policy";
	    Assert.assertEquals(expectedPrivacyPolicyHeader, registerPage.privacyPolicyHeaderWebElement().getText());
	}
	
	@When("User clicks Forgotten Password Option in Register Page")
	public void userClicksForgottenPasswordOptionInRegisterPage() {
	    registerPage.forgottenPasswordOptionWebElement().click();
	}
	
	@Then("User verify the Forgotten Password Page is displayed")
	public void userVerifyTheForgottenPasswordPageIsDisplayed() {
	    String expectedForgotYourPasswordHeader = "Forgot Your Password?";
	    Assert.assertEquals(expectedForgotYourPasswordHeader, registerPage.forgotYourPasswordHeaderWebElement().getText());
	}
	
	@Then("User verify the warning message when entering mismatched passwords")
	public void userVerifyTheWarningMessageWhenEnteringMismatchedPasswords() {
	    String expectedWarningMessage = "Password confirmation does not match password!";
	    Assert.assertEquals(expectedWarningMessage, registerPage.passwordConfirmationWarningMessageWebElement().getText());
	}

}
