Feature: Validate Login Functionality 

Background: 
	Given User is on the Techfios LoginPage 
	
@BankAccountlogin 
Scenario Outline: 
	When User enters the "<username>" and "<password>" 
	When  User clicks on login button 
	Then User should be able to see the dashboard 
	When User clicks on bank and cash 
	When User clicks on new account 
	When User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
	Then User should be able to see validate  
	Examples: 
	
|username          |password    |accountTitle|description|initialBalance|accountNumber|contactPerson|phone |internetBankingUrl|
|demo@techfios.com |abc123		|Testing     |Saving     |500           |23232322     |rewwrde     |345333|WWW.BOFA.COM|