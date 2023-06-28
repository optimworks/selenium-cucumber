Feature: BoardWithListAndCards

  Background: Verify the user able to login with valid credentials
    Given user navigates to the home page
    When user click on login button
    Then user should be able to navigate login page
    And user enters valid credentials
      | username | sreemanoj.savaram@optimworks.com |
      | password | Roller@123                       |
    And user clicks on login button
    Then user should navigate to board page

  Scenario: Verify user able to Create Board and add lists and cards
    When user clicks on Create New Board button
    And user enters Board name "board2"
    And user clicks on Create Board
    Then user should navigate to Created Board Page "board2"
    When user enters list title "list1"
    And user clicks on Add list button
    And user clicks on Add a Card button
    And user adds multiple cards
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
    Then user should be able to view added Cards
    When user clicks on Account
    And user clicks on LogOut
    Then user should navigate to LogOut page
    And user clicks on Logout button
