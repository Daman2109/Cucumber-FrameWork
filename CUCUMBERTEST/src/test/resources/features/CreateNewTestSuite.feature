@smoke
Feature: feature is to test whether user is able to create  new test suite

  Scenario Outline: User is able to clickS Test Suites list in Test Suites & Cases
    Given Chrome browser is Open..
    And user Enters <username> and <password>
    And user click on login...
    And User on the Test Suites & Cases Module...
    And User clicks on Create a new Test Suite buttoN...
    And user enter title
    And user click on create button    
    Then User created new test suite...

    Examples: 
      | username | password |
      | adsingh  | asdF@123 |
