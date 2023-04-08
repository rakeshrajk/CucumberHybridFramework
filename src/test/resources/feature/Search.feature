Feature: Search functionality

Scenario: User search for valid product
Given User open the Application
When User enters valid product "HP" into search box field
And User clicks on the Search button
Then User should get valid product displayed in search result

Scenario: User search for an invalid product
Given User open the Application 
When User enters invalid product "Honda" into search box field
And User clicks on the Search button
Then User should get a message about no product matching

Scenario: User search without any product
Given User open the Application 
When User dont enter any product name into the search box field
And User clicks on the Search button
Then User should get a message about no product matching

