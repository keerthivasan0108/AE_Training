
Feature: Login feature


@set3
Scenario Outline: Verify login is successfull with valid login credentials
Given Login page is displayed 
When User Click on Login page
When User enters "<username>" and "<password>"
When Login button clicked
Then The Home Page should be displayed

Examples:

| username	          |	password |	
| dummy0108@gmail.com	|	passwo	 |	

@set4
Scenario Outline: Verify login is unsuccessfull for invalid login credentials
#Given Login page is displayed 
#When User Click on Login page
When User enters "<username>" and "<password>"
When Login button clicked
Then The error "<message>" should be displayed

Examples:

| username	            |	password |	message	                |
| dummy01081@gmail.com	|	passwo	 | No customer account found|