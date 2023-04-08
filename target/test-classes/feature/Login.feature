Feature: I have going to do Login Functionalty

Scenario: Login with valied Credentials
Given User has navigated to login page
When Users enter valid email address "amotooricap9@gmail.com" into email field
And User has entered valid password "12345" into password vield
And User clicks on Login Button
Then User should get successfully loged in

Scenario: Login with invalied Credentials
Given User has navigated to login page 
When Users enter invalid email address "amotooricap4565469@gmail.com" into email field
And User has entered invalid password "1234647755" into password vield
And User clicks on Login Button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with valid email and invalied password
Given User has navigated to login page 
When Users enter valid email address "amotooricap9@gmail.com" into email field
And User has entered invalid password "1234676555" into password vield
And User clicks on Login Button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with invalid email and valied password
Given User has navigated to login page
When Users enter invalid email address "amotooricap5463459@gmail.com" into email field
And User has entered valid password "12345" into password vield
And User clicks on Login Button
Then  User should get a proper warning message about credentials mismatch


Scenario: Login without providing any credentials
Given User has navigated to login page
When Users dont enter email address into email field
And User dont enter password into password field
And User clicks on Login Button
Then User should get a proper warning message about credentials mismatch



















