@Register
Feature: Register
#  Scenario Outline: Register with valid username and password
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    And User click sign up button
#    When User input "<username>" as username and "<email>" as email and "<password>" as password
#    And User click sign up button on register page
#  Examples:
#    | username | email          | password  |
#    | Didito   | Ditio@gmail.com | Didito1235 |

#Negatif Test Case
  Scenario Outline: Register unsucces registration
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    And User click sign up button
    When User input "<username>" as username and "<email>" as email and "<password>" as password
    And User click sign up button on register page
    Examples:
      | username   | email          | password  |
      | Didit      | Diti@gmail.com | Didit1235 |
      | Didit      | dodo@gmail.com | 123456    |
      |            | Diti@gmail.com | Didit1234 |
      | Jansen1717 | Jansen@gmail   |Jansen1997 |


