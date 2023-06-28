Feature: BoardWithListAndCards

  Background: 
    Given user navigates to the home page
    When user click on login button
    Then user should be able to navigate login page
    And user enters valid credentials
      | username | sreemanoj.savaram@optimworks.com |
      | password | Roller@123                       |
    And user clicks on login button
    Then user should navigate to board page

  Scenario Outline: Verify user able to add multiple boards
    When user clicks on Create New Board button
    And user enters Board name "<board>"
    And user clicks on Create Board
    Then user should navigate to Created Board Page "<board>"
    And user clicks on Back to home
    When user clicks on Account
    And user clicks on LogOut
    Then user should navigate to LogOut page
    And user clicks on Logout button

    Examples: 
      | board  |
      | board1 |
      | board2 |
      | board3 |
      | board4 |
      | board5 |

  Scenario Outline: Verify user able to delete multiple existing boards
    When user clicks on existing board "<board>"
    Then user should navigate to Created Board Page
    And user clicks on Show menu
    And user clicks on open-more
    And user clicks on Closeboard
    And user clicks on Close
    And user clicks on Permanently delete board link
    And user clicks on delete button
    And user clicks on LogOut
    Then user should navigate to LogOut page
    And user clicks on Logout button

    Examples: 
      | board  |
      | board1 |
      | board2 |
      | board3 |
      | board4 |
      | board5 |
