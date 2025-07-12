Feature: Product Display Page

@TC_PD_001 @ProductDisplay
Scenario: Verify the Light box view of the main Thumbnail image is displayed
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the main Thumbnail image displayed on the Product Display Page
Then User verify the Light box view of the main Thumbnail image is displayed

@TC_PD_002 @ProductDisplay
Scenario: Verify user able to navigate through other images in light box view when clicking right arrow button
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the main Thumbnail image displayed on the Product Display Page
Then User clicks the right arrow button and verify able to navigate through other images in light box view

@TC_PD_003 @ProductDisplay
Scenario: Verify user able to navigate through other images in light box view when clicking left arrow button
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the main Thumbnail image displayed on the Product Display Page
Then User clicks the left arrow button and verify able to navigate through other images in light box view

@TC_PD_004 @ProductDisplay
Scenario: Verify the Light box view of the main Thumbnail image is displayed
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the main Thumbnail image displayed on the Product Display Page
When User click the close button in the light box view
Then User verify the light box view is closed

@TC_PD_005 @ProductDisplay
Scenario: Verify user able to navigate through other images in light box view when clicking right arrow button after selecting second normal sized image
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the second normal Thumbnail image displayed on the Product Display Page
Then User clicks the right arrow button and verify able to navigate through other images in light box view

@TC_PD_006 @ProductDisplay
Scenario: Verify that Product Name, Brand and Product Code are displayed in the Product Display Page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
Then User verify the product name displayed in the Product Display Page

@TC_PD_007 @ProductDisplay
Scenario: Verify the availabilty status of the Product in the Product Display Page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
Then User verify the availabilty status of the Product in the Product Display Page

@TC_PD_008 @ProductDisplay
Scenario: Verify the default quanity for the Product is displayed as 1 in the Product Display Page when there is no minimum quantity set for the Product
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
Then User verify the default quantity of the Product is displayed as 1

@TC_PD_009 @ProductDisplay
Scenario: Verify user able to update the quantity in the Product Display Page and added to the shopping cart page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User update the quantity of the product to "2"
When User click on the add to cart button in the Product Display Page 
Then User verify the success message after product added to the add to cart page

@TC_PD_010 @ProductDisplay
Scenario: Verify the description of the Product in the Product Display Page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
Then User verify the description of product is displayed

@TC_PD_011 @ProductDisplay
Scenario: Verify the description of the Product in the Product Display Page
Given User open the application using the URL
When User enters the product name "Apple Cinema 30" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click on the specification tab in the Product Display Page
Then User verify the specifications of product listed in the Product Display Page

@TC_PD_012 @ProductDisplay
Scenario: Verify the User is able to write a review for the Product from the Reviews tab of Product Display Page
Given User open the application using the URL
When User enters the product name "Apple Cinema 30" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click on the review tab in the Product Display Page
When User enter the name "Tester" in the Your name text box
When User enters the review in the Your review text box
When User select the 1 Bad or Good rating
When User click on continue button in the review tab
Then User verify the success message displayed after clicking the continue button 

@TC_PD_013 @ProductDisplay
Scenario: Verify the Reviews tab when there are no reviews or zero reviews added
Given User open the application using the URL
When User enters the product name "Apple Cinema 30" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click on the review tab in the Product Display Page
Then User verify no reviews is added in reviews tab

@TC_PD_014 @ProductDisplay
Scenario: Verify the error message displayed when name is not filled in the Reviews tab of Product Display Page
Given User open the application using the URL
When User enters the product name "Apple Cinema 30" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click on the review tab in the Product Display Page
When User enter the name "" in the Your name text box
When User enters the review in the Your review text box
When User select the 3 Bad or Good rating
When User click on continue button in the review tab
Then User verify the error message displayed when name is not filled

@TC_PD_015 @ProductDisplay
Scenario: Verify the error message displayed when review is not filled in the Reviews tab of Product Display Page
Given User open the application using the URL
When User enters the product name "Apple Cinema 30" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click on the review tab in the Product Display Page
When User enter the name "Tester" in the Your name text box
When User select the 3 Bad or Good rating
When User click on continue button in the review tab
Then User verify the error message displayed when review is not filled

@TC_PD_016 @ProductDisplay
Scenario: Verify the error message displayed when rating is not selected in the Reviews tab of Product Display Page
Given User open the application using the URL
When User enters the product name "Apple Cinema 30" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click on the review tab in the Product Display Page
When User enter the name "" in the Your name text box
When User enters the review in the Your review text box
When User click on continue button in the review tab
Then User verify the error message displayed when rating is not selected

@TC_PD_017 @ProductDisplay
Scenario: Verify Write a review link under Add to Cart button on the Product Display page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click the Write a review link
Then User verify the write a review form is displayed in the product display page 

@TC_PD_018 
Scenario: Verify average of the user reviews should be dispalyed under the Add to Cart button of the Product Display page
Given User open the application using the URL
When User enters the product name "iMac" in search input text box
When User click the search button
When User click on the product displayed in the search results
Then User verify the number of reviews is displayed in the product display page 

@TC_PD_019 @ProductDisplay
Scenario: Verify adding the product to Wish List from the Product Display page
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "123456789" password
And User clicks the Login button
When User enters the product name "Mac" in search input text box
When User click the search button
When User click on the product displayed in the search results
When User click on Add to Wish List button in the Product Display page
Then User verify the product is successfully added to the wish list

