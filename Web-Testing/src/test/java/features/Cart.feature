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
@tag
Feature: Test cart

  @tag1
  Scenario: Add to cart
    Given the user is in the index page
    When the user selects category <category>
    And the user scrolls down
    And the user selects product <data-id-product> 
    And the user adds to cart the dress 
    And the user clicks cart 
    Then the user remove from cart the dress
    And go init page

    Examples: 
      | data-id-product | category |
      | https://www.coosy.es/6541-large_default/vestido-katefucsia-.jpg | image-form_9306980921766042  | 
      
   @tag2
   Scenario Outline: Increase-Decrease number dresses
    Given the user is in the index page
    When the user selects category <category>
    And the user scrolls down
    And the user selects product <data-id-product> 
    And the user adds to cart the dress 
    And the user clicks cart 
    And the user increases number of dresses 
    And the user decraesses number of dresses
    Then the user remove from cart the dress 
    And go init page

    Examples: 
      | data-id-product | category |
      | https://www.coosy.es/6541-large_default/vestido-katefucsia-.jpg | image-form_9306980921766042  | 
   
       

      
      