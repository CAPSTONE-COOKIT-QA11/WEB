@RecipeDetail
  Feature: Recipe Detail Pages
    Scenario: Add to cart
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "userverif1" as username and "Asdfg123" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      And User click + on but ingredient field
      And User click add to cart

    Scenario: Add comment
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "userverif1" as username and "Asdfg123" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      When Input "WAH MURAH BANGET" as comment
      And User click submit for add comment

    Scenario: Like recipe
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "userverif1" as username and "Asdfg123" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      And User like recipe nasi goreng

    Scenario: Reply Recipe
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "userverif1" as username and "Asdfg123" as password
      And User click login button
      Then User allready on home page
      And User click search button
      And User click recipe nasi goreng
      Then User already on recipe detail page
      And User click three dots button
      And User click reply
      When User input "Kalian semua harus coba ini" as reply
      And User click submit for reply

    Scenario: Recook Recipe
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "userverif1" as username and "Asdfg123" as password
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
