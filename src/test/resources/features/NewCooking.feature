@NewCooking
Feature: New Cooking
#  Scenario: add new new Cooking with complete data
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    When User input "Jajanan123" as username and "Jajanan1" as password
#    And User click login button
#    Then User allready on home page
#    And User Click new post
#    And user click new cooking
#    And user input "Sate Balado" on Description field
#    And input image new cooking
#    And user click submit new Cooking
#    Then user already on dashboard page

#Positif TestCase
#  Scenario: add new new Cooking without Image
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    When User input "Jajanan123" as username and "Jajanan1" as password
#    And User click login button
#    Then User allready on home page
#    And User Click new post
#    And user click new cooking
#    And user input "Sate Balado" on Description field
#    And user click submit new Cooking
#    Then user already on dashboard page

#Negatif TestCase (BUG BE)
  Scenario: add new Cooking Without Description and Image
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Jajanan123" as username and "Jajanan1" as password
    And User click login button
    Then User allready on home page
    And User Click new post
    And user click new cooking
    And user click submit new Cooking
    Then user already on dashboard page
