Feature: Search Page

  @SearchPage @Cookit
  Scenario: User search for recipes
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Arumcute1" as username and "Arum353535" as password
    And User click login button
    Then User already on Home Page
    And User click search icon button
    Then User already on search page
    When User click recipes tab on search page
    Then User click search field on search page
    And User input "ayam" search field on search page
    And List of recipe name contains "ayam" will appear

  @SearchPage @Cookit
  Scenario: User search for people
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Arumcute1" as username and "Arum353535" as password
    And User click login button
    Then User already on Home Page
    And User click search icon button
    Then User already on search page
    When User click people tab on search page
    Then User click search field on search page
    And User input "Arum12" search field on search page
    And List of username contains "Arum12" will appear