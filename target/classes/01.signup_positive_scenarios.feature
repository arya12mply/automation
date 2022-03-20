Feature: Validation on signup page positive test scenarios

#user should be able to signup with valid credentials

Scenario: verify that the browser is launched
Given Launch the URL
Then verify Navigated to signup page

Scenario: verify that the logo is displayed
Then verify logo is diplayed on signup page

Scenario: verify clicking on login navigates to login page
When clicks on the login button
Then verify navigated to login page

Scenario: verify hovering on find group id displays tooltip
When hovered over find group id
Then verify groupid tooltip is displayed

Scenario: verify hovering on find ssn displays tooltip
When hovered over find ssn
Then verify ssn tooltip is displayed

Scenario: verify entering valid credentials user is brought to create account section
When valid credentials entered as member details
And click on proceed
Then verify navigated to create acccount page

Scenario: verify that clicking on terms and condition displats terms and condition
When click on terms and conditions
Then verify brought to terms and conditions

Scenario: verify entering valid details in member section navigates to OTP page
When valid credentials entered as create account details
And click on create account
Then verify navigated to OTP page	

Scenario: verify entering valid otp registers user
When valid otp is entered
Then verify user is successfully registered




