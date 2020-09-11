@SmokeTest
Feature: AutomationPractice End to End Test Case

Background: 
Given User open application
And User reach the homepage 

@RegressionTest 
Scenario: Verify the customer or user is able to Login the Application 
	Given User launch the AutomationPractice application 
	When User Click on SignIn Button in the header 
	And User Enter email Id "abcd1ef@gmail.com" in SignIn page 
	And User Enter Password "12345" in SignIn page 
	And User Click SignIn button in SignIn page 
	Then User Verify the UserName displayed in the header 
	
Scenario: Verify the user is able to select the product based on menu navigation 
	When User click on the Menu navigation in the Header 
	And User Click on the Product Selection in the Menu Navigation 
	And User to view the Product in  the page 
	Then User Verify the product in the given page 
	
Scenario: Verify the user is able to place the order 
	When User able to select the product 
	And User able to click the product which customer want 
	And User able to select the quantity, size and color 
	And User click the proceed to checkout 
	And User verify the delivery address 
	And User click the proceed button 
	Then User verify the product which is selected 
	
Scenario: Verify the user is able to click on payment 
	When User able to select the payment mode on the payment page 
	And User click on the Payment mode which he prefers 
	And User click on the confirm order button 
	Then User verify the order is placed or not 
	
Scenario: Failed Verify the user is able to Logout the Application 
	When  Failed User to click on SignOut button 
	Then Failed User verify the logout session 

Scenario: Facebook navigation
	When  user launch the facebook application 
	And User click on login button
	And User click on password button
	And User click on login button
	Then User validate the homepage	
	
	
	
	
