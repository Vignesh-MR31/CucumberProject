package com.web.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.automation.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps {
	
	public WebDriver driver;
	LoginPage loginPage;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("User open the application using the URL")
	public void user_open_the_application_using_the_url() {
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@When("User clicks the My Account dropdown")
	public void user_clicks_the_my_account_dropdown() {
		loginPage = new LoginPage(driver);
		loginPage.myAccountElement().click();
	}
	
	@When("User select {string} from the dropdown")
	public void user_select_from_the_dropdown(String page) {
		loginPage.SelectingOption(page);
	}
	
	@Then("User successfully navigated to Login Page")
	public void user_successfully_navigated_to_login_page() {
		String expectedTitle = "Account Login";
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}

	@When("User enters {string} email address")
	public void user_enters_email_address(String email) {
		loginPage.emailAddressElement().sendKeys(email);
	}
	
	@When("User enters {string} password")
	public void user_enters_password(String password) {
	    loginPage.passwordElement().sendKeys(password);
	}
	
	@When("User clicks the Login button")
	public void user_clicks_the_login_button() {
		loginPage.loginButtonElement().click();
	}
	
	@Then("User verify the My Account page is displayed")
	public void user_verify_the_my_account_page_is_displayed() {
	    String expectedHeader = "My Account";
	    Assert.assertEquals(expectedHeader, loginPage.myAccountHeaderElement().getText());
	}

	@Then("User verify the warning message displayed")
	public void user_verify_the_warning_message_displayed() {
	    String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
	    Assert.assertEquals(expectedWarningMessage, loginPage.warningMessageElement().getText());
	}
}
