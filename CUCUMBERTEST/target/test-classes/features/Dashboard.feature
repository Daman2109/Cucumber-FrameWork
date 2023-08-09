 @sanity
 Feature: feature is to test whether user is able to view test suites list
 Scenario Outline: User is able to view Test Suites list in Test Suites & Cases
 
    Given Chrome browser is Open
    And user enter <username> anD <password>
    And user click on login Button
    And User is navigated to the home Pagee
    And User clicks on the Test Suites & Cases Module
    Then User is able to view test suite List
    
    
    Examples:
    
    | username | password |
    | adsingh | asdF@123 |