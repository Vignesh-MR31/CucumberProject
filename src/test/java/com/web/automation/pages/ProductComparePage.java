package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductComparePage {
	
	private WebDriver driver;
	
	public ProductComparePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='image']")
	private WebElement searchedProductImage;
	
	@FindBy(xpath = "(//button[@data-original-title = 'Compare this Product'])[1]")
	private WebElement compareThisProductButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	private WebElement addedSuccessMessage;
	
	@FindBy(linkText = "product comparison")
	private WebElement productComparisonLink;
	
	@FindBy(xpath = "//div[@id='content']//h1")
	private WebElement productComparisonHeader;
	
	@FindBy(xpath = "(//td[contains(text(),'Product')])[1]/following-sibling::td")
	private WebElement addedProduct;
	
	@FindBy(xpath = "(//button[@data-original-title = 'Compare this Product'])[2]")
	private WebElement compareThisProductButtonFromRelatedProducts;
	
	@FindBy(xpath = "//div[@class='caption']/h4")
	private WebElement relatedProductsHeader;
	
	public WebElement searchedProductImageWebElement() {
		return searchedProductImage;
	}

	public WebElement compareThisProductButtonWebElement() {
		return compareThisProductButton;
	}
	
	public WebElement addedSuccessMessageWebElement() {
		return addedSuccessMessage;
	}
	
	public WebElement productComparisonLinkWebElement() {
		return productComparisonLink;
	}
	
	public WebElement productComparisonHeaderWebElement() {
		return productComparisonHeader;
	}
	
	public WebElement addedProductWebElement() {
		return addedProduct;
	}
	
	public WebElement compareThisProductButtonFromRelatedProductsWebElement() {
		return compareThisProductButtonFromRelatedProducts;
	}
	
	public WebElement relatedProductsHeaderWebElement() {
		return relatedProductsHeader;
	}
}
