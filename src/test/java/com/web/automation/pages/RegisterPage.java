package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement registerAccountHeader;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneTextBox;
	
	@FindBy(id = "input-password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "input-confirm")
	private WebElement passwordConfirmTextBox;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement subscribeYesRadiobutton;
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement subscribeNoRadiobutton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@id='content']//h1")
	private WebElement accountCreatedHeader;
	
	public WebElement registerOptionElement() {
		return registerOption;
	}
	
	public WebElement registerAccountHeaderWebElement() {
		return registerAccountHeader;
	}
	
	public WebElement firstNameTextBoxWebElement() {
		return firstNameTextBox;
	}
	
	public WebElement lastNameTextBoxWebElement() {
		return lastNameTextBox;
	}
	
	public WebElement emailTextBoxWebElement() {
		return emailTextBox;
	}
	
	public WebElement telephoneTextBoxWebElement() {
		return telephoneTextBox;
	}
	
	public WebElement passwordTextBoxWebElement() {
		return passwordTextBox;
	}
	
	public WebElement passwordConfirmTextBoxWebElement() {
		return passwordConfirmTextBox;
	}
	
	public WebElement subscribeYesRadiobuttonWebElement() {
		return subscribeYesRadiobutton;
	}
	
	public WebElement subscribeNoRadiobuttonWebElement() {
		return subscribeNoRadiobutton;
	}
	
	public WebElement privacyPolicyCheckboxWebElement() {
		return privacyPolicyCheckbox;
	}
	
	public WebElement continueButtonWebElement() {
		return continueButton;
	}
	
	public WebElement accountCreatedHeaderWebElement() {
		return accountCreatedHeader;
	}
}
