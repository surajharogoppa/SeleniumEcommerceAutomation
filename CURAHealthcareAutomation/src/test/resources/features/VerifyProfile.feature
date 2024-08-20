 @Profile
Feature: Profile Page Verification

  Scenario: User navigating to Profile Page
    Given User is on Homepage
    When User Clicks On MenuBar and clicks On Profile
    Then User is navigated to the Profile page