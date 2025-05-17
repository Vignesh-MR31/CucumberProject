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
When User enters "1234567890" password
And User clicks the Login button
Then User verify the My Account page is displayed

@TC_LP_003 @Login
Scenario: Login with valid email and invalid password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
And User clicks the Login button
Then User verify the warning message displayed

@TC_LP_004 @Login
Scenario: Login with invalid email and valid password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymrs@gmail.com" email address
When User enters "123456789" password
And User clicks the Login button
Then User verify the warning message displayed

@TC_LP_005 @Login
Scenario: Login with invalid email and invalid password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymrs@gmail.com" email address
When User enters "1234567890" password
When User clicks the Login button
Then User verify the warning message displayed

@TC_LP_006 @Login
Scenario: Login without providing any credentials
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks the Login button
Then User verify the warning message displayed

@TC_LP_007 @Login
Scenario: Navigating to forgot your password page
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks the forgotten password link
Then User successfully navigated to forgot your password page

@TC_LP_008 @Login
Scenario: Enter the email and password using keyboard keys
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters the "Vickymr@gmail.com" email address using tab key
When User enters the "123456789" password using tab key
When User clicks the Login button
Then User verify the My Account page is displayed

@TC_LP_009 @Login
Scenario: User verify the E-Mail Address and Password fields have the placeholder
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
Then User verify the the E-Mail Address and Password fields have the placeholder

@TC_LP_010 @Login
Scenario: User Verify Logging into the Application and browsing back using Browser back button 
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "123456789" password
When User clicks the Login button
Then User clicks the browser back button

@TC_LP_011 @Login
Scenario: User Verify Loggingout from the Application and browsing back using Browser back button
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "123456789" password
When User clicks the Login button
When User clicks the My Account dropdown
When User clicks the Logout from the dropdown
Then User clicks the browser back button

@TC_LP_012 @Login
Scenario: User Verify the change your password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "12345678" password
When User clicks the Login button
When User clicks the change your password link
When User enters the "123456789" in password field in change password
When User enters the "123456789" in password confirm field in change password
When User clicks the continue button
Then User verify the success message displayed after changing the password

@TC_LP_013 @Login
Scenario: User Verify Logging into the Application after changing the password
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "123456789" password
When User clicks the Login button
When User clicks the change your password link
When User enters the "1234567890" in password field in change password
When User enters the "1234567890" in password confirm field in change password
When User clicks the continue button
When User clicks the My Account dropdown
When User clicks the Logout from the dropdown
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
When User clicks the Login button
Then User verify the My Account page is displayed

@TC_LP_014 @Login
Scenario: User Verify Navigating to Register page from login page by clicking continue button
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks new customer continue button
Then User successfully navigated to Register Page

@TC_LP_015 @Login
Scenario: User Verify Navigating to Register page from login page by clicking Register column Option
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks Register column option
Then User successfully navigated to Register Page

@TC_LP_016 @Login
Scenario: User Verify Navigating to Forgotten Password page from login page by clicking Forgotten Password column Option
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks Forgotten Password column option
Then User successfully navigated to forgot your password page

@TC_LP_017 @Login @Logout
Scenario: User Verify Logging out by selecting Logout option from My Account dropmenu
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
When User clicks the Login button
When User clicks the My Account dropdown
And User select Logout from the dropdown
Then User verify successfully logging out

@TC_LP_018 @Login @Logout
Scenario: User Verify Logging out by selecting Logout option from Right Column options
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
When User clicks the Login button
And User click the Logout from Right Column options
Then User verify successfully logging out

@TC_LP_019 @Login @Logout
Scenario: User Verify Logout option is not displayed under My Account menu before logging In
Given User open the application using the URL
When User clicks the My Account dropdown
Then User verify Logout option is not displayed in dropdown

@TC_LP_020 @Login @Logout
Scenario: User Verify Logout option is not displayed under Right Column options before logging in
Given User open the application using the URL
When User clicks the My Account dropdown
Then User verify Logout option is not displayed under Right Column Options

@TC_LP_021 @Login @Logout
Scenario: User Verify Logging out by selecting Logout option from My Account dropmenu
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
When User clicks the Login button
When User clicks the My Account dropdown
When User select Logout from the dropdown
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
Then User successfully navigated to Login Page

@TC_LP_022 @Login @Logout
Scenario: User Verify the Logout Page Title after Logged Out
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User enters "Vickymr@gmail.com" email address
When User enters "1234567890" password
When User clicks the Login button
When User clicks the My Account dropdown
When User select Logout from the dropdown
Then User verify the Logout page title
  