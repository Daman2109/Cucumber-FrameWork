@smoke
Feature: feature is to test whether user is able to click on new test button

  Scenario Outline: User is able to clickS Test Suites list in Test Suites & Cases
    Given Chrome browser is Open...
    And user enters <username> and <password>
    And user click on login..
    And User on the Test Suites & Cases Module..
    Then User is navigated to create new test suite pagE..

    Examples: 
      | username | password |
      | adsingh  | asdF@123 |
