@Comment
Feature: add comment
  #Positif Testcase
  Scenario: add comment with comment description and image
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "user1" as username and "Asdfg123" as password
    And User click login button
    Then User allready on home page
    And user click Timeline
    And user click comment logo
    And user already on comment page
    And user input comment on comment field "luar biasa sedap"
    When user click increase image button
    And user click submit button

    #Positif TestCase
  Scenario: add comment withou image
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "user1" as username and "Asdfg123" as password
    And User click login button
    Then User allready on home page
    And user click Timeline
    And user click comment logo
    And user already on comment page
    And user input comment on comment field "Maknyuss"
    And user click submit button

    #Negatif TestCase (BUG FE)
  Scenario: add comment without comment and image
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "user1" as username and "Asdfg123" as password
    And User click login button
    Then User allready on home page
    And user click Timeline
    And user click comment logo
    And user already on comment page
    And user click submit button