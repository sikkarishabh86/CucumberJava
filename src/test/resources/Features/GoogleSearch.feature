Feature: Google search functionality

  Scenario: Validate google search is working
    Given Browser is open
    And User is on search page
    When User enters a text in search box
    And Hits enter
    Then User is navigated to search results
