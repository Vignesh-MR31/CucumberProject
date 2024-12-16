package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
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
	
<<<<<<< HEAD
	public WebElement myAccountElement() {
		return myAccount;
		//return new RegisterPage(driver);
=======
	public RegisterPage myAccountElement() {
		myAccount.click();
		return new RegisterPage(driver);
>>>>>>> 0dab827540aafca19fbda653044c1f21d7fcab7a
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
}
