Feature: MakePayment

  Scenario Outline: Payment Feature
    Given The app apk is there
    When User Click on make payment button
    And user enters '<phonenumber>'and '<Customer>' and '<Amount>' and '<Country>'
    And user clicks on send payment
    Then The user will navigate to home screen

    Examples:
      | phonenumber | Customer| Amount| Country
      | +8801521202238 | SAIF | 10 | Bangladesh