Feature: Login Page

@TC_LP_001 @Login
Scenario: Navigating to Login Page
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
Then User successfully navigated to Login Page

@TC_LP_002 @Login
Scenario: Login with valid credentials
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "12345678" password
And User clicks the Login button
Then User verify the My Account page is displayed

@TC_LP_003 @Login
Scenario: Login with valid email and invalid password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "123456789" password
And User clicks the Login button
Then User verify the warning message displayed

@TC_LP_004 @Login
Scenario: Login with invalid email and valid password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymrs@gmail.com" email address
When User enters "12345678" password
And User clicks the Login button
Then User verify the warning message displayed

@TC_LP_005 @Login
Scenario: Login with invalid email and invalid password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymrs@gmail.com" email address
When User enters "123456789" password
And User clicks the Login button
Then User verify the warning message displayed

@TC_LP_006 @Login
Scenario: Login without providing any credentials
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
And User clicks the Login button
Then User verify the warning message displayed

@TC_LP_007 @Login
Scenario: Navigating to forgot your password page
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
And User clicks the forgotten password link
Then User successfully navigated to forgot your password page

@TC_LP_008 @Login
Scenario: Enter the email and password using keyboard keys
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters the "Vickymr@gmail.com" email address using tab key
When User enters the "12345678" password using tab key
And User clicks the Login button
Then User verify the My Account page is displayed