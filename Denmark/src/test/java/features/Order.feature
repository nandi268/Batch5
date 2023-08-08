@Order
Feature: Order the products
  User is able to order the products

  @Order_001 @Regression
  Scenario: User is able to place the single product order
   Given Launch the webpage 
   When Search the product "Tomato"
   When Add the produc to the cart
   And Open the cart window
   #Then Verify the product is added to the cart
   
    And Continue Proceed to checkout
   Then Place the order 
    And Select the Term & Conditions
    Then Proceed to place the order
    Then Verify order is success
    
    
    
    
    
    
    
    
    
      @Order_002 
  Scenario: User is able to place the two products order
   Given Launch the webpage 
   When Search the product "Tomato"
   When Increment the quantity"4"
   When Add the produc to the cart
   When Search the product "Potato"
   When Increment the quantity"5"
   When Decrement the quantity"2"
   When Add the produc to the cart
   And Open the cart window
   #Then Verify the product is added to the cart
   
    And Continue Proceed to checkout
   Then Place the order 
    And Select the Term & Conditions
    Then Proceed to place the order
    Then Verify order is success

 
