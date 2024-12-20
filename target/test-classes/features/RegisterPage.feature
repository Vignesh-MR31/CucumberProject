Feature: Register Page

@TC_RP_001
Scenario: Navigating to Register Page
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
Then User successfully navigated to Register Page

@TC_RP_002
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

@TC_RP_003
Scenario: Register the new user with empty fields
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Register from the dropdown
When User clicks continue button
Then User verify the warning messages displayed


