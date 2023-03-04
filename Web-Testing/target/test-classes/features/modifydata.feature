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
Feature: Modify Data

  @tag1
  Scenario: Modify all data
    Given the user is in the index page 
    When the user clicks the login button
    And the user clicks on the padlock icon
    And the user clicks on the mail bar
    And the user enters email in the mail bar
    And the user clicks on the pass bar
    And the user enters password in the pass bar
    And the user clicks on iniciar sesión
    And the user refresh page
    And the user clicks the login button
    And the user clicks on see my account 
    And the user scrolls down
    And the user clicks on information 
    And the user clicks on Sra <value>
    And the user change name bar <name>
    And the user change surname bar <surname>
    And the user enters the password 
    And the user accepts policity
    Then the user clicks on save
    And reset driver
    And go init page
    And the user clicks the login button
    And the user close sesion
    
    Examples:
		|name | surname        | value |
		|Aleix| Casas Barco    | 2     |
		|Eric | Subirana Garcia| 1     |
		
	@tag2
	Scenario Outline: Change password
		Given the user is in the index page 
    When the user clicks the login button
    And the user clicks on the padlock icon
    And the user clicks on the mail bar
    And the user enters email in the mail bar
    And the user clicks on the pass bar
    And the user enters password in the pass bar
    And the user clicks on iniciar sesión
    And the user refresh page
    And the user clicks the login button
    And the user clicks on see my account 	
    And the user scrolls down
    And the user clicks on information
    And the user change the password
    And the user accepts policity
    Then the user clicks on save
    And reset driver
    And go init page
    And the user clicks the login button
    And the user close sesion
		
    
  
