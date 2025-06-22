package com.web.automation.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
	String searchedProduct;
	private LandingPage landingPage;
	String firstProduct;
	String relatedProduct;
	String featuredProduct;
	
	public ProductCompareSteps(TestContext context) {
		super(context);
		this.driver = context.driver;
	}
	
	@When("User click on the product displayed in the search results")
	public void userClickOnTheProductDisplayedInTheSearchResults() {
		searchPage = getSearchPageInstance();
		searchedProduct = searchPage.firstProductHeaderWebElement().getText();
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
	public void userClickTheProductComparisonLinkInFeaturedProductsPageAndNavigatedToProductComparisonPage() {
		CommonHelperMethods.javaScriptScrollIntoView(driver, landingPage.productComparisonLinkWebElement());
		landingPage.productComparisonLinkWebElement().click();
		String expectedHeader = "Product Comparison";
		Assert.assertEquals(expectedHeader, landingPage.productComparisonHeaderWebElement().getText());
	}
	
	@Then("User verify the added product from featured products page is displayed in the product comparison page")
	public void userVerifyTheAddedProductFromFeaturedProductsPageIsDisplayedInTheProductComparisonPage() {
		Assert.assertEquals(featuredProduct, landingPage.addedProductWebElement().getText());
	}
	
	@When("User click the compare this product icon in search results")
	public void userClickTheCompareThisProductIconInSearchResults() {
	    searchPage = getSearchPageInstance();
	    searchPage.productCompareLinkWebElement().click();
	}
	
	@Then("User verify successfully navigated to the product comparison page")
	public void userVerifySuccessfullyNavigatedToTheProductComparisonPage() {
	    productComparePage = getProductComparePageInstance();
	    String expectedHeader = "Product Comparison";
		Assert.assertEquals(expectedHeader, productComparePage.productComparisonHeaderWebElement().getText());
	}
}
