Feature: Search Functionality

  @Sanity @Regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click "Search Cars" link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make       | model  | location    | price  |
      | Audi       | A4     | Perth       | 15,000 |
      | Honda      | Accord | All         | 7,500  |
      | Mitsubishi | Lancer | New England | 40,000 |
      | Mini       | Cooper | All         | 30,000 |
      | Maserati   | 3200   | Melbourne   | 90,000 |
      | Ford       | Fiesta | Sydney      | 20,000 |

  @Regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click "Used" link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make  | model    | location    | price  |
      | Audi  | A3       | Perth       | 35,000 |
      | Honda | Accord   | All         | 10,000 |
      | BMW   | 5 Series | New England | 90,000 |
      | Mini  | Cooper   | Hunter      | 30,000 |
      | Honda | Jazz     | Far West    | 90,000 |
      | Ford  | Fiesta   | Sydney      | 20,000 |
