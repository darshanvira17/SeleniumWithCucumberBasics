Feature: To test Log In Fucntionality for multiple cases

Scenario Outline: Successful Login 
Given Open the Firefox and load the site			
When Enter the Username "<username>" and Password "<password>" and Hit Login			
Then Success or Failure
Examples: 
					|username  |password | 
      		|admin 		 |12345    |
      		|name2     |7				 |
