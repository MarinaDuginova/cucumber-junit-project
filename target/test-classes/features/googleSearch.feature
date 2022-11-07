Feature: Google search functionality
  User Story : As a user , when I am on the google search page
  I should be able to search whatever i want and see relevant information

 // @wip  this tag means that im currently working with this project

@smoke
  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple in the google search box and clicks enter
    Then user see apple - Google Search is in the google page


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" in google search box and clicks enter
    Then user sees "apple - Google Search" is in the google title