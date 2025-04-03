Feature: Verify Shopping cart

@set3
Scenario: Verify the products added to the cart
When User Check on Shopping cart
When User add a Product
Then User remove a Product
