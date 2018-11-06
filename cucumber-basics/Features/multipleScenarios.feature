@tag
Feature: Test Log In, Log Out

  @tag1
  Scenario: Successful Login Functionality
   Given Open the Firefox, Load the site			
		When Enter the Correct Uname and Pword and Hit Login			
		Then Success it is!

  @tag2
  Scenario: Unsuccessful Login Functionality
    Given Open the Firefox, Load the site			
		When Enter the Incorrect Uname and Pword and Hit Login			
		Then Failure it is!