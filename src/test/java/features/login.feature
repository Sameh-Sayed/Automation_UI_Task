Feature: User Login

  Background:
    Given the user is on the login page

  Scenario Outline: User logs in with valid credentials
    When the user enters a valid username "<valid_user>" and password "<correct_password>"
    And the user clicks the login button
    Then the user should be logged in successfully
    Examples:
      | valid_user              |  correct_password |
      | standard_user           |  secret_sauce     |
      | locked_out_user         |  secret_sauce     |
      | problem_user            |  secret_sauce     |
      | performance_glitch_user |  secret_sauce     |

  Scenario Outline: User logs in with invalid credential
    When the user enters an invalid username "<user>" and password "<password>"
    And the user clicks the login button
    Then the user should see an error message Invalid username or password "<error_message>"
    Examples:
      | user | password | error_message |


