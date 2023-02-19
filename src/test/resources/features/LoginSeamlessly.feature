Feature: Login functionality tests

  @validLogin
  Scenario: Login with valid credential
    Given the user is on the login page
    When the user enter correct username
    And the user enter valid password
    And the user clicks the login button
    Then the user should be able to login