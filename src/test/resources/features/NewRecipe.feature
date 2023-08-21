@NewRecipe
  Feature: Add New Recipe
    Scenario Outline: Add new recipe with valid data
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "userverif1" as username and "Asdfg123" as password
      And User click login button
      Then User allready on home page
      And User click new post button
      And User click new recipe
      Then User allready on new recipe page
      When Input "<recipe title>" as recipe title
      And Input "<description>" as description
      And choose one image
      And Click + button for add new ingredient
      When Input "<first ingredient name>" as first ingredient name, "<first ingredient quantity>" as first ingredient quantity, and "<first ingredient unit>" as first ingredient unit
      And Input "<second ingredient name>" as second ingredient name, "<second ingredient quantity>" as second ingredient quantity, and "<second ingredient unit>" as second ingredient unit
      And Click + button for add new step
      When Input "<first step>" as first step
      And Input "<second step>" as second step
      And Checklist sell ingredient
      When Input "<price>" as price
      And Click submit button
      Then User already on recipe detail page
      Examples:
        | recipe title | description                   | first ingredient name | first ingredient quantity | first ingredient unit | second ingredient name | second ingredient quantity | second ingredient unit | first step      | second step   | price |
        | Sate Kelinci | Terbuat dari kelinci tetangga | Kelinci Betina        | 3                         | Ekor                  | Kelinci Jantan         | 1                          | Ekor                   | Siapkan Kelinci | Siapkan Bumbu | 50000 |

    Scenario Outline: Add new recipe with invalid data
      Given User allready on landing page
      When User click sign in button
      Then User allready on login page
      When User input "userverif1" as username and "Asdfg123" as password
      And User click login button
      Then User allready on home page
      And User click new post button
      And User click new recipe
      Then User allready on new recipe page
      When Input "<recipe title>" as recipe title
      And Input "<description>" as description
      And choose one image
      And Click + button for add new ingredient
      When Input "<first ingredient name>" as first ingredient name, "<first ingredient quantity>" as first ingredient quantity, and "<first ingredient unit>" as first ingredient unit
      And Input "<second ingredient name>" as second ingredient name, "<second ingredient quantity>" as second ingredient quantity, and "<second ingredient unit>" as second ingredient unit
      And Click + button for add new step
      When Input "<first step>" as first step
      And Input "<second step>" as second step
      And Checklist sell ingredient
      When Input "<price>" as price
      And Click submit button
      Then User already on recipe detail page
      Examples:
        | recipe title | description                   | first ingredient name | first ingredient quantity | first ingredient unit | second ingredient name | second ingredient quantity | second ingredient unit | first step      | second step   | price |
        |              | Terbuat dari kelinci tetangga | Kelinci Betina        | 3                         | Ekor                  | Kelinci Jantan         | 1                          | Ekor                   | Siapkan Kelinci | Siapkan Bumbu | 50000 |
        | Sate Kelinci |                               | Kelinci Betina        | 3                         | Ekor                  | Kelinci Jantan         | 1                          | Ekor                   | Siapkan Kelinci | Siapkan Bumbu | 50000 |
        | Sate Kelinci | Terbuat dari kelinci tetangga |                       | 3                         | Ekor                  | Kelinci Jantan         | 1                          | Ekor                   | Siapkan Kelinci | Siapkan Bumbu | 50000 |
        | Sate Kelinci | Terbuat dari kelinci tetangga |                       |                           |                       | Kelinci Jantan         | 1                          | Ekor                   | Siapkan Kelinci | Siapkan Bumbu | 50000 |
        | Sate Kelinci | Terbuat dari kelinci tetangga | Kelinci Betina        | 3                         | Ekor                  |                        |                            |                        | Siapkan Kelinci | Siapkan Bumbu | 50000 |
        | Sate Kelinci | Terbuat dari kelinci tetangga | Kelinci Betina        | 3                         | Ekor                  | Kelinci Jantan         | 1                          | Ekor                   |                 |               | 50000 |
        | Sate Kelinci | Terbuat dari kelinci tetangga | Kelinci Betina        | 3                         | Ekor                  | Kelinci Jantan         | 1                          | Ekor                   | Siapkan Kelinci | Siapkan Bumbu |       |