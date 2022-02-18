
Feature: Login

Background:
Given launch browser

@Sanity
Scenario: Validate Google Home
	Given launch browser
	And user is on search page
	When user enters atext in search box as "JsonPlaceholder"
	Then user is navigated to search results

@Regression
Scenario Outline: Validate Google Home1
	Given launch browser
	And user is on search page
	When user enters atext in search box as "<searchText>"
	Then user is navigated to search results
Examples:
	| searchText |
	| JsonPlaceholder |
	| PVG |


	
