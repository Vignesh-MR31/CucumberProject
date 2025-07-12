package com.web.automation.stepdefinitions;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.automation.base.PageInstance;
import com.web.automation.base.TestContext;
import com.web.automation.pages.LandingPage;
import com.web.automation.pages.ProductComparePage;
import com.web.automation.pages.SearchPage;
import com.web.automation.utils.CommonHelperMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductCompareSteps extends PageInstance{

	private WebDriver driver;
	private ProductComparePage productComparePage;
	private SearchPage searchPage;
	static String searchedProduct;
	private LandingPage landingPage;
	String firstProduct;
	String relatedProduct;
	String featuredProduct;
	List<String> addedProducts = new LinkedList<String>();
	int index;
	
	public ProductCompareSteps(TestContext context) {
		super(context);
		this.driver = context.driver;
	}
	
	@When("User click on the product displayed in the search results")
	public void userClickOnTheProductDisplayedInTheSearchResults() {
		searchPage = getSearchPageInstance();
		searchedProduct = searchPage.firstProductHeaderWebElement().getText();
		if(searchedProduct!=null) {
			addedProducts.add(searchedProduct);
		}
		productComparePage = getProductComparePageInstance();
		productComparePage.searchedProductImageWebElement().click();
	}
	
	@When("User click the compare this product icon")
	public void userClickTheCompareThisProductIcon() {
		productComparePage.compareThisProductButtonWebElement().click();
	}
	
	@Then("User verify the product the added and success message displayed")
	public void userVerifyTheProductTheAddedAndSuccessMessageDisplayed() {
		CommonHelperMethods.explicitWaitMethod(driver, productComparePage.addedSuccessMessageWebElement());
		boolean addedProduct = false;
		if(productComparePage.addedSuccessMessageWebElement().getText().contains(searchedProduct)) {
			addedProduct = true;
		}
		else {
			addedProduct = false;
		}
	    Assert.assertTrue(addedProduct);
	}
	
	@When("User click the product comparison link and navigated to product comparison page")
	public void userClickTheProductComparisonLinkAndNavigatedToProductComparisonPage() throws InterruptedException {
		CommonHelperMethods.javaScriptScrollIntoView(driver, productComparePage.productComparisonLinkWebElement());
		Thread.sleep(3000);
		productComparePage.productComparisonLinkWebElement().click();
		String expectedHeader = "Product Comparison";
		Assert.assertEquals(expectedHeader, productComparePage.productComparisonHeaderWebElement().getText());
	}
	
	@Then("User verify the added product is displayed in the product comparison page")
	public void userVerifyTheAddedProductIsDisplayedInTheProductComparisonPage() {
		Assert.assertEquals(searchedProduct, productComparePage.addedProductWebElement().getText());
	}
	
	@When("User click the desktops dropdown")
	public void userClickTheDesktopsDropdown() {
	    landingPage = getLandingPageInstance();
	    CommonHelperMethods.actionmoveToElement(driver, landingPage.desktopsdropdownWebElement());
	}
	
	@When("User click the show all desktops option")
	public void userClickTheShowAllDesktopsOption() {
		CommonHelperMethods.actionmoveToElement(driver, landingPage.showAllDesktopsOptionWebElement());
		landingPage.showAllDesktopsOptionWebElement().click();
	}
	
	@When("User click the list view button in desktops page")
	public void userClickTheListViewButtonInDesktopsPage() {
	    landingPage.listViewButtonWebElement().click();
	}
	
	@When("User click the compare this product icon in desktops page")
	public void userClickTheCompareThisProductIconInDesktopsPage() {
	    firstProduct = landingPage.firstSearchResultWebElement().getText();
	    landingPage.compareThisProductButtonWebElement().click();
	}
	
	@When("User click the product comparison link in desktops page and navigated to product comparison page")
	public void userClickTheProductComparisonLinkInDesktopsPageAndNavigatedToProductComparisonPage() {
		CommonHelperMethods.javaScriptScrollIntoView(driver, landingPage.productComparisonLinkWebElement());
		landingPage.productComparisonLinkWebElement().click();
		String expectedHeader = "Product Comparison";
		Assert.assertEquals(expectedHeader, landingPage.productComparisonHeaderWebElement().getText());
	}
	
	@Then("User verify the added product from desktops page is displayed in the product comparison page")
	public void userVerifyTheAddedProductFromDesktopsPageIsDisplayedInTheProductComparisonPage() {
		Assert.assertEquals(firstProduct, landingPage.addedProductWebElement().getText());
	}

	@When("User click the grid view button in desktops page")
	public void userClickTheGridViewButtonInDesktopsPage() {
		landingPage.gridViewButtonWebElement();
	}
	
	@When("User click the compare this product icon from related products")
	public void userClickTheCompareThisProductIconFromRelatedProducts() {
		relatedProduct = productComparePage.relatedProductsHeaderWebElement().getText();
		productComparePage.compareThisProductButtonFromRelatedProductsWebElement().click();
	}
	
	@Then("User verify the added product from related products is displayed in the product comparison page")
	public void userVerifyTheAddedProductFromRelatedProductsIsDisplayedInTheProductComparisonPage() {
		Assert.assertEquals(relatedProduct, productComparePage.addedProductWebElement().getText());
	}
	
	@When("User click the compare this product icon from featured products")
	public void userClickTheCompareThisProductIconFromFeaturedProducts() {
		landingPage = getLandingPageInstance();
		featuredProduct = landingPage.firstSearchResultWebElement().getText();
		landingPage.compareThisProductButtonWebElement().click();
	}
	
	@When("User click the product comparison link in featured products page and navigated to product comparison page")
	public void userClickTheProductComparisonLinkInFeaturedProductsPageAndNavigatedToProductComparisonPage() throws InterruptedException {
		CommonHelperMethods.javaScriptScrollIntoView(driver, landingPage.productComparisonLinkWebElement());
		Thread.sleep(3000);
		landingPage.productComparisonLinkWebElement().click();
		String expectedHeader = "Product Comparison";
		Assert.assertEquals(expectedHeader, landingPage.productComparisonHeaderWebElement().getText());
	}
	
	@Then("User verify the added product from featured products page is displayed in the product comparison page")
	public void userVerifyTheAddedProductFromFeaturedProductsPageIsDisplayedInTheProductComparisonPage() {
		Assert.assertEquals(featuredProduct, landingPage.addedProductWebElement().getText());
	}
	
	@When("User click the product compare link in search results")
	public void userClickTheProductCompareLinkInSearchResults() {
	    searchPage = getSearchPageInstance();
	    searchPage.productCompareLinkWebElement().click();
	}
	
	@Then("User verify successfully navigated to the product comparison page")
	public void userVerifySuccessfullyNavigatedToTheProductComparisonPage() {
	    productComparePage = getProductComparePageInstance();
	    String expectedHeader = "Product Comparison";
		Assert.assertEquals(expectedHeader, productComparePage.productComparisonHeaderWebElement().getText());
	}
	
	@When("User click the product compare link in Product category page")
	public void userClickTheProductCompareLinkInProductCategoryPage() {
		productComparePage = getProductComparePageInstance();
		productComparePage.productCompareLinkWebElement().click();
	}
	
	@Then("User verify successfully navigated to the product comparison page from Product Category page")
	public void userVerifySuccessfullyNavigatedToTheProductComparisonPageFromProductCategoryPage() {
		String expectedHeader = "Product Comparison";
		Assert.assertEquals(expectedHeader, productComparePage.productComparisonHeaderWebElement().getText());
	}
	
	@Then("User verify Product Compare page when no products are added for comparison")
	public void userVerifyProductComparePageWhenNoProductsAreAddedForComparison() {
	    String expectedMessage = "You have not chosen any products to compare.";
	    Assert.assertEquals(expectedMessage, productComparePage.noProductMessageWebElement().getText());
	}
	
	@When("User click the continue button in Product category page")
	public void userClickTheContinueButtonInProductCategoryPage() {
		productComparePage.continueButtonWebElement().click();
	}
	
	@Then("User Verify the working of Continue button on the Product Compare page")
	public void userVerifyTheWorkingOfContinueButtonOnTheProductComparePage() {
	    String expectedTitle = "Your Store";
	    Assert.assertEquals(expectedTitle, driver.getTitle());
	}
	
	@When("User click the home icon breadcrumb in Product category page")
	public void userClickTheHomeIconBreadcrumbInProductCategoryPage() {
		productComparePage.homeIconBreadcrumbWebElement().click();
	}

	@Then("User verify the one added product is displayed in the product comparison page")
	public void userVerifyTheOneAddedProductIsDisplayedInTheProductComparisonPage() {
		Assert.assertEquals(searchedProduct, productComparePage.addedProductWebElement().getText());
		Assert.assertTrue(productComparePage.addToCartButtonWebElement().isDisplayed());
		Assert.assertTrue(productComparePage.removeButtonWebElement().isDisplayed());
	}
	
	@Then("User verify the two added products are displayed in the product comparison page")
	public void userVerifyTheTwoAddedProductsAreDisplayedInTheProductComparisonPage() {
	    index = 0;
	    List<WebElement> productsInProductComaparePage = productComparePage.addedProductsWebElement();
	    for(WebElement products : productsInProductComaparePage) {
	    	Assert.assertEquals(addedProducts.get(index), products.getText());
	    	index++;
	    }
	    addedProducts.removeAll(addedProducts);
	}
	
	@Then("User verify the three added products are displayed in the product comparison page")
	public void userVerifyTheThreeAddedProductsAredisplayedInTheProductComparisonPage() {
		index = 0;
	    List<WebElement> productsInProductComaparePage = productComparePage.addedProductsWebElement();
	    for(WebElement products : productsInProductComaparePage) {
	    	Assert.assertEquals(addedProducts.get(index), products.getText());
	    	index++;
	    }
	    addedProducts.removeAll(addedProducts);
	}
	
	@Then("User verify the four added products are displayed in the product comparison page")
	public void userVerifyTheFourAddedProductsAreDisplayedInTheProductComparisonPage() {
		index = 0;
	    List<WebElement> productsInProductComaparePage = productComparePage.addedProductsWebElement();
	    for(WebElement products : productsInProductComaparePage) {
	    	Assert.assertEquals(addedProducts.get(index), products.getText());
	    	index++;
	    }
	    addedProducts.removeAll(addedProducts);
	}
	
	@Then("User Verify that lastest four products are displayed in the Product Comparison page")
	public void userVerifyThatLastestFourProductsAreDisplayedInTheProductComparisonPage() {
		index = 1;
	    List<WebElement> productsInProductComaparePage = productComparePage.addedProductsWebElement();
	    for(WebElement products : productsInProductComaparePage) {
	    	Assert.assertEquals(addedProducts.get(index), products.getText());
	    	index++;
	    }
	    addedProducts.removeAll(addedProducts);
	}
	
	@When("User click the Add to Cart button in product comparison page")
	public void userClickTheAddToCartButtonInProductComparisonPage() {
		productComparePage.addToCartButtonWebElement().click();
	}
	
	@Then("User Verify adding the Products successfully to cart from the product comparison page")
	public void userVerifyAddingTheProductsSuccessfullyToCartFromTheProductComparisonPage() {
		CommonHelperMethods.explicitWaitMethod(driver, productComparePage.addToCartSuccessMessageWebElement());
		boolean addedProduct = false;
		if(productComparePage.addToCartSuccessMessageWebElement().getText().contains(searchedProduct)) {
			addedProduct = true;
		}
		else {
			addedProduct = false;
		}
	    Assert.assertTrue(addedProduct);
	}
	
	@When("User click the remove button in product comparison page")
	public void userClickTheRemoveButtonInProductComparisonPage() {
		productComparePage.removeButtonWebElement().click();
	}
	
	@Then("User Verify removing the Products from the Product Comparison page")
	public void userVerifyRemovingTheProductsFromTheProductComparisonPage() {
		String expectedSuccessMessage = "Success: You have modified your product comparison!";
		String expectedMessage = "You have not chosen any products to compare.";
		Assert.assertEquals(expectedSuccessMessage, productComparePage.removeSuccessMessageWebElement().getText().replace("×", "").trim());
	    Assert.assertEquals(expectedMessage, productComparePage.noProductMessageWebElement().getText());
	}
	
	@Then("User Verify Page Title, Page Heading of the Product Comparison page")
	public void userVerifyPageTitlePageHeadingOfTheProductComparisonPage() {
	    String expectedTitle = "Product Comparison";
	    String expectedHeader = "Product Comparison";
	    Assert.assertEquals(expectedTitle, driver.getTitle());
	    Assert.assertEquals(expectedHeader, productComparePage.productComparisonHeaderWebElement().getText());
	}

}
