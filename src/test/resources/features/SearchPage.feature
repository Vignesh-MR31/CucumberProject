Feature: Search Page

@TC_SP_001 @Search
Scenario: Verify searching with an existing Product Name
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
Then User verify the searched existing product name is displayed

@TC_SP_002 @Search
Scenario: Verify searching with an non existing Product Name
Given User open the application using the URL
When User enters the product name "Fitbit" in search input text box
When User click the search button
Then User verify the searched non existing product is not displayed

@TC_SP_003 @Search
Scenario: Verify searching without providing any Product Name
Given User open the application using the URL
When User click the search button
Then User verify the searched non existing product is not displayed

@TC_SP_004 @Search
Scenario: Verify searching for a product after login to the Application
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
And User clicks the Login button
When User enters the product name "iMac" in search input text box
When User click the search button
Then User verify the searched existing product name is displayed

@TC_SP_005 @Search
Scenario: Verify searching for a product after login to the Application
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
And User clicks the Login button
When User enters the product name "Mac" in search input text box
When User click the search button
Then User verify the multiple searched products is displayed

@TC_SP_006 @Search
Scenario: Verify all the fields in the Search functionality and Search page have placeholders
Given User open the application using the URL
When User click the search button
Then User verify the fields in the Search functionality and Search page have placeholders

@TC_SP_007 @Search
Scenario: Verify searching using Search Criteria field
Given User open the application using the URL
When User click the search button
When User enters the product name "iMac" in search criteria input text box
When User clicks the search button in search criteria
Then User verify the searched existing product name is displayed

@TC_SP_008 @Search
Scenario: Verify the multiple products searching using Search Criteria field 
Given User open the application using the URL
When User click the search button
When User enters the product name "Mac" in search criteria input text box
When User clicks the search button in search criteria
Then User verify the multiple searched products is displayed

@TC_SP_009 @Search
Scenario: Verify Search using the text from the product description 
Given User open the application using the URL
When User click the search button
When User select the Search in product description checkbox
When User enters the product name "iPhone is a revolutionary new mobile" in search criteria input text box
When User clicks the search button in search criteria
Then User verify the product is searched using the text from the product description 

@TC_SP_010 @Search
Scenario: Verify Search multiple products using the text from the product description 
Given User open the application using the URL
When User click the search button
When User select the Search in product description checkbox
When User enters the product name "Intel Core 2" in search criteria input text box
When User clicks the search button in search criteria
Then User verify the multiple products is searched using the text from the product description 

@TC_SP_011 @Search
Scenario: Verify Search by selecting the category of product
Given User open the application using the URL
When User click the search button
When User enters the product name "iMac" in search criteria input text box
When User select the "27" category from dropdown
When User clicks the search button in search criteria
Then User verify the searched existing product name is displayed

@TC_SP_012 @Search
Scenario: Verify Searching not existing product by selecting the category of product
Given User open the application using the URL
When User click the search button
When User enters the product name "iMac" in search criteria input text box
When User select the "20" category from dropdown
When User clicks the search button in search criteria
Then User verify the searched non existing product is not displayed

@TC_SP_013 @Search
Scenario: Verify Search by selecting to search in subcategories
Given User open the application using the URL
When User click the search button
When User enters the product name "iMac" in search criteria input text box
When User select the 1 category from dropdown
When User User select the Search in sub categories checkbox
When User clicks the search button in search criteria
Then User verify the searched existing product name is displayed

@TC_SP_014 @Search
Scenario: Verify Search by not selecting to search in subcategories
Given User open the application using the URL
When User click the search button
When User enters the product name "iMac" in search criteria input text box
When User select the 1 category from dropdown
When User clicks the search button in search criteria
Then User verify the searched non existing product is not displayed

@TC_SP_015 @Search
Scenario: Verify Grid views when only one Product is displayed in the search results
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click the grid view button
Then User verify the searched product is displayed in grid view

@TC_SP_016 @Search
Scenario: Verify List views when only one Product is displayed in the search results
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click the list view button
Then User verify the searched product is displayed in list view

@TC_SP_017 @Search
Scenario: Verify Grid views when multiple Products is displayed in the search results
Given User open the application using the URL
When User enters the product name "Mac" in search input text box
When User click the search button
When User click the grid view button
Then User verify the searched product is displayed in grid view

@TC_SP_018 @Search
Scenario: Verify List views when multiple Products is displayed in the search results
Given User open the application using the URL
When User enters the product name "Mac" in search input text box
When User click the search button
When User click the list view button
Then User verify the searched product is displayed in list view