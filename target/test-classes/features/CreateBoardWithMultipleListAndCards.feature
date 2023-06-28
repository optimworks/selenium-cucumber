Feature: Create Board with Multiple lists and multiple cards

  Background: Verify the user able to login with valid credentials
    Given user navigates to the home page
    When user click on login button
    Then user should be able to navigate login page
    And user enters valid credentials
      | username | sreemanoj.savaram@optimworks.com |
      | password | Roller@123                       |
    And user clicks on login button
    Then user should navigate to board page

  Scenario: Verify the user able to Create Board with multiple lists and cards
    When user clicks on Create New Board button
    And user enters Board name "board2"
    And user clicks on Create Board
    Then user should navigate to Created Board Page "board2"
    When user adds 3 lists
    Then user should be able to view created lists
    When user adds 3 cards in respective lists
    Then user should be able to view created cards in respective lists
   
    
  Scenario: Verify the user able to Logout
    When user clicks on Account
    And user clicks on LogOut
    Then user should navigate to LogOut page
    And user clicks on Logout button
   