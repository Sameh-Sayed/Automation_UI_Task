Feature: Online Shopping Workflow

  Scenario: Purchase Flow
    Given the user is on the login page
    When the user enters a valid username "<valid_user>" and password "<correct_password>"
    And the user clicks the login button
    Then the user should be logged in successfully

    When the user add the two most expensive products to their cart
    And the user click on the cart button
    Then the user should navigate to the cart, and the previously selected products should be displayed

    When the user click on the checkout button
    Then the user should navigate to the checkout page

    When the user fill out all the displayed forms
    And the user click on the continue button
    Then the user should navigate to the overview page

    Then the user should verify the items' total amount before taxes
    And the user should verify the URL matches

