Feature: Registration Functionality

Scenario: User creates an account only with mandatory field
Given User navigate to Registration Account page
When User enters the details into below fields 
|firstName  |Rakesh                      |
|lastNmae   |Kumar                       |
|email      |raj984657843@gmail.com           |
|telephone  |1234567890                  |
|password   |12345                       |
And User select privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an account  with all fields
Given User navigate to Registration Account page
When User enters the details into below fields 
|firstName  |Rakesh                      |
|lastNmae   |Kumar                       |
|email      |raj2983454879@gmail.com          |
|telephone  |1234568990                  |
|password   |12345                       |
And User selects yes for Newsletter
And User select privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an Duplicates account 
Given User navigate to Registration Account page
When User enters the details into below fields 
|firstName  |Rakesh                      |
|lastNmae   |Kumar                       |
|email      |raj2435@gmail.com           |
|telephone  |1234567890                  |
|password   |12345                       |
And User selects yes for Newsletter
And User select privacy policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email


Scenario: User creates an  account without filling any details
Given User navigate to Registration Account page
When User dont enters any details into fields
And Clicks on continue button
Then User should get a proper warning message for every mandatory field
 




















