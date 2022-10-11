Feature: Top Categories

  Scenario: Check Top Categories
    Given Launch Chrome browser
    When Flipkart home page opens
    Then Click Close Button
    Then Verify Top Categories is present
    And Close Browser

  Scenario: Click Mobiles
    Given Launch Chrome browser
    When Flipkart home page opens
    Then Click Close Button
    Then Click Mobiles
    And Close Browser