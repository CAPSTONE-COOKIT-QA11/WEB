@EditProfile
Feature: Edit Profile User
#  Positif Tasecase
#  Scenario: Edit Username and increase Bio on profile
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    When User input "Jajanan123" as username and "Jajanan1" as password
#    And User click login button
#    Then User allready on home page
#    And user click profile
#    And user click profile on pop on menu profile
#    Then user allready in profile page
#    And user click pen and paper logo on profile information
#    Then user already on Edit Profile page
#    And user Change and input new username "New Jajanan"
#    And user input Bio in bio field "Comming Back"
#    And user click save button

#  Scenario: Change Image
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    When User input "Jajanan123" as username and "Jajanan1" as password
#    And User click login button
#    Then User allready on home page
#    And user click profile
#    And user click profile on pop on menu profile
#    Then user allready in profile page
#    And user click pen and paper logo on profile information
#    Then user already on Edit Profile page

#  Positif TaseCase
#  Scenario: Change Password with appropriate password
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    When User input "Jajanan123" as username and "Jajanan1" as password
#    And User click login button
#    Then User allready on home page
#    And user click profile
#    And user click profile on pop on menu profile
#    Then user allready in profile page
#    And user click pen and paper logo on profile information
#    Then user already on Edit Profile page
#    And user input current password "Jansen1997"
#    And user Input new password "Jansen1998"
#    And user back input confirm new password "Jansen1998"
#    And user click save button

#  Negatif TestCase
  Scenario Outline: Change Password with unapproproate password
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Jajanan123" as username and "Jajanan1" as password
    And User click login button
    Then User allready on home page
    And user click profile
    And user click profile on pop on menu profile
    Then user allready in profile page
    And user click pen and paper logo on profile information
    Then user already on Edit Profile page
    And user input current password "<CurrentPassword>"
    And user Input new password "<NewPassword>"
    And user back input confirm new password "<ConfirmNewPassword>"
    And user click save button
    Examples:
      | CurrentPassword | NewPassword | ConfirmNewPassword |
      |                 | Jansen      | Jajan              |
      | 123             | Jajan       | Jansen             |
      | Jansen1995      | jajan123    |                    |





