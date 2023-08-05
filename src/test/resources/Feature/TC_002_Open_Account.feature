Feature: Open Account

  Scenario: Opening a customer account
    Given XYZ Bank Open Account Page
    When Click on Open Account
    And Click on Customer Name
    And Click on desired Customer
    And Click on Currency
    And Click on desired currency
    And Click on Process
    Then Next Page

