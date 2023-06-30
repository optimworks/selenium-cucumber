Feature: Drag and drop cards

  Background: Verify user able to login with valid user name and password
    Given user navigates to the home page
    When user click on login button
    Then user should be able to navigate login page
    And user enters valid credentials
      | username | sreemanoj.savaram@optimworks.com |
      | password | Roller@123                       |
    And user clicks on login button
    Then user should navigate to board page

  Scenario: Verify user able to drag and drop cards from one list to another.
    When user clicks on existing board "board234"
    Then user should navigate to Created Board Page "board234"
    And user clicks on Add another list
    And user enters another listname "list2"
    And user clicks on Add list button
    And user drags cards to "list2"
      | user0  |
      | user1  |
      | user2  |
      | user3  |
      | user4  |
      | user5  |
      | user6  |
      | user7  |
      | user8  |
      | user9  |
      | user10 |