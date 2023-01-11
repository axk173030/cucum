@OtherLoginfeature @Regression 
Feature: Techfios Login functionality validation 

Background: 
	Given The user is on Techfios login page 
@OtherScenario1 
Scenario Outline: user should not be able to login with incorrect credentials 


	When The user enters the username as "<username>" 
	When The User enters the password as  "<password>" 
	
	When The user presses the login button 
	Then the user should land on dashboard page 
	
	Examples: 
		|username         |password|
		|demo@techfios.com|1234|
		|demo1@techfios.com|abc123|
		|demo1@techfios.com|abc1234|
		|demo@techfios.com|abc123|
		
		
