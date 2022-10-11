Feature: Mobiles Page

  Scenario: Click on first phone
    Given Launch Chrome browser
    When Flipkart home page opens
    Then Click Close Button
    Then Click Mobiles
    And Click on first phone
    Then Close Browser

  Scenario: Verify Filters and help on mobiles page
    Given Launch Chrome browser
    When Flipkart home page opens
    Then Click Close Button
    Then Click Mobiles
    And Click on first phone
    Then Verify Filters
    Then Reset price to 20000
    Then Verify Need help
    Then Close Browser
