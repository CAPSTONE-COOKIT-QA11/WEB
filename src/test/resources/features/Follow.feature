@Follow
Feature: Follow
#  Scenario: Following another user
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    When User input "user1" as username and "Asdfg123" as password
#    And User click login button
#    Then User allready on home page
#    And user click profile photo another user on recipes page
#    When user already on profile page another user
#    And user click follow button

#  Scenario: Following another user
#    Given User allready on landing page
#    When User click sign in button
#    Then User allready on login page
#    When User input "Jansen 1745" as username and "Jajan1997" as password
#    And User click login button
#    Then User allready on home page
#    And user click profile
#    And user click profile on pop on menu profile
#    Then user allready in profile page
#    And user click followers
#    When user allready on followers page
#    And user Click follow back in one of another user

  Scenario: Following another user
    Given User allready on landing page
    When User click sign in button
    Then User allready on login page
    When User input "Jansen 1745" as username and "Jajan1997" as password
    And User click login button
    Then User allready on home page
    And user click profile
    And user click profile on pop on menu profile
    Then user allready in profile page
    And user click following
    When user already on following page
    And user click unfollow on one of another user
