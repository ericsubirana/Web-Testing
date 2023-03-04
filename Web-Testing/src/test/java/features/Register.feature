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
Feature: Register Test

  @tag1
  Scenario: Correct Register
    Given the user is in the index page 
    When the user clicks the login button
    And the user clicks on the padlock icon
		And the user clicks on create account
		And the user clicks on Sr
		And the user enters his name 
		And the user enters his surnames
		And the user enters his mail
		And the user enters his psd
		And the user enters birth date
		And the user accepts policity
		Then the user clicks on save
		And the user clicks the login button
		And the user close sesion
		
	@tag2 
	Scenario Outline: Incorrect Register -> email repeated
		Given the user is in the index page 
    When the user clicks the login button
    And the user clicks on the padlock icon
		And the user clicks on create account
		And the user clicks on Sr
		And the user enters his name 
		And the user enters his surnames
		And the user enters his mail
		And the user enters his psd
		And the user enters birth date
		And the user accepts policity
		Then the user clicks on save
		And email repeated error appears
		
		@tag3 
	Scenario Outline: Incorrect Register -> password error
		Given the user is in the index page 
    When the user clicks the login button
    And the user clicks on the padlock icon
		And the user clicks on create account
		And the user clicks on Sr
		And the user enters his name 
		And the user enters his surnames
		And the user enters his mail
		And the user enters his psd
		And the user enters birth date
		And the user accepts policity
		Then the user clicks on save
		And email repeated error appears
		And go init page
		
		
