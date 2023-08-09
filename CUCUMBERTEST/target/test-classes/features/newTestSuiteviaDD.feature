
@smoke
Feature: feature is to test whether user is able to create new test suite from the dropdown available in the header of the application.

  Scenario Outline: User is able to clickS Test Suites list in Test Suites & Cases
    Given Chrome browser is Open..
    And user enters <username> and <password>
    And user click on login..
    And User clicks on NEW dropdown
    And User clicks on test suite
    And user enter titLe
    And user clicKs on Create button
    Then user verify if the test suite is successfully Created

    Examples: 
      | username | password |
      | adsingh  | asdF@123 |
