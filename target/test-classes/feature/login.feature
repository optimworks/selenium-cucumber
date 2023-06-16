Feature: Login functionality

  Scenario: Successful Login
    Given Launch URL and login to the application
    When User enter username "janardhan.bhukya@optimworks.com" and password "1J@nardhanoptimworks"
    When Click on login button

  Scenario Outline: Login data driven
    Given Launch URL and login to the application
    When User enter username "<email>" and password "<password>"
    When Click on login button

    Examples: 
      | email                           | password             |
      | janardhan.bhukya@optimworks.com | 1J@nardhanoptimworks |
      | janardhan.bhukya@optimworks.com | 2J@nardhanoptimworks |
