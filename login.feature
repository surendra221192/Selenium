
@Smoke
Feature: Login Page

    @tag1
    Scenario: login by using valid username and password
    Given open the url in chrome browser
    When User given the valid username and valid password
    And user clicks the login button
    Then user can get access for the application
    And verify he move to login page or not

 