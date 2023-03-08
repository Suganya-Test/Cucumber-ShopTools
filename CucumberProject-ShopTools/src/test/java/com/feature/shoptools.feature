Feature: Online Shopping Site

Scenario: Selecting product

Given User launch the url
When User search the product and click 
And User click the color and select balck colour
And User click the size and select M size
And User click the add to cart
And User click the cart bag
And User click the proceed to cart
Then See page shown

Scenario: Place order

When User click the First Name and send "Suganya"
And User click the Last Name and send "Amirthaganesh"
And User click the country and select the country
And User click the Street address and send address
And User click the street address second and send address
And User click the town and send the name of the town
And User click the state and select the state
And User click the Pincode and send the Pincode
And User click the Phone and send the phone number
And User click the email and send the email
And User click the check box
And User click the place order
And User click the order details