Feature: Login

  Background:
    Given User already in Login page

  Scenario: Login with valid username and password
    When User provide valid username and password
    Then User directed to the dashboard page
