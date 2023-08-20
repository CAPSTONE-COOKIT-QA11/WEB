@Login
Feature: Login
  Scenario Outline: Login with valid username and password
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


  Scenario Outline: Login with invalid username and password
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "<username>" as username and "<password>" as password
    And User click login button
    And Show "<pop-up>" as pop-up
    Examples:
      | username   | password | pop-up                                      |
      | admin      | lala123  | Please enter a valid username or password.. |
      | balonku123 | admin    | Please enter a valid username or password.. |
      | balonku123 | lalala   | Please enter a valid username or password.. |
      | admin      |          | Please enter a valid username or password.. |
      |            | admin    | Please enter a valid username or password.. |
      |            |          | Please enter a valid username or password.. |