Feature: Product Compare Page

@TC_PC_001 @ProductCompare
Scenario: Verify adding the product for comparision
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
Then User verify the product the added and success message displayed  

@TC_PC_002 @ProductCompare
Scenario: Verify the product added in the product comparison page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the added product is displayed in the product comparison page

@TC_PC_003 @ProductCompare
Scenario: Verify adding the product for comparision from Grid View of Search Results page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click the grid view button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the added product is displayed in the product comparison page

@TC_PC_004 @ProductCompare
Scenario: Verify adding the product for comparision from List View of Search Results page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click the list view button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the added product is displayed in the product comparison page

@TC_PC_005 @ProductCompare
Scenario: Verify adding the product for comparision from List View of Product Category or Sub Category page
Given User open the application using the URL
When User click the desktops dropdown
When User click the show all desktops option
When User click the list view button in desktops page
When User click the compare this product icon in desktops page
When User click the product comparison link in desktops page and navigated to product comparison page
Then User verify the added product from desktops page is displayed in the product comparison page

@TC_PC_006 @ProductCompare
Scenario: Verify adding the product for comparision from List View of Product Category or Sub Category page
Given User open the application using the URL
When User click the desktops dropdown
When User click the show all desktops option
When User click the grid view button in desktops page
When User click the compare this product icon in desktops page
When User click the product comparison link in desktops page and navigated to product comparison page
Then User verify the added product from desktops page is displayed in the product comparison page

@TC_PC_007 @ProductCompare
Scenario: Verify adding the product for comparision from Related Product section on Product Display Page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon from related products
When User click the product comparison link and navigated to product comparison page
Then User verify the added product from related products is displayed in the product comparison page

@TC_PC_008 @ProductCompare
Scenario: Verify adding the product for comparision from Featured section on Home Page
Given User open the application using the URL
When User click the compare this product icon from featured products
When User click the product comparison link in featured products page and navigated to product comparison page
Then User verify the added product from featured products page is displayed in the product comparison page

@TC_PC_009 @ProductCompare
Scenario: Verify navigating to Product Compare page from Search results page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click the product compare link in search results
Then User verify successfully navigated to the product comparison page

@TC_PC_010 @ProductCompare
Scenario: Verify navigating to Product Compare page from Product Category page
Given User open the application using the URL
When User click the desktops dropdown
When User click the show all desktops option
When User click the product compare link in Product category page
Then User verify successfully navigated to the product comparison page from Product Category page

@TC_PC_011 @ProductCompare
Scenario: Verify Product Compare page when no products are added for comparison
Given User open the application using the URL
When User click the desktops dropdown
When User click the show all desktops option
When User click the product compare link in Product category page
Then User verify Product Compare page when no products are added for comparison

@TC_PC_012 @ProductCompare
Scenario: Verify the working of Continue button on the Product Compare page
Given User open the application using the URL
When User click the desktops dropdown
When User click the show all desktops option
When User click the product compare link in Product category page
When User click the continue button in Product category page
Then User Verify the working of Continue button on the Product Compare page

@TC_PC_013 @ProductCompare
Scenario: Verify the working of Continue button on the Product Compare page
Given User open the application using the URL
When User click the desktops dropdown
When User click the show all desktops option
When User click the product compare link in Product category page
When User click the home icon breadcrumb in Product category page
Then User Verify the working of Continue button on the Product Compare page

@TC_PC_014 @ProductCompare
Scenario: Verify the Product Comparison page when only one product is added to the page for comparison
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the one added product is displayed in the product comparison page

@TC_PC_015 @ProductCompare
Scenario: Verify the Product Comparison page when when only two products are added to the page for comparison
Given User open the application using the URL
When User enters the product name "iPhone" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the two added products are displayed in the product comparison page

@TC_PC_016 @ProductCompare
Scenario: Verify the Product Comparison page when the same product is added twice to the page for comparison
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the one added product is displayed in the product comparison page

@TC_PC_017 @ProductCompare
Scenario: Verify the Product Comparison page when three products are added to the page for comparison
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "iPhone" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "MacBook Air" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the three added products are displayed in the product comparison page

@TC_PC_018 @ProductCompare
Scenario: Verify the Product Comparison page when four products are added to the page for comparison
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "MacBook Air" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "iPhone" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "MacBook" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User verify the four added products are displayed in the product comparison page

@TC_PC_019 @ProductCompare
Scenario: Verify that more than four products cannot be added to the Product Comparison page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "MacBook Air" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "iPhone" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "MacBook" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User enters the product name "MacBook Pro" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User Verify that lastest four products are displayed in the Product Comparison page

@TC_PC_020 @ProductCompare
Scenario: Verify adding the Products to cart from the Product Comparison page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
When User click the Add to Cart button in product comparison page
Then User Verify adding the Products successfully to cart from the product comparison page

@TC_PC_021 @ProductCompare
Scenario: Verify removing the Products from the Product Comparison page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
When User click the remove button in product comparison page
Then User Verify removing the Products from the Product Comparison page

@TC_PC_022 @ProductCompare
Scenario: Verify Page Title, Page Heading of the Product Comparison page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the compare this product icon
When User click the product comparison link and navigated to product comparison page
Then User Verify Page Title, Page Heading of the Product Comparison page

