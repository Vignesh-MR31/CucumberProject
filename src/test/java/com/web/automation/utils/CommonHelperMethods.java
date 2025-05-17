package com.web.automation.utils;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonHelperMethods {

	public static void explicitWaitMethod(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		}
		catch(NoSuchElementException e) {
			return false;
		}
	}
}
