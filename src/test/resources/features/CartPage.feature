Feature: Cart Page

  @Cookit @CartPage
  Scenario: User checkout item
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Arumcute1" as username and "Arum353535" as password
    And User click login button
    Then User already on Home Page
    And User click cart icon button
    Then User already on cart page
    And List of added item will appear
    When user click on checkbox on selected item
    Then User verify total price
    And User click checkout button
    And User already on payment page

  @Cookit @PurchasePage
  Scenario: User checkout item to detail payment page
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Arumcute1" as username and "Arum353535" as password
    And User click login button
    Then User already on Home Page
    And User click cart icon button
    Then User already on cart page
    And List of added item will appear
    When user click on checkbox on selected item
    Then User verify total price
    And User click checkout button
    And User already on payment page
    When User click on choosen delivery option
    Then User click on choosen payment method
    And User click place order button
    And Password confirmation pop-up will appear
    And User input "Arum353535" as confirm password
    And User click confirm button
    And User already on Detail Purchase page

  @Payment @Cookit
  Scenario: User pay for placed order
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Arumcute1" as username and "Arum353535" as password
    And User click login button
    Then User already on Home Page
    And User click cart icon button
    Then User already on cart page
    And List of added item will appear
    When user click on checkbox on selected item
    Then User verify total price
    And User click checkout button
    And User already on payment page
    When User click on choosen delivery option
    Then User click on choosen payment method
    And User click place order button
    And Password confirmation pop-up will appear
    And User input "Arum353535" as confirm password
    And User click confirm button
    And User already on Detail Purchase page
    And User copy the virtual account number that displayed on detail purchased page
    And User click back button
    And User already on my purchase page
    When User click on shipped tab

