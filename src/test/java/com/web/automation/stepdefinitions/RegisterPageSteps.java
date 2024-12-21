package com.web.automation.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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

}
