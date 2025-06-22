package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccount;
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	@FindBy(id = "input-email")
	private WebElement emailAddress;
	
	@FindBy(id = "input-password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "(//div[@id='content']/h2)[1]")
	private WebElement myAccountHeader;
	
	@FindBy(xpath = "(//div[@id='account-login']/div)[1]")
	private WebElement warningMessage;
	
	@FindBy(linkText = "Forgotten Password")
	private WebElement forgottenPassword;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement forgotYourPasswordHeader;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	@FindBy(linkText = "Change your password")
	private WebElement changeYourPassword;
	
	@FindBy(id = "input-password")
	private WebElement changePassword;
	
	@FindBy(id = "input-confirm")
	private WebElement changePasswordConfirm;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	private WebElement changePasswordSuccessMessage;
	
	@FindBy(linkText = "Continue")
	private WebElement registerContinueButton;
	
	@FindBy(linkText = "Register")
	private WebElement registerColumnOption;
	
	@FindBy(linkText = "Forgotten Password")
	private WebElement forgottenPasswordColumnOption;
	
	@FindBy(xpath = "(//ul[contains(@class,'dropdown-menu')])[2]//li[5]")
	private WebElement logoutOption;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement accountLogoutHeader;
	
	@FindBy(linkText = "Logout")
	private WebElement rightOptionLogout;
	
	@FindBy(xpath = "//div[@id='account-login']/div[1]")
	private WebElement emailConfirmationMessage;
	
	public WebElement myAccountElement() {
		return myAccount;
	}
	
	public WebElement loginOptionElement() {
		return loginOption;
	}
	
	public WebElement emailAddressElement() {
		return emailAddress;
	}
	
	public WebElement passwordElement() {
		return password;
	}
	
	public WebElement loginButtonElement() {
		return loginButton;
	}
	
	public WebElement myAccountHeaderElement() {
		return myAccountHeader;
	}
	
	public WebElement warningMessageElement() {
		return warningMessage;
	}
	
	public WebElement forgottenPasswordElement() {
		return forgottenPassword;
	}
	
	public WebElement forgotYourPasswordElement() {
		return forgotYourPasswordHeader;
	}
	
	public WebElement logoutElement() {
		return logout;
	}
	
	public WebElement changeYourPasswordElement() {
		return changeYourPassword;
	}
	
	public WebElement changePasswordElement() {
		return changePassword;
	}
	
	public WebElement changePasswordConfirmElement() {
		return changePasswordConfirm;
	}
	
	public WebElement continueButtonElement() {
		return continueButton;
	}
	
	public WebElement changePasswordSuccessMessageElement() {
		return changePasswordSuccessMessage;
	}
	
	public WebElement registerContinueButtonElement() {
		return registerContinueButton;
	}
	
	public WebElement registerColumnOptionElement() {
		return registerColumnOption;
	}
	
	public WebElement forgottenPasswordColumnOptionElement() {
		return forgottenPasswordColumnOption;
	}
	
	public WebElement logoutOptionElement() {
		return logoutOption;
	}
	
	public WebElement accountLogoutHeaderElement() {
		return accountLogoutHeader;
	}
	
	public WebElement rightOptionLogoutElement() {
		return rightOptionLogout;
	}
	
	public WebElement emailConfirmationMessageElement() {
		return emailConfirmationMessage;
	}
}
