Feature: Data Table practise


  Scenario: Order Kimchi from Arigato
    Given user is on NambaFood
    When user clicks on foods
    Then user should see "250 best cafe"
    And user should find sushi category
    When user clicks on sushi
    Then user should see list of cafes
    And user should scroll down the page to Arigato cafe
    When user clicks on Arigato
    Then user should see Arigato menu
    And user should find kimchi
    And user should increase quantity of kimchi to 3
    And user should click on order button
    Then user should see 450 soms in cart


    Scenario: Verify following tabs are displayed in Amazon
      Given user is on https://www.amazon.com/
      Then following menu bar should be displayed on menu bar
      | All | Today's Deal | Customer Service | Registry | Gift Cards | Sell|


