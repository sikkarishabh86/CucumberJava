Feature: feature to test login functionality

	@smoketest
  Scenario: Check login is successful with valid creadentials
    Given USer is on login page
    When user enter username and password
    And Clicks on login button
    Then User is navigated to the homepage