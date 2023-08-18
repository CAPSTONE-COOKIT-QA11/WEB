@Login
Feature: Login
  Scenario Outline: Login with username and password
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "<username>" as username and "<password>" as password
    And User click login button
    Then User allready on home page
    Examples:
      | username   | password |
      | admin      | admin    |
      | user1      | Asdfg123 |
      | userverif1 | Asdfg123 |