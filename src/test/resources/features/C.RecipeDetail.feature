@RecipeDetail
  Feature: Recipe Detail Pages
    @Cookit @RecipeDetail
    Scenario: Add to cart
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "Arum11223" as username and "Arum34561" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      And User click + on but ingredient field
      And User click add to cart

    @Cookit
    Scenario: Add comment
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "Arum11223" as username and "Arum34561" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      When Input "WAH MURAH BANGET" as comment
      And User click submit for add comment

    @Cookit
    Scenario: Like recipe
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "Arum11223" as username and "Arum34561" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      And User like recipe nasi goreng

    @Cookit
    Scenario: Reply Recipe
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "Arum11223" as username and "Arum34561" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      And User click three dots button
      And User click reply
      When User input "Kalian semua harus coba ini" as reply
      And User click submit for reply

#    @Cookit
    Scenario: Recook Recipe
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "Arum11223" as username and "Arum34561" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      And User click three dots button
      And User click recook
      Then User already on recook page
      When User input "45000" as price
      And User click submit for recook
      Then User already on recipe detail page
