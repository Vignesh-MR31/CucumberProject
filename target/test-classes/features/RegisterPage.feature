Feature: Register Page

@TC_RP_001 @Register
Scenario: Navigating to Register Page
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
Then User successfully navigated to Register Page

@TC_RP_002 @Register
Scenario: Register the new user
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the personal details and passwords
|firstName|lastName   |email           |telephone |password |passwordConfirm|
|vicky		|M R        |@gmail.com|1234567890|1234567  |1234567				|
When User selects subscribe radio button as "yes"
When User selects privacy policy checkbox
When User clicks continue button
Then User verify the account is successfully registered

@TC_RP_003 @Register
Scenario: Register the new user with empty fields
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User clicks continue button
Then User verify the warning messages displayed in fields

@TC_RP_004 @Register
Scenario Outline: Registering the multiple users
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the personal details and passwords
|firstName  |lastName   |email  |telephone  |password  |passwordConfirm|
|<firstName>|<lastName> |<email>|<telephone>|<password>|<passwordConfirm>|
When User selects subscribe radio button as "yes"
When User selects privacy policy checkbox
When User clicks continue button
Then User verify the account is successfully registered

Examples:
|firstName|lastName   |email           		|telephone |password |passwordConfirm|
|Tester   |one        |@gmail.com|1234567890|123456789|123456789      |
|Tester   |two        |@gmail.com|2234567890|223456789|223456789      |

@TC_RP_005 @Register
Scenario: Register the already registered user
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the personal details and passwords
|firstName|lastName   |email           |telephone |password |passwordConfirm|
|vicky		|M R        |vickymr@gmail.com|1234567890|1234567  |1234567				|
When User selects subscribe radio button as "yes"
When User selects privacy policy checkbox
When User clicks continue button
Then User verify the warning message displayed in register page

@TC_RP_006 @Register
Scenario: Register the user account when No option is selected for Newsletter field
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the personal details and passwords
|firstName|lastName   |email           |telephone |password |passwordConfirm|
|vicky		|R          |@gmail.com|1234567890|1234567  |1234567				|
When User selects subscribe radio button as "no"
When User selects privacy policy checkbox
When User clicks continue button
Then User verify the account is successfully registered

@TC_RP_007 @Register
Scenario: User Verify Navigating to Login page from Register page by clicking Login column option
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User clicks Login column option
Then User successfully navigated to Login Page

@TC_RP_008 @Register
Scenario: User Verify Navigating to Login page from Register page by clicking login page link
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User clicks Login page link
Then User successfully navigated to Login Page

@TC_RP_009 @Register
Scenario: User verify the warning messages by entering space in all fields
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the space " " in the mandatory fields
When User selects subscribe radio button as "no"
When User clicks continue button
Then User verify the warning messages displayed in fields

@TC_RP_010 @Register
Scenario: User verify the whether the Privacy Policy checkbox option is not selected by default
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
Then User verify the Privacy Policy checkbox is not selected by default

@TC_RP_011 @Register
Scenario: User verify Registering the Account without selecting the Privacy Policy checkbox option
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the personal details and passwords
|firstName|lastName   |email           |telephone |password |passwordConfirm|
|vicky		|R          |@gmail.com|1234567890|1234567  |1234567				|
When User selects subscribe radio button as "no"
When User clicks continue button
Then User verify the warning message displayed when registering the account without selecting the Privacy Policy checkbox

@TC_RP_012 @Register
Scenario: User verify characters in password and confirm password field is hidden
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the password "pass1234" in password field
When User enter the password "pass1234" in confirm password field
Then User verify the characters in password and confirm password field is hidden

@TC_RP_013 @Register
Scenario: User Verify Navigating to privacy policy popup from Register page by clicking privacy policy link
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User clicks privacy policy link
Then User verify the privacy policy

@TC_RP_014 @Register
Scenario: User Verify Navigating to Forgotten Password from Register page by clicking Forgotten Password link
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User clicks Forgotten Password Option in Register Page
Then User verify the Forgotten Password Page is displayed

@TC_RP_015 @Register
Scenario: User Verify the Registring an Account by filling different characters in Password field and Password Confirm field
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the personal details and passwords
|firstName|lastName   |email           |telephone |password |passwordConfirm|
|vicky		|R          |@gmail.com |1234567890|1234567  |7654321 				|
When User selects subscribe radio button as "yes"
When User selects privacy policy checkbox
When User clicks continue button
Then User verify the warning message when entering mismatched passwords