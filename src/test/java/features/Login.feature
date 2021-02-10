Feature: Validate Login Functionality 

Background: 
	Given User is on the Techfios LoginPage 
	
#Scenario:  User should be able to login with valid credentials 
#	When User enters username as "demo@techfios.com" 

@Scenario2	
Scenario Outline:  User should be able to login with valid credentials and open a new account 
	When User enters the "<username>" and "<password>"        
	And  User clicks on login button   
	
	Then User should be able to see the dashboard       
	When User clicks on bank and cash   
	When User clicks on new account  
	When User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
	Then User should be able to see validate 
	Examples:
	|username         |password|
	|demo@techfios.com|abc123|
	
