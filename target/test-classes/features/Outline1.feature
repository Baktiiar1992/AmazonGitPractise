Feature: Login functionality

  Scenario Outline: Verify user can login to "facebook"
    Given user on "facebook" main page
    When user should enter "<address>"
    And user should enter "<password>"
    Then user should press login button
    Examples:
      | address         |        password |
      | bsooronbaev@gmail.com |  123        |
      |   baha@mail.ru      |      2345    |



