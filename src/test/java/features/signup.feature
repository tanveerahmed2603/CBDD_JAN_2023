Feature: Signup

  @Signup
  Scenario: User should able to create one Talent tek account
    Given user is in Talentek Homepage
    When user click on create new account button
    And user enter firstname
    And user enter lastname
    And user enter unique email address
    And user enter password
    And user enter confirm password
    And user provide Birth month , day and year
    And user select gender
    And user click on Terms checkbox
    And user click on Create my account button
    Then user should see "Thank you for sign up" message


