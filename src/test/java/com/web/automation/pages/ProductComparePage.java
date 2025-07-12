package com.web.automation.pages;

import java.util.List;

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
	
	@FindBy(linkText = "Product Compare (0)")
	private WebElement productCompareLink;
	
	@FindBy(xpath = "//div[@id='content']/p")
	private WebElement noProductMessage;
	
	@FindBy(linkText = "Continue")
	private WebElement continueButton;
	
	@FindBy(xpath = "(//div[@id='product-compare']/ul/li)[1]//i")
	private WebElement homeIconBreadcrumb;
	
	@FindBy(xpath = "//input[@value='Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(linkText = "Remove")
	private WebElement removeButton;
	
	@FindBy(xpath = "(//td[contains(text(),'Product')])[1]/following-sibling::td")
	private List<WebElement> addedProducts;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	private WebElement addToCartSuccessMessage;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	private WebElement removeSuccessMessage;
	
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
	
	public WebElement productCompareLinkWebElement() {
		return productCompareLink;
	}
	
	public WebElement noProductMessageWebElement() {
		return noProductMessage;
	}
	
	public WebElement continueButtonWebElement() {
		return continueButton;
	}
	
	public WebElement homeIconBreadcrumbWebElement() {
		return homeIconBreadcrumb;
	}
	
	public WebElement addToCartButtonWebElement() {
		return addToCartButton;
	}
	
	public WebElement removeButtonWebElement() {
		return removeButton;
	}
	
	public List<WebElement> addedProductsWebElement() {
		return addedProducts;
	}
	
	public WebElement addToCartSuccessMessageWebElement() {
		return addToCartSuccessMessage;
	}
	
	public WebElement removeSuccessMessageWebElement() {
		return removeSuccessMessage;
	}
}
