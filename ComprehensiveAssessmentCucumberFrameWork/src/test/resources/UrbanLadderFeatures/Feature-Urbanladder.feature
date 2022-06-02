Feature: Feature to test the Urbanladder website


Scenario Outline: verify the login page with valid inputs

Given move the mouse on login icon in homepage
And click on the login and land on loginpage
When user enters the <email> in emailbox
And enter the <password> in passwordbox
Then click on login button
And Take screenshot 

Examples:

|email|                          |password|     
|harshithkrnagar0000@gmail.com|  |Pa##w0rd|     

Scenario Outline: user should search the product and add it to cart

Given move the mouse on login icon in homepage
And click on the login and land on loginpage
When user enters the <email> in emailbox
And enter the <password> in passwordbox
Then click on login button
Given Uer should send <product> to search bar
And click on search icon and navigated to result page
When user click on the product it navigated to product details
And the product should be added to cart
Then Take sceenshot and navigate back

Examples:

|product|
|Sofa|
 
Scenario: user should verify the product added to cart

Given move the mouse on login icon in homepage
And click on the login and land on loginpage
When user enters the <email> in emailbox
And enter the <password> in passwordbox
Then click on login button
Given Click on carticon in home page
When user navigated to cart verify the product present
And remove the added item from the cart
Then take screenshot and navigate back
 
Scenario: user should select the product from study dropdown and to wishlist

Given move the mouse on login icon in homepage
And click on the login and land on loginpage
When user enters the <email> in emailbox
And enter the <password> in passwordbox
Then click on login button
Given user should hover on the study
When user should click the item from study dropdown
And in the result page add the item to wishlist
Then take screenshot and navigate from study page to home page

Scenario: user should verify the product added to wishlist

Given move the mouse on login icon in homepage
And click on the login and land on loginpage
When user enters the <email> in emailbox
And enter the <password> in passwordbox
Then click on login button
Given user should click on wishlist icon
When user navigated to wishlist verify the product added
And remove the added item from wishlist
Then take screenshot and navigate from wishlist to home page

Scenario: user should verify beds in explore products section

Given user should click on beds in explore products section
And verify it is navigated to page by verifying the text
Then take screenshot and navigate from beds  to home page

Scenario: user should verify the Gift cards in home page

Given click on Gift Cards icon in home page
When navigated to result page verify the text present
Then take screenshot and navigate from Gift card to home page

Scenario: user should select two products from decor section and compare

Given move the mouse on login icon in homepage
And click on the login and land on loginpage
When user enters the <email> in emailbox
And enter the <password> in passwordbox
Then click on login button
Given click on the Decor dropdown in the homePage
And select Wall art from the dropdown
When it is navigated to the next page hover on product1
And click on add to compare to add the product1 to compare
Then User should hover on the Product2
And add Product2 to add to compare
And click on compare button
Then cpature screenshot and navigate back to home page from wall art page

Scenario: User should verify the About Us Page by verifying the text

Given User should click on the About us in the footer section
When it is navigated to About us page verify the text in the page
Then take snapshot of the About us page and navigate back to the home page

Scenario: verify the text in the shipping and delivery in the footer

Given click on the shipping & delivery in the footer
When navigated to shipping and delivery page verify the text
Then capture screenshot and navigate from shipping page to home page
