@LoginFeature1 @Regression
Feature: Techfios Login functionality validation 
@Scenario11
Scenario: user should be able to login with correct credentials 
	Given The user is on Techfios login page 
	
	When The user enters the username as "demo@techfios.com" 
	When The User enters the password as  "abc123" 
	
	When The user presses the login button 
	Then the user should land on dashboard page 
@Scenario2	@Smoke
Scenario: user should be able to login with correct credentials 
	Given The user is on Techfios login page 
	
	When The user enters the username as "demo@techfios.com" 
	When The User enters the password as  "abc123" 
	
	When The user presses the login button 
	Then the user should land on dashboard page 
	
	
	
