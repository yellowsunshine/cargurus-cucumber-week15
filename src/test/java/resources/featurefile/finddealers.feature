Feature: Find the dealers and verify

  @Smoke @Regression
  Scenario Outline: Find the dealers and verify the dealers are in list
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click "Find a Dealer" link
    Then I navigate to ‘car-dealers’ page
    And I should see the dealer names "<dealersName>" are display on page
    Examples:
      | dealersName           |
      | 101 Auto Centre       |
      | 168 Motors            |
      | 1st Choice Car City   |
      | 3 Point Motors - New  |
      | 3 Point Motors Epping |
      | 365 CAR SALES         |
