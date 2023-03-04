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
Feature: Login with a session
	@tag1
  Scenario: Correct Login
    Given the user is in the index page 
    When the user clicks the login button
    And the user clicks on the padlock icon
    And the user clicks on the mail bar
    And the user enters email in the mail bar
    And the user clicks on the pass bar
    And the user enters password in the pass bar
    And the user clicks on iniciar sesión
    Then the login interface appears

@tag2
  Scenario Outline: Incorrect Login
  	Given the user is in the index page
  	When the user clicks the login button
    And the user clicks on the padlock icon
    And the user clicks on the mail bar
    And the user enters <email> in the mail barPARAM
    And the user clicks on the pass bar
    And the user enters <password> in the pass barPARAM
    And the user clicks on iniciar sesión
    And the login error appears <error>
    Then the user refresh page
    

    Examples: 
      | email 				 | password | error                    |
      | eric@gmail.com | 4        | Contraseña invalida      |
      | eric@gmail.com | 12345    | Error de autenticación.  |
      

