package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
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
	
	@FindBy(linkText = "Desktops")
	private WebElement desktopsdropdown;
	
	@FindBy(linkText = "Show AllDesktops")
	private WebElement showAllDesktopsOption;
	
	@FindBy(xpath = "(//div[contains(@class,'caption')])[1]/h4")
	private WebElement firstSearchResult;
	
	@FindBy(xpath = "(//button[@data-original-title = 'Compare this Product'])[1]")
	private WebElement compareThisProductButton;
	
	@FindBy(linkText = "product comparison")
	private WebElement productComparisonLink;
	
	@FindBy(id = "list-view")
	private WebElement listViewButton;
	
	@FindBy(id = "grid-view")
	private WebElement gridViewButton;
	
	@FindBy(xpath = "//div[@id='content']//h1")
	private WebElement productComparisonHeader;
	
	@FindBy(xpath = "(//td[contains(text(),'Product')])[1]/following-sibling::td")
	private WebElement addedProduct;
	
	public WebElement featuredHeaderElement() {
		return featuredHeader;
	}
	
	public WebElement desktopsdropdownWebElement() {
		return desktopsdropdown;
	}
	
	public WebElement showAllDesktopsOptionWebElement() {
		return showAllDesktopsOption;
	}
	
	public WebElement firstSearchResultWebElement() {
		return firstSearchResult;
	}
	
	public WebElement compareThisProductButtonWebElement() {
		return compareThisProductButton;
	}
	
	public WebElement productComparisonLinkWebElement() {
		return productComparisonLink;
	}
	
	public WebElement listViewButtonWebElement() {
		return listViewButton;
	}
	
	public WebElement productComparisonHeaderWebElement() {
		return productComparisonHeader;
	}
	
	public WebElement addedProductWebElement() {
		return addedProduct;
	}
	
	public WebElement gridViewButtonWebElement() {
		return gridViewButton;
	}

}
