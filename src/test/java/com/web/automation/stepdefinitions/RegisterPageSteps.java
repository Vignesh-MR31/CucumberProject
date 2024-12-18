package com.web.automation.stepdefinitions;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;

=======
<<<<<<< HEAD
>>>>>>> main
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.web.automation.base.TestContext;
<<<<<<< HEAD
import com.web.automation.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
=======
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
>>>>>>> main

public class RegisterPageSteps {

	private WebDriver driver;
	RegisterPage registerPage;
	
	public RegisterPageSteps(TestContext context) {
		driver = context.driver;
	}
	
	@When("User select Register from the dropdown")
	public void userSelectRegisterFromTheDropdown() {
		registerPage = new RegisterPage(driver);
<<<<<<< HEAD
=======
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
>>>>>>> main
		registerPage.registerOptionElement().click();
	}

	@Then("User successfully navigated to Register Page")
	public void userSuccessfullyNavigatedToRegisterPage() {
		String expectedHeader = "Register Account";
		Assert.assertEquals(expectedHeader, registerPage.registerAccountHeaderWebElement().getText());
	}
<<<<<<< HEAD
	
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

=======
>>>>>>> main
}
