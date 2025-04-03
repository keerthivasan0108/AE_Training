Feature: Add to cart

@set3
Scenario Outline: Verify the user able to add to cart the product 
When User choose "<categories>"
When User Click on "<product>"
When User Click Add to cart


Examples:

|	categories	|	product									|
|	Books				|	Computing and Internet	|
|	Books				|	Fiction									|




