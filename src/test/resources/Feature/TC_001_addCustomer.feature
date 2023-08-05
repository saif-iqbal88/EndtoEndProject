Feature: Add Customer

  Scenario Outline: Adding a customer profile
    Given XYZ Bank login Page
    When Click on Bank Manager Login
    And Click Add Customer
    And sends customer '<FirstName>' and '<LastName>' and '<PostCode>'
    And click on Add Customer button
    Then go to next page

    Examples:
    |FirstName|LastName|PostCode|
    |Saif     |Iqbal   |1206    |