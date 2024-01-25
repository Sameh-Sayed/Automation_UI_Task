Feature: Test Add Course Function
  Scenario Outline: User Add New Course and Validate On Action
    Given User open website
    And Login with valid "<email>" and "<password>"
    And Open courses page
    When open create course form
    And fill form with all data and course name "<course>"
    And open course page
    And search for "<course>" added
    Then course should be exist
    Examples:
      |email                |password  |course|
      |testregister@aaa.com |Wakram_123| New  |
