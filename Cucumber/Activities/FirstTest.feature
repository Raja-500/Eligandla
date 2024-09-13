@FirstTest
Feature: Basic Syntax
  @FirstScenario
  Scenario: Open TS Homepage test
    Given the user is on the TS homepage
    When they click on the About Us link
    Then the user is redirected to the about page
