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

@SearchFeature
Feature: Search Page Check feature
  I want to use this template for my feature file

	@Smoke
  Scenario: Google Home Page
    Given User is on landing page
    And some other precondition
    When User search for "searchterm"
    Then Search result is displayed

  @Regression
	Scenario: Data table demo
    Given User is on landing page
    And some other precondition
    When data table demo step
    | utk | jai | om |
    Then Search result is displayed

	@Regression
  Scenario Outline: Login check for multiple user
  	Given User is on landing page
    And some other precondition
    When User login with <Username> and <Password>
    Then Search result is displayed
     
  Examples:
  |Username |Password			|
  |utk			|voltage123		|
  |jai			|voltage321		|
  
  
  
  
  