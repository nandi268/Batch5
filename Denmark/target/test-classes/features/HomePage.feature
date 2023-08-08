@Home
Feature: User is able to use home page and validate all the features
  I want to use the home page

  @Home1
 Scenario: Search the "Tomoato" on the home page
    Given Launch the webpage 
    When Search the tomoato
    Then Validate product is displayed
    
    
     @Home1_01 @smoke2 @Regression
 Scenario: Search the "Cucumber" on the home page
    Given Launch the webpage 
   When Search the product "Cucumber"
   Then Verify product "Cucumber - 1 Kg" is displayed
   
       @Home1_02 @smoke2 @Regression
 Scenario: Search the "Beetroot" on the home page
    Given Launch the webpage 
   When Search the product "Beetroot"
   Then Verify product "Beetroot - 1 Kg" is displayed
   
   @Home1_03 @smoke2 @Regression
 Scenario: Search the "Brocolli" on the home page
    Given Launch the webpage 
   When Search the product "Brocolli"
   Then Verify product "Brocolli - 1 Kg" is displayed
   
    @Home1_04 @smoke2 @Regression
 Scenario: Search the "Beans" on the home page
   Given Launch the webpage on chrome 
   When Search the product on home page "Brocolli"
   Then Verify the product "Brocolli - 1 Kg" is displayed  
    
      @Home2
 Scenario: Add the product to the cart
    Given Launch the webpage 
    When Search the tomoato
    Then Validate product is displayed
    When Add the produc to the cart
    And Open the cart window
    Then Verify the product is added to the cart
    
  @Home3  
    Scenario: Verify the search functionality for non existing products
       Given Launch the webpage 
       When Search the product "Ginger"
       Then Verify product is not displayed
       
         @Home4  
    Scenario: Verify the search functionality for non existing products
       Given Launch the webpage 
       When Search the product "Kiwi"
       Then Verify product is not displayed
       
   @Home4_10
  Scenario Outline: Title of your scenario outline
    Given Launch the webpage   
    When Search the product with the name <productName> on the home page
    Then I verify the product is dispayed <status> on the home page
    Examples: 
      | name  | productName | status  |
      | name1 |     Brocolli | success |
      | name2 |     Brocolli | Fail    |
      
      @Login02
  Scenario Outline: Title of your scenario outline
    Given Launch the webpage 
    When Search the product on the home page <productname> and password <password>
    Then I verify login is success

    Examples: 
      | productname  | password |
      | Brocolli |     nandi123 |
      | Brocolli |     nakfkalfj123$ |
         | Beans |     koalr123$$ |



 
