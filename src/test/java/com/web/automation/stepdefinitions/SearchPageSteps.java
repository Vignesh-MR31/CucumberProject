package com.web.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.automation.base.TestContext;
import com.web.automation.pages.SearchPage;
import com.web.automation.utils.CommonHelperMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class SearchPageSteps {
	
	private WebDriver driver;
	public SearchPage searchPage;
	
	public SearchPageSteps(TestContext context) {
		this.driver = context.driver;
	}
	
	private SearchPage searchPageInstance() {
		searchPage = new SearchPage(driver);
		return searchPage;
	}
	
	@When("User enters the product name {string} in search input text box")
	public void userEntersTheProductNameInSearchInputTextBox(String product) {
		searchPageInstance();
	    searchPage.searchInputTextboxWebElement().sendKeys(product);
	}
	
	@When("User click the search button")
	public void userClickTheSearchButton() {
		searchPageInstance();
	    searchPage.searchIconButtonWebElement().click();
	}
	
	@Then("User verify the searched existing product name is displayed")
	public void userVerifyTheSearchedExistingProductNameIsDisplayed() {
	    String searchedProduct = searchPage.searchInputTextboxWebElement().getAttribute("value");
	    Assert.assertEquals(searchedProduct, searchPage.firstProductHeaderWebElement().getText());
	}

	@Then("User verify the searched non existing product is not displayed")
	public void userVerifyTheSearchedNonExistingProductIsNotDisplayed() {
	    String expectedMessage = "There is no product that matches the search criteria.";
	    Assert.assertEquals(expectedMessage,searchPage.noProductMessageWebElement().getText());
	}
	
	@Then("User verify the multiple searched products is displayed")
	public void userVerifyTheMultipleSearchedProductsIsDisplayed() {
		String searchedProduct = searchPage.searchInputTextboxWebElement().getAttribute("value").toLowerCase();
		boolean product = false;
		List<WebElement> multipleProducts = searchPage.multipleProductsWebElements();
		for(WebElement searchedMultipleProducts :multipleProducts) {
			if(searchedMultipleProducts.getText().toLowerCase().contains(searchedProduct)) {
				product = true;
			}
			else {
				product = false;
				break;
			}
		}
		Assert.assertTrue(product);
	}
	
	@Then("User verify the fields in the Search functionality and Search page have placeholders")
	public void userVerifyTheFieldsInTheSearchFunctionalityAndSearchPageHavePlaceholders() {
	   String expectedSearchPlaceholder = "Search";
	   String expectedSearchCriteriaPlaceholder = "Keywords";
	   Assert.assertEquals(expectedSearchPlaceholder, searchPage.searchInputTextboxWebElement().getAttribute("placeholder"));
	   Assert.assertEquals(expectedSearchCriteriaPlaceholder, searchPage.searchCriteriaWebElement().getAttribute("placeholder"));
	}
	
	@When("User enters the product name {string} in search criteria input text box")
	public void userEntersTheProductNameInSearchCriteriaInputTextBox(String product) {
	    searchPage.searchCriteriaWebElement().sendKeys(product);
	}
	
	@When("User clicks the search button in search criteria")
	public void userClicksTheSearchButtonInSearchCriteria() {
		searchPage.searchButtonWebElement().click();
	}
	
	@When("User select the Search in product description checkbox")
	public void userSelectTheSearchInProductDescriptionCheckbox() {
	    searchPage.productDescriptionCheckboxWebElement().click();
	}
	
	@Then("User verify the product is searched using the text from the product description")
	public void userVerifyTheProductIsSearchedUsingTheTextFromTheProductDescription() {
	   String enteredDescription = searchPage.searchCriteriaWebElement().getAttribute("value").toLowerCase();
	   boolean product = false;
	   if(searchPage.firstDescriptionWebElement().getText().toLowerCase().contains(enteredDescription)) {
		   product = true;
	   }
	   Assert.assertTrue(product);
	}
	
	@Then("User verify the multiple products is searched using the text from the product description")
	public void userVerifyTheMultipleProductsIsSearchedUsingTheTextFromTheProductDescription() {
		String enteredDescription = searchPage.searchCriteriaWebElement().getAttribute("value").toLowerCase();
		boolean product = false;
		List<WebElement> searchedProducts = searchPage.searchedProductsDescriptionWebElement();
		for(WebElement products :searchedProducts) {
			if(products.getText().toLowerCase().contains(enteredDescription)) {
				product = true;
			}
			else {
				product = false;
				break;
			}
		}
		Assert.assertTrue(product);
	}

	@When("User select the {string} category from dropdown")
	public void userSelectTheCategoryFromDropdown(String categoryOption) {
		CommonHelperMethods.selectDropdownByValue(searchPage.categoryDropdownWebElement(), categoryOption);
	}

	@When("User select the {int} category from dropdown")
	public void userSelectTheCategoryFromDropdown(int index) {
		CommonHelperMethods.selectDropdownByIndex(searchPage.categoryDropdownWebElement(), index);
	}
	
	@When("User User select the Search in sub categories checkbox")
	public void userUserSelectTheSearchInSubCategoriesCheckbox() {
	    searchPage.subcategoryCheckboxWebElement().click();
	}

	@When("User click the grid view button")
	public void userClickTheGridViewButton() {
	    searchPage.gridViewButtonWebElement().click();
	}
	
	@Then("User verify the searched product is displayed in grid view")
	public void userVerifyTheSearchedProductIsDisplayedInGridView() {
	   String expectedStatus = "active";
	   boolean selectedStatus = false;
	   if(searchPage.gridViewButtonWebElement().getAttribute("class").contains(expectedStatus)) {
		   selectedStatus = true;
	   }
	   else {
		   selectedStatus = false;
	   }
	   Assert.assertTrue(selectedStatus);
	}
	
	@When("User click the list view button")
	public void userClickTheListViewButton() {
		searchPage.listViewButtonWebElement().click();
	}
	
	@Then("User verify the searched product is displayed in list view")
	public void userVerifyTheSearchedProductIsDisplayedInListView() {
		String expectedStatus = "active";
		   boolean selectedStatus = false;
		   if(searchPage.listViewButtonWebElement().getAttribute("class").contains(expectedStatus)) {
			   selectedStatus = true;
		   }
		   else {
			   selectedStatus = false;
		   }
		   Assert.assertTrue(selectedStatus);
	}
}
