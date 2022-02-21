Feature: Airbnb

  Scenario: Verify that user can sign up to Airbnb
    Given user should enter to https://www.airbnb.com/
    And user should verify menu bar button at the right corner
    When user should click to bar button
    And user should see
      | Sign up | Log in   | Host your home   | Host an experience|  Help  |
    Then user should click on Sign up button
    And user should see below "Welcome to Airbnb" these fields
      |Country/Region| Phone number |
    And  below these fields, text - "We’ll call or text you to confirm your number. Standard message and data rates apply."
    And  below this text, button -"Privacy Policy"
    And  under Privacy Policy, button -"CONTINUE"
    And under "CONTINUE", dividing line with word "or"
    And under dividing line, these buttons
      | Continue with Facebook | Continue with Google | Continue with Apple | Continue with email |
