package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

<<<<<<< HEAD
	private WebDriver driver;
=======
	WebDriver driver;
>>>>>>> main
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement registerAccountHeader;
	
	public WebElement registerOptionElement() {
		return registerOption;
	}
	
	public WebElement registerAccountHeaderWebElement() {
		return registerAccountHeader;
	}
}
