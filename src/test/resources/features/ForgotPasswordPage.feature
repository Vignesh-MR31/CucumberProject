Feature: Forgot Password Page

@TC_FP_001 @ForgotPassword
Scenario: User verify the email is sent to registered email account
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks the forgotten password link
When User Enters the existing "ForgotPassword@gmail.com" email address
And User clicks the continue button in Forgot Password Page
Then User verify the reset password email is sented message is displayed 

@TC_FP_002 @ForgotPassword
Scenario: User verify the email is not sent to non-registered email account
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks the forgotten password link
When User Enters the existing "NonRegistered@gmail.com" email address
And User clicks the continue button in Forgot Password Page
Then User verify the email address not found message is displayed 

@TC_FP_003 @ForgotPassword
Scenario: User verify the Placehold text is displayed in the E-Mail Address field of Forgotten Password page
Given User open the application using the URL
When User clicks the My Account dropdown
When User select Login from the dropdown
When User clicks the forgotten password link
Then User verify the placehold text is displayed in the E-mail address field
