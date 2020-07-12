Feature: Test login unctionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    And User clicks on login
    Then User is navigated to the homepage

    Examples: 
      | username | password |
      | Rishabh  |    12345 |
      | rish     |    12345 |
