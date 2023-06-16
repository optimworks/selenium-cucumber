Feature: create  dashboard in trello application
@smokeTest
  Scenario Outline: Login Functionality
    Given Launch URL and login to the application
    When User enter username "<email> " and password "<password>"
    When Click on login button

    Examples: 
      | email                           | password             |
      | janardhan.bhukya@optimworks.com | 1J@nardhanoptimworks |

  @smokeTest @RegressionTest
  Scenario: Create Dash Board
    Then click on create button
    And select create board option
    Then enter board title name "jana"
    Then click on the Create board button

  @smokeTest @RegressionTest
  Scenario: Create Frist List and Cards
    Given enter frist list title name "BMW"
@RegressionTest
  Scenario: Create Frist List and Cards
    When click on add list button
@smokeTest
  Scenario: Create Frist List and Cards
    Then click on close icon

  Scenario: Create Frist List and Cards
    Then click on Add a card In frist list

  Scenario: Create Frist List and Cards
    Then enter frist card title name "BMW 3"

  Scenario: Create Frist List and Cards
    Then click on add card  button

  Scenario: Create Frist List and Cards
    And enter second card title name "BMW X5"

  Scenario: Create Frist List and Cards
    Then click on add card  button

  Scenario: Create Frist List and Cards
    And enter third card title name "BMW X3"

  Scenario: Create Frist List and Cards
    Then click on add card  button

  Scenario: Create Frist List and Cards
    Then click on close icon

  Scenario Outline: 
    Create second List and Cards

    Then enter second list title name "<list>"
    When click on add list button
    Then click on Add a card In second list
    Then enter four card title name "<card1>"
    Then click on add card  button
    And enter five card title name "<card2>"
    Then click on add card  button
    And enter six card title name "<card3>"
    Then click on add card  button
    Then click on close icon

    Examples: 
      | list  | card1      | card2      | card3       |
      | AUDI  | AUDI Q3    | AUDI Q5    | AUDI Q7     |
      | HONDA | HONDA JAZZ | HONDA WR-V | HONDA Amaze |
