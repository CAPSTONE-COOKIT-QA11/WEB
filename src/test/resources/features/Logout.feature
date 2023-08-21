@Logout
  Feature: Logout account
    Scenario: Success logout account
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "admin" as username and "admin" as password
      And User click login button
      Then User allready on home page
      And User click profile menu
      And User click logout
      And User click Yes
      Then User allready on login page

    Scenario: Cancel logout account
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "admin" as username and "admin" as password
      And User click login button
      Then User allready on home page
      And User click profile menu
      And User click logout
      And User click No
      Then User allready on home page