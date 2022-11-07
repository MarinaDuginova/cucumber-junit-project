Feature: Etsy Title Verification
  User Story:
  User is on https://www.etsy.com
  User sees title is as expected.

  Background:
  Given User in on Etsy home page


    Scenario: Title Verification on Etsy
    Then User sees title is as expected.

      Scenario: Etsy Search Functionality Title Verification
        When User types Wooden Spoon in the search box
        And User clicks search button
        Then User sees Wooden Spoon is in the title

        Scenario: Etsy Search Functionality Title Verification
          When User types "Wooden Spoon" in the search box
          And User clicks search button
          Then User sees Wooden Spoon is in the title



