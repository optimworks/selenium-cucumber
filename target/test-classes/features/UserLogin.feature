Feature: User Login

Scenario: Verify user able to login with valid user name and password
    Given user navigates to the home page
    When user click on login button
    Then user should be able to navigate login page
    And user enters valid credentials
      | username | sreemanoj.savaram@optimworks.com |
      | password | Roller@123                       |
    And user clicks on login button
    Then user should navigate to board page
    
 Scenario: Verify user unable to login with Invalid username and password
    Given user navigates to the home page
    When user click on login button
    Then user should be able to navigate login page
    And user enters valid credentials
      | username | sreemanoj.savaram@ottimworks.com |
      | password | Roller@124                       |
    And user clicks on login button