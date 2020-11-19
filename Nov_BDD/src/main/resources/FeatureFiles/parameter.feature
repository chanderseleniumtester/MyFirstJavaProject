Feature: Login OrangeHRM

Scenario Outline: OrangeHRM page test with multiple data
Given OpenHRM WebPage 
Then User verified home page
	And verify user name
	And verify password
When I enter my username as <username>
When I enter my password as <password>
And Click on login
Then Check OrangeHRM Page
	And Click on logout 

Examples:
    |	username 		 | password |
    |  qaplanet1   | lab1		  |
    |  qaplanet2   | lab2		  |
