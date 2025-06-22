package com.web.automation.utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonHelperMethods {
	
	private static Actions actions;
	static WebDriverWait wait;
	static JavascriptExecutor js;

	public static void explicitWaitMethod(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void explicitWaitElementToBeClickable(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
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
	
	public static void selectDropdownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectDropdownByIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}
	
	public static void actionmoveToElement(WebDriver driver, WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public static void javaScriptScrollIntoView(WebDriver driver,WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
