package com.web.automation.stepdefinitions;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.automation.base.PageInstance;
import com.web.automation.base.TestContext;
import com.web.automation.pages.ProductDisplayPage;
import com.web.automation.utils.CommonHelperMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDisplayPageSteps extends PageInstance{
	
	public WebDriver driver;
	private ProductDisplayPage productDisplayPage = getProductDisplayPageInstance();
	
	public ProductDisplayPageSteps(TestContext context) {
		super(context);
		this.driver = context.driver;
	}
	
	@When("User click the main Thumbnail image displayed on the Product Display Page")
	public void userClickTheMainThumbnailImageDisplayedOnTheProductDisplayPage() {
		productDisplayPage.largeThumbnailImageWebElement().click();
	}
	
	@Then("User verify the Light box view of the main Thumbnail image is displayed")
	public void userVerifyTheLightBoxViewOfTheMainThumbnailImageIsDisplayed() {
		CommonHelperMethods.explicitWaitMethod(driver, productDisplayPage.lightBoxViewWebElement());
		Assert.assertTrue(productDisplayPage.lightBoxViewWebElement().isDisplayed());
	}

	@Then("User clicks the right arrow button and verify able to navigate through other images in light box view")
	public void userClicksTheRightArrowButtonAndVerifyAbleToNavigateThroughOtherImagesInLightBoxView() {
		CommonHelperMethods.explicitWaitMethod(driver, productDisplayPage.imageCounterWebElement());
		String[] splittingText =  productDisplayPage.imageCounterWebElement().getText().split(" of ");
		int count = Integer.valueOf(splittingText[0]);
		int imageCount = Integer.valueOf(splittingText[1]);
		boolean imageNavigation = false;
		for(int i = count+1; i<=imageCount; i++) {
			productDisplayPage.rightArrowKeyButtonWebElement().click();
			String expectedImageIndex = String.valueOf(i);
			if(productDisplayPage.imageCounterWebElement().getText().contains(expectedImageIndex)) {
				System.out.println(expectedImageIndex+" text: "+productDisplayPage.imageCounterWebElement().getText());
				imageNavigation = true;
			}
			Assert.assertTrue(imageNavigation);
		}
	}
	
	@Then("User clicks the left arrow button and verify able to navigate through other images in light box view")
	public void userClicksTheLeftArrowButtonAndVerifyAbleToNavigateThroughOtherImagesInLightBoxView() {
		CommonHelperMethods.explicitWaitMethod(driver, productDisplayPage.imageCounterWebElement());
		String[] splittingText =  productDisplayPage.imageCounterWebElement().getText().split(" of ");
		int count = Integer.valueOf(splittingText[0]);
		int imageCount = Integer.valueOf(splittingText[1]);
		boolean imageNavigation = false;
		for(int i = imageCount; i>=(count+1) ;i--) {
			productDisplayPage.leftArrowKeyButtonWebElement().click();
			String expectedImageIndex = String.valueOf(i);
			if(productDisplayPage.imageCounterWebElement().getText().contains(expectedImageIndex)) {
				System.out.println(expectedImageIndex+" text: "+productDisplayPage.imageCounterWebElement().getText());
				imageNavigation = true;
			}
			Assert.assertTrue(imageNavigation);
		}
	}
	
	@When("User click the close button in the light box view")
	public void userClickTheCloseButtonInTheLightBoxView() {
		productDisplayPage.closeButtonWebElement().click();
	}
	
	@Then("User verify the light box view is closed")
	public void userVerifyTheLightBoxViewIsClosed() {
		Assert.assertTrue(productDisplayPage.largeThumbnailImageWebElement().isDisplayed());
	}
	
	@When("User click the second normal Thumbnail image displayed on the Product Display Page")
	public void userClickTheSecondNormalThumbnailImageDisplayedOnTheProductDisplayPage() {
		productDisplayPage.secondNormalThumbnailImageWebElement().click();
	}

	@When("User click the third normal Thumbnail image displayed on the Product Display Page")
	public void userClickTheThirdNormalThumbnailImageDisplayedOnTheProductDisplayPage() {
		productDisplayPage.thirdNormalThumbnailImageWebElement().click();
	}
	
	@Then("User verify the product name displayed in the Product Display Page")
	public void userVerifyTheProductNameDisplayedInTheProductDisplayPage() {
		String expectedProduct = ProductCompareSteps.searchedProduct;
		String brand = "Brand";
		String productCode = "Product Code";
		boolean displayStatus = false;
		if(productDisplayPage.brandDisplayWebElement().getText().contains(brand) && productDisplayPage.productCodeDisplayWebElement().getText().contains(productCode)) {
			displayStatus = true;
		}
		Assert.assertTrue(displayStatus);
		Assert.assertEquals(expectedProduct, productDisplayPage.displayedProductNameWebElement().getText());
	}

	@Then("User verify the availabilty status of the Product in the Product Display Page")
	public void userVerifyTheAvailabiltyStatusOfTheProductInTheProductDisplayPage() {
		boolean availabilityStatus = false;
		if(productDisplayPage.availabilityDisplayWebElement().getText().substring(13).equals("In Stock")) {
			availabilityStatus = true;
		}
		else if(productDisplayPage.availabilityDisplayWebElement().getText().substring(13).equals("Out Of Stock")) {
			availabilityStatus = true;
		}
		else if(productDisplayPage.availabilityDisplayWebElement().getText().substring(13).equals("Limited Stock")) {
			availabilityStatus = true;
		}
		else {
			availabilityStatus = false;
		}
		Assert.assertTrue(availabilityStatus);
	}
	
	@Then("User verify the default quantity of the Product is displayed as {int}")
	public void userVerifyTheDefaultQuantityOfTheProductIsDisplayedAs(int defaultQuantity) {
		boolean defaultQuantityStatus = false;
		int actualQuantity = Integer.valueOf(productDisplayPage.quantityTextboxWebElement().getAttribute("value"));
		if(actualQuantity == defaultQuantity) {
			defaultQuantityStatus = true;
		}
		Assert.assertTrue(defaultQuantityStatus);
	}
	
	@When("User update the quantity of the product to {string}")
	public void userUpdateTheQuantityOfTheProductTo(String quantity) {
		productDisplayPage.quantityTextboxWebElement().clear();
		productDisplayPage.quantityTextboxWebElement().sendKeys(quantity);
	}
	
	@When("User click on the add to cart button in the Product Display Page")
	public void userClickOnTheAddToCartButtonInTheProductDisplayPage() {
		productDisplayPage.addToCartButtonWebElement().click();
	}
	
	@Then("User verify the success message after product added to the add to cart page")
	public void userVerifyTheSuccessMessageAfterProductAddedToTheAddToCartPage() {
		try {
			CommonHelperMethods.explicitWaitMethod(driver, productDisplayPage.addToCartSuccessMessageWebElement());
		}
		catch(Exception e) {
			productDisplayPage.addToCartButtonWebElement().click();
		}
		finally {
			String expectedMessage = "Success: You have added " +ProductCompareSteps.searchedProduct+ " to your shopping cart!";
		    Assert.assertEquals(expectedMessage, productDisplayPage.addToCartSuccessMessageWebElement().getText().replace("×", "").trim());
		}
	}
	
	@Then("User verify the description of product is displayed")
	public void userVerifyTheDescriptionOfProductIsDisplayed() {
		Assert.assertTrue(productDisplayPage.descriptionTabWebElement().isDisplayed());
		Assert.assertTrue(productDisplayPage.descriptionWebElement().getText().length()!=0);
	}
	
	@When("User click on the specification tab in the Product Display Page")
	public void userClickOnTheSpecificationTabInTheProductDisplayPage() {
		productDisplayPage.specificationTabWebElement().click();
	}
	
	@Then("User verify the specifications of product listed in the Product Display Page")
	public void userVerifyTheSpecificationsOfProductListedInTheProductDisplayPage() {
	   List<String> specs = new LinkedList<String>();
	   specs.add("Processor");
	   specs.add("Clockspeed");
	   specs.add("100mhz");
	   int count = 0;
	   List<WebElement> specificationDescription = productDisplayPage.specificationsWebElement();
	   for(WebElement description: specificationDescription) {
		   Assert.assertEquals(specs.get(count), description.getText());
		   count++;
	   }
	}
	
	@When("User click on the review tab in the Product Display Page")
	public void userClickOnTheReviewTabInTheProductDisplayPage() {
		productDisplayPage.reviewTabWebElement().click();
	}
	
	@When("User enter the name {string} in the Your name text box")
	public void userEnterTheNameInTheYourNameTextBox(String reviewerName) {
		productDisplayPage.yourNameTextboxWebElement().sendKeys(reviewerName);
	}
	
	@When("User enters the review in the Your review text box")
	public void userEntersTheReviewInTheYourReviewTextBox() {
		String reviewText = "Reviewing the product with good and bad rating";
		productDisplayPage.yourReviewTextboxWebElement().sendKeys(reviewText);
	}
	
	@When("User select the {int} Bad or Good rating")
	public void userSelectTheBadOrGoodRating(int rating) {
		List<WebElement> ratings = productDisplayPage.badGoodRatingRadiobuttonWebElement();
		for(WebElement ratingsRadiobutton : ratings) {
			if(rating == Integer.valueOf(ratingsRadiobutton.getAttribute("value"))){
				ratingsRadiobutton.click();
			}
		}
	}
	
	@When("User click on continue button in the review tab")
	public void userClickOnContinueButtonInTheReviewTab() {
		productDisplayPage.continueButtonWebElement().click();
	}
	
	@Then("User verify the success message displayed after clicking the continue button")
	public void userVerifyTheSuccessMessageDisplayedAfterClickingTheContinueButton() {
	   String expectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
	   Assert.assertEquals(expectedMessage, productDisplayPage.successMessageReviewWebElement().getText());
	}
	
	@Then("User verify no reviews is added in reviews tab")
	public void userVerifyNoReviewsIsAddedInReviewsTab() {
		String expecteddisplayMessage = "There are no reviews for this product.";
		Assert.assertEquals(expecteddisplayMessage, productDisplayPage.noReviewMessageWebElement().getText());
	}

	@Then("User verify the error message displayed when name is not filled")
	public void userVerifyTheErrorMessageDisplayedWhenNameIsNotFilled() {
	    String expectedErrorMessage = "Warning: Review Name must be between 3 and 25 characters!";
	    Assert.assertEquals(expectedErrorMessage, productDisplayPage.mandatoryErrorMessageReviewWebElement().getText());
	}
	
	@Then("User verify the error message displayed when review is not filled")
	public void userVerifyTheErrorMessageDisplayedWhenReviewIsNotFilled() {
		String expectedErrorMessage = "Warning: Review Text must be between 25 and 1000 characters!";
	    Assert.assertEquals(expectedErrorMessage, productDisplayPage.mandatoryErrorMessageReviewWebElement().getText());
	}
	
	@Then("User verify the error message displayed when rating is not selected")
	public void userVerifyTheErrorMessageDisplayedWhenRatingIsNotSelected() {
		String expectedErrorMessage = "Warning: Please select a review rating!";
	    Assert.assertEquals(expectedErrorMessage, productDisplayPage.mandatoryErrorMessageReviewWebElement().getText());
	}
	
	@When("User click the Write a review link")
	public void userClickTheWriteAReviewLink() {
		productDisplayPage.writeAReviewLinkWebElement().click();
	}
	
	@Then("User verify the write a review form is displayed in the product display page")
	public void userVerifyTheWriteAReviewFormIsDisplayedInTheProductDisplayPage() {
	    Assert.assertTrue(productDisplayPage.writeAReviewHeaderWebElement().isDisplayed());
	}
	
	@Then("User verify the number of reviews is displayed in the product display page")
	public void userVerifyTheNumberOfReviewsIsDisplayedInTheProductDisplayPage() {
		 Assert.assertTrue(productDisplayPage.zeroReviewsWebElement().isDisplayed());
	}
	
	@When("User click on Add to Wish List button in the Product Display page")
	public void userClickOnAddToWishListButtonInTheProductDisplayPage() {
		productDisplayPage.addToWishListButtonWebElement().click();
	}
	
	@Then("User verify the product is successfully added to the wish list")
	public void userVerifyTheProductIsSuccessfullyAddedToTheWishList() {
	    String expectedMessage = "Success: You have added "+ProductCompareSteps.searchedProduct+" to your wish list!";
	    Assert.assertEquals(expectedMessage, productDisplayPage.addToCartSuccessMessageWebElement().getText().replace("×", "").trim());
	}
}
