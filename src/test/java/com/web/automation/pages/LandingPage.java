package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
>>>>>>> main
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='content']//h3")
	private WebElement featuredHeader;
	
	public WebElement featuredHeaderElement() {
		return featuredHeader;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

public class LandingPage {
	
	WebDriver driver;
	
>>>>>>> main
>>>>>>> main
>>>>>>> main

}
