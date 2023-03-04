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
Feature: Wish List 

  @tag1
  Scenario: Error when try to add wish list
    Given the user is in the index page  
    When the user selects category <category>
    And the user clicks heart
    And the error message shows up
    And the user refresh page
    Then go init page
    
   Examples: 
    | category |
    | image-form_9306980921766042  | 
    
  @tag2
  Scenario Outline: Add wish list
    Given the user is in the index page 
    When the user clicks the login button
    And the user clicks on the padlock icon
    And the user clicks on the mail bar
    And the user enters email in the mail bar
    And the user clicks on the pass bar
    And the user enters password in the pass bar
    And the user clicks on iniciar sesión  
    And the user refresh page
    And the user selects category <category>
    And the user clicks heart
    And the message shows up
    And the user refresh page
    Then go init page
    
    Examples: 
    | category |
    | image-form_9306980921766042  | 
    
    @tag3
    Scenario Outline:
    Given the user is in the index page 
    When the user clicks icon wish list
    And the user clicks on list of wishes 
    And the user clicks on delete
    Then go init page
    
