#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: SearchClothes

Scenario Outline: Show Women Clothes

Given the user is in the index page
When the user clicks the cross button
And the user clicks the search button
And the user clicks in the search bar
And the user enters <article> in the search bar
And the user clicks the seaarch button
And the <article> list appears
Then go init page

Examples:
|article| 
|abrigo|
|pantalones|