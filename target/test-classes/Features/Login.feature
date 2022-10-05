Feature: HRM Login Test Case

Scenario: Check whether the user is able to login with valid username and password
	Given First user should open chrome browser navigate to HRM website
	And Enter the following details for login and click Login button
	|UserName|Password|
	|Admin   |admin123|
	
Scenario: Search employee using username and also by employee name
	Given Click on Admin element
	Then Give Username as "Admin"
	Then Give Username as "Admin" and employeeName as "Paul Collings"
	
Scenario: Apply for leave
	Given Click Leave element
	Then Click on Apply option
	Then Select leave type
	Then Choose the dates
	Then give the reason 
	Then click Apply button
	