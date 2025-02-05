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
|vicky		|M R        |vicky@1gmail.com|1234567890|1234567  |1234567				|
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
|Tester   |one        |TesterOne@gmail.com|1234567890|123456789|123456789      |
|Tester   |two        |TesterTwo@gmail.com|2234567890|223456789|223456789      |


@TC_RP_005 @Register
Scenario: Register the already registered user
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User enters the personal details and passwords
|firstName|lastName   |email           |telephone |password |passwordConfirm|
|vicky		|M R        |vicky@1gmail.com|1234567890|1234567  |1234567				|
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
|vicky		|R          |vicky@2gmail.com|1234567890|1234567  |1234567				|
When User selects subscribe radio button as "no"
When User selects privacy policy checkbox
When User clicks continue button
Then User verify the account is successfully registered