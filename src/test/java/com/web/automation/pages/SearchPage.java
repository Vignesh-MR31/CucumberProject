package com.web.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	private WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='search']//input")
	private WebElement searchInputTextbox;
	
	@FindBy(xpath = "//div[@id='search']//button")
	private WebElement searchIconButton;
	
	@FindBy(xpath = "(//div[contains(@class,'caption')])[1]/h4")
	private WebElement firstProductHeader;
	
	@FindBy(xpath = "(//div[@id='content'])/p[2]")
	private WebElement noProductMessage;
	
	@FindBy(xpath = "//div[@class='caption']/h4")
	private List<WebElement> multipleProducts;
	
	@FindBy(id = "input-search")
	private WebElement searchCriteria;
	
	@FindBy(id = "button-search")
	private WebElement searchButton;
	
	@FindBy(xpath = "(//div[contains(@class,'caption')])[1]/p[1]")
	private WebElement firstDescription;
	
	@FindBy(id = "description")
	private WebElement productDescriptionCheckbox;
	
	@FindBy(xpath = "//div[@class='caption']//p[1]")
	private List<WebElement> searchedProductsDescription;
	
	@FindBy(xpath = "//select[@name='category_id']")
	private WebElement categoryDropdown;
	
	@FindBy(xpath = "//input[@name='sub_category']")
	private WebElement subcategoryCheckbox;
	
	@FindBy(id = "list-view")
	private WebElement listViewButton;
	
	@FindBy(id = "grid-view")
	private WebElement gridViewButton;
	
	@FindBy(id = "compare-total")
	private WebElement productCompareLink;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement productComparisonHeader;
	
	@FindBy(id = "input-sort")
	private WebElement sortOrderDropdown;
	
	@FindBy(xpath = "//div[@class='caption']//p[2]")
	private List<WebElement> priceList;
	
	@FindBy(xpath = "//button[@data-original-title='Compare this Product']")
	private WebElement compareThisProductIcon;
	
	public WebElement searchInputTextboxWebElement() {
		return searchInputTextbox;
	}
	
	public WebElement searchIconButtonWebElement() {
		return searchIconButton;
	}

	public WebElement firstProductHeaderWebElement() {
		return firstProductHeader;
	}
	
	public WebElement noProductMessageWebElement() {
		return noProductMessage;
	}
	
	public List<WebElement> multipleProductsWebElements() {
		return multipleProducts;
	}
	
	public WebElement searchCriteriaWebElement() {
		return searchCriteria;
	}
	
	public WebElement searchButtonWebElement() {
		return searchButton;
	}
	
	public WebElement firstDescriptionWebElement() {
		return firstDescription;
	}
	
	public WebElement productDescriptionCheckboxWebElement() {
		return productDescriptionCheckbox;
	}
	
	public List<WebElement> searchedProductsDescriptionWebElement() {
		return searchedProductsDescription;
	}
	
	public WebElement categoryDropdownWebElement() {
		return categoryDropdown;
	}
	
	public WebElement subcategoryCheckboxWebElement() {
		return subcategoryCheckbox;
	}
	
	public WebElement listViewButtonWebElement() {
		return listViewButton;
	}
	
	public WebElement gridViewButtonWebElement() {
		return gridViewButton;
	}
	
	public WebElement productCompareLinkWebElement() {
		return productCompareLink;
	}
	
	public WebElement productComparisonHeaderWebElement() {
		return productComparisonHeader;
	}
	
	public WebElement sortOrderDropdownWebElement() {
		return sortOrderDropdown;
	}
	
	public List<WebElement> priceListWebElement() {
		return priceList;
	}
	
	public WebElement compareThisProductIconWebElement() {
		return compareThisProductIcon;
	}
}
