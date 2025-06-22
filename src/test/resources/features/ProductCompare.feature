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
When User click the compare this product icon in search results
Then User verify successfully navigated to the product comparison page
