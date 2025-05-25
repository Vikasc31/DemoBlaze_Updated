
Feature: Home page feature
Background:
Given user open chorme browser

Scenario: verify user registration
When open sign up window
And enter valid user "Vikas311"
And enter valid password "Common@22"
And user click sign up button
Then user should see successful sign in alert message

Scenario: verify user login
When navigates to the login window
And the user enters a valid username "Vikas311"
And enters a valid password "Common@22"
And clicks the login button
Then The logged-in users name should be displayed at the top, under the profile name section.

Scenario: verify the product is added to the cart
Given user click to the login window
When user select a specific product
And user click on the Add to cart button
Then product should be visible in the cart

Scenario: verify the mutliple products are added to the cart
Given user click to the login window
When user select multiple product
Then added products should be visible in the cart

Scenario: Verify Cart Functionality
Given user click to the login window
Then Verify that the added products are displayed correctly.
And Verify the subtotal, shipping, and total price calculations.
And Remove a product from the cart and verify that it is no longer displayed.

Scenario: Verify Checkout Process
Given user click to the login window
When Proceed to the checkout page from the cart.
And Click on the Place Order button.
And Add all neccesary details.
And Click on purchase button
Then confirmation message should be visible 
And click on purchase button to final confiramtion

Scenario: Verify Contact Us Form
When Navigate to the contact page.
And Enter valid information in the form fields (name, email, message).
And Click on the send button.
Then Verify that the message is sent successfully and appropriate confirmation message is displayed.