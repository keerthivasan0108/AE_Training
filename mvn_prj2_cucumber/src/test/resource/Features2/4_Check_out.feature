Feature: checkout
@set3
Scenario: Checkout
Given Click checkout
When User Fill the Billing address
When User click billing button
When User click shipping button
When User click shipping method button
When User click payment method button
When User click payment info button
When User confirm order
Then Verify that the user Successfully ordered
