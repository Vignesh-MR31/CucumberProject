package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	private WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy(xpath = "//div[contains(@class, 'buttons clearfix')]//div[2]")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@id='account-forgotten']/div[contains(text(),'Warning')]")
	private WebElement emailNotFoundMessage;
	
	public WebElement emailTextBoxElement() {
		return emailTextBox;
	}
	
	public WebElement continueButtonElement() {
		return continueButton;
	}
	
	public WebElement emailNotFoundMessageElement() {
		return emailNotFoundMessage;
	}
	
}
