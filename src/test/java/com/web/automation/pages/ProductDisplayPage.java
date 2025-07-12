package com.web.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
	
	public ProductDisplayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@id='content']//ul//li)[1]")
	private WebElement largeThumbnailImage;
	
	@FindBy(xpath = "//button[@title='Next (Right arrow key)']")
	private WebElement rightArrowKeyButton;
	
	@FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
	private WebElement leftArrowKeyButton;
	
	@FindBy(xpath = "//button[@title='Close (Esc)']")
	private WebElement closeButton;
	
	@FindBy(tagName = "figure")
	private WebElement lightBoxView;
	
	@FindBy(xpath = "//figcaption//div[contains(@class,'counter')]")
	private WebElement imageCounter;
	
	@FindBy(xpath = "(//div[@id='content']//ul//li)[2]")
	private WebElement secondNormalThumbnailImage;
	
	@FindBy(xpath = "(//div[@id='content']//ul//li)[3]")
	private WebElement thirdNormalThumbnailImage;
	
	@FindBy(xpath = "//div[@id='content']//h1")
	private WebElement displayedProductName;
	
	@FindBy(xpath = "(//div[@id='content']//h1//following-sibling::ul//li)[1]")
	private WebElement brandDisplay;
	
	@FindBy(xpath = "(//div[@id='content']//h1//following-sibling::ul//li)[2]")
	private WebElement productCodeDisplay;

	@FindBy(xpath = "(//div[@id='content']//h1//following-sibling::ul//li)[3]")
	private WebElement availabilityDisplay;
	
	@FindBy(id = "input-quantity")
	private WebElement quantityTextbox;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	private WebElement addToCartSuccessMessage;
	
	@FindBy(xpath = "(//div[@id='content']//ul)[2]//li//a[text()='Description']")
	private WebElement descriptionTab;
	
	@FindBy(xpath = "//div[@id='tab-description']//div")
	private WebElement description;
	
	@FindBy(xpath = "(//div[@id='content']//ul)[2]//li//a[text()='Specification']")
	private WebElement specificationTab;
	
	@FindBy(xpath = "//div[@id='tab-specification']//td")
	private List<WebElement> specifications;
	
	@FindBy(linkText = "Reviews (0)")
	private WebElement reviewTab;
	
	@FindBy(id = "input-name")
	private WebElement yourNameTextbox;
	
	@FindBy(id = "input-review")
	private WebElement yourReviewTextbox;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> badGoodRatingRadiobutton;
	
	@FindBy(id = "button-review")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@id='tab-review']//div[contains(@class, 'alert')]")
	private WebElement successMessageReview;
	
	@FindBy(xpath = "//div[@id='tab-review']//p")
	private WebElement noReviewMessage;
	
	@FindBy(xpath = "//div[@id='tab-review']//div[contains(@class, 'alert')]")
	private WebElement mandatoryErrorMessageReview;
	
	@FindBy(linkText = "Write a review")
	private WebElement writeAReviewLink;
	
	@FindBy(xpath = "//h2[text()='Write a review']")
	private WebElement writeAReviewHeader;
	
	@FindBy(linkText = "0 reviews")
	private WebElement zeroReviews;
	
	@FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[1]")
	private WebElement addToWishListButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	private WebElement addToWishlistSuccessMessage;
	
	public WebElement largeThumbnailImageWebElement() {
		return largeThumbnailImage;
	}
	
	public WebElement rightArrowKeyButtonWebElement() {
		return rightArrowKeyButton;
	}
	
	public WebElement leftArrowKeyButtonWebElement() {
		return leftArrowKeyButton;
	}
	
	public WebElement closeButtonWebElement() {
		return closeButton;
	}
	
	public WebElement lightBoxViewWebElement() {
		return lightBoxView;
	}
	
	public WebElement imageCounterWebElement() {
		return imageCounter;
	}
	
	public WebElement secondNormalThumbnailImageWebElement() {
		return secondNormalThumbnailImage;
	}
	
	public WebElement thirdNormalThumbnailImageWebElement() {
		return thirdNormalThumbnailImage;
	}
	
	public WebElement displayedProductNameWebElement() {
		return displayedProductName;
	}
	
	public WebElement brandDisplayWebElement() {
		return brandDisplay;
	}
	
	public WebElement productCodeDisplayWebElement() {
		return productCodeDisplay;
	}
	
	public WebElement availabilityDisplayWebElement() {
		return availabilityDisplay;
	}
	
	public WebElement quantityTextboxWebElement() {
		return quantityTextbox;
	}
	
	public WebElement addToCartButtonWebElement() {
		return addToCartButton;
	}
	
	public WebElement addToCartSuccessMessageWebElement() {
		return addToCartSuccessMessage;
	}
	
	public WebElement descriptionTabWebElement() {
		return descriptionTab;
	}
	
	public WebElement descriptionWebElement() {
		return description;
	}
	
	public WebElement specificationTabWebElement() {
		return specificationTab;
	}
	
	public List<WebElement> specificationsWebElement() {
		return specifications;
	}
	
	public WebElement reviewTabWebElement() {
		return reviewTab;
	}
	
	public WebElement yourNameTextboxWebElement() {
		return yourNameTextbox;
	}
	
	public WebElement yourReviewTextboxWebElement() {
		return yourReviewTextbox;
	}
	
	public List<WebElement> badGoodRatingRadiobuttonWebElement() {
		return badGoodRatingRadiobutton;
	}
	
	public WebElement continueButtonWebElement() {
		return continueButton;
	}
	
	public WebElement successMessageReviewWebElement() {
		return successMessageReview;
	}
	
	public WebElement noReviewMessageWebElement() {
		return noReviewMessage;
	}
	
	public WebElement mandatoryErrorMessageReviewWebElement() {
		return mandatoryErrorMessageReview;
	}
	
	public WebElement writeAReviewLinkWebElement() {
		return writeAReviewLink;
	}
	
	public WebElement writeAReviewHeaderWebElement() {
		return writeAReviewHeader;
	}
	
	public WebElement zeroReviewsWebElement() {
		return zeroReviews;
	}
	
	public WebElement addToWishListButtonWebElement() {
		return addToWishListButton;
	}
	
	public WebElement addToWishlistSuccessMessageWebElement() {
		return addToWishlistSuccessMessage;
	}
}
