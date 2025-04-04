Feature: Login feature

@set2
Scenario Outline: Verify login is successfull with valid login credentials
Given Login page is displayed 
When User enters "<username>" and "<password>"
When Login button clicked
Then The application should display the message "<message>"

Examples:

| username	    |	password	    |	message	  |
| standard_user	|	secret_sauce	|	Products	|
| standard_user	|	secret_sauce1	|	Epic sadface: Username and password do not match any user in this service	|