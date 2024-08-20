 @Login @Smoke @Regression
Feature: Login
  @Positive
  Scenario: Successful login with valid credentials
    Given User is on Login page
    When User enters "John Doe" and "ThisIsNotAPassword"
    Then User is navigated to the home page
    
    @Negetive
     Scenario:  login with invalid credentials
    Given User is on Login page
    When User enters "InvalidUsernsme" and "InvalidPassword"
    Then User should see the error Massage "Login failed! Please ensure the username and password are valid."