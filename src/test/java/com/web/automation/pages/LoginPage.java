package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
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
	
	@FindBy(linkText = "Forgotten Password")
	private WebElement forgottenPassword;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement forgotYourPasswordHeader;
	
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
}
