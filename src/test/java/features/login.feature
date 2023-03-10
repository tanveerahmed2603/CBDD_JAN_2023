Feature: Login Feature

  @regression @smoke @sanity
  Scenario: User should be able to login with valid credentials
    Given user is in Talentek Homepage
    And user enter valid email address
    And User enters valid password
    When user click on login button
    Then user should be successfully able to login

  @smoke @hb
  Scenario: User should not be able to login with invalid  password
    Given user is in Talentek Homepage
    And user enter valid email address
    And User enters invalid password
    When user click on login button
    Then user should see "You have entered an incorrect email or student Id."

  Scenario: User should not be able to login with invalid email
    Given user is in Talentek Homepage
    And user enter invalid email adress
    And User enters valid password
    When user click on login button
    Then user should see "You have entered an incorrect email or student Id."

  Scenario: User should not be able to login with invalid email and password
    Given user is in Talentek Homepage
    And user enter invalid email adress
    And User enters invalid password
    When user click on login button
    Then user should see "You have entered an incorrect email or student Id."

