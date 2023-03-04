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
Feature: Join Newsletter
 @tag1
  Scenario: Correct newsletter submit
    Given the user is in the index page
    When the user scrolls down
    And the user clicks the accept policy button
    And the user clicks the email bar
    And the user enters <email> in the email bar
    And the user clicks the subscribe button
    And the correct <subscription> message appears
    And the user scrolls up
    Then go init page
    
 Examples: 
  | email        |  subscription |
  | c12@gmail.com | Se ha suscrito correctamente al boletín de noticias. |
  | c13@gmail.com | Se ha suscrito correctamente al boletín de noticias. |
  
  
@tag2
  Scenario Outline: Incorrect newsletter submit
    Given the user is in the index page
    When the user scrolls down
    And the user clicks the accept policy button
    And the user clicks the email bar
    And the user enters <email> in the email bar
    And the user clicks the subscribe button
    And the incorrect subscription message appears
    And the user scrolls up
    Then go init page
    
Examples: 
  | email        |  
  | c12@gmail.com |
  | c13@gmail.com |

   

  
    

   
