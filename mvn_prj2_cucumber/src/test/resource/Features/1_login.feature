Feature: Login feature

@set1
Scenario: Verify login is successfull with valid login credentials
Given Login page is displayed 
When User enters username and password
When Login button clicked
Then The application should display the message Products

