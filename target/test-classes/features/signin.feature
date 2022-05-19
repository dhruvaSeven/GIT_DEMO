
Feature: Application Login 

@Smoke @Regression
Scenario: Home Page default login 
	Given user is on NetBanking landing page
	When user login into application
	Then HomePage is populates
	And Cards are displayed 


@Regression
Scenario: Home Page Login with invalid credentials 
	Given user is on NetBanking landing page
	When user login into application with username "Sarath" and Password "Saral"
	Then HomePage should not  populated

@Regression	
Scenario: Signup to the NetBanking page
  Given user is on NetBanking landing page
	When user signup into application with below details
	| Dhruva | Kumar | Pulivendula | Kadapa | AndhraPradesh |
	Then HomePage should not  populated
	
Scenario Outline: Home Page default login 
	Given user is on NetBanking landing page
	When user login into application username <Username> and Password <Password>
	Then HomePage is populates
	And Cards are displayed
	
	Examples:
	|Username|Password|
	|Dhruva|98765|
	|Cherry|NoPass|