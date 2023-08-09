@sanity
Feature: feature is to test login functionality of application

  Scenario Outline: valid user is able to login
  
    Given Chrome browser is open
    And user enter <username> and <password>
    And user click on login button
    Then User is navigated to the home page
    
     Examples:
    
    | username | password |
    | adsingh | asdF@123 |
    
