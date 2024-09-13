@activity5
Feature: Data driven test with Examples

  Scenario Outline: Testing with Data from Scenario
    Given User is on Login page
    When User enters "<username>" and "<password>"
    Then Read the page title and confirmation message


    Examples:

      | username | password  |
      | admin    | password  |