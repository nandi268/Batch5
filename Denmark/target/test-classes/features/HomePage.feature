@Home
Feature: User is able to use home page and validate all the features
  I want to use the home page

  @Home1
 Scenario: Search the "Tomoato" on the home page
    Given Launch the webpage 
    When Search the tomoato
    Then Validate product is displayed
    
      @Home2
 Scenario: Add the product to the cart
    Given Launch the webpage 
    When Search the tomoato
    Then Validate product is displayed
    When Add the produc to the cart
    And Open the cart window
    Then Verify the product is added to the cart


 
