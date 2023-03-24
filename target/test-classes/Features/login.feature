
Feature: To Validate the login functionality of FB Application

  Scenario Outline: To validate the login with invalid credentials
    Given The user should be in fb page
    When The user should enter the "<usnam>" and "<pase>"
    And The user should click the login button
    Then The user in invalid page

    Examples:
    |usnam|pase|
    |vinith|ngfre|
    
     Scenario: To validate the registration 
    Given The user should be in fb page
    And The user should click the register button
    When The user should enter the frstnam and lstnam
    And The user should click the signup button
    Then The user in valid page