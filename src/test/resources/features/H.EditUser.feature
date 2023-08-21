@EditProfile
Feature: Edit Profile User
#  Positif Tasecase
  @Cookit
  Scenario: Edit Username and increase Bio on profile
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Makanan12" as username and "Makananku3" as password
    And User click login button
    Then User allready on home page
    And user click profile
    And user click profile on pop on menu profile
    Then user allready in profile page
    And user click pen and paper logo on profile information
    Then user already on Edit Profile page
    And user Change and input new username "MakananLocal"
    And user input Bio in bio field "LuarBiasaEnakk"
    And user click save button

#POSITIFCASE
  @Cookit
  Scenario: Change Password with appropriate password
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "MakananLocal" as username and "Makananku3" as password
    And User click login button
    Then User allready on home page
    And user click profile
    And user click profile on pop on menu profile
    Then user allready in profile page
    And user click pen and paper logo on profile information
    Then user already on Edit Profile page
    And user input current password "Makananku3"
    And user Input new password "Makananku1"
    And user back input confirm new password "Makananku1"
    And user click save button

#  Negatif TestCase
  @Cookit
  Scenario Outline: Change Password with unapproproate password
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Raditya" as username and "Radit12345" as password
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





