 @Booking @Smoke @Regression @Critical)
Feature: Appointment Confirmation


  Scenario: Fill the form and Appointment Confirmation
    Given User is on home page
    When User Select The Facility as "Hongkong CURA Healthcare Center"
    And User Click on Checkbox
    And User Select Health program RadioButton
    And User Enters the Date as "20/05/2024"
    And User Enters The Comment As "HEY I NEED A APPOINTMENT"
    And Click on BookAppointment
    Then Appointment Should be Confirmed
