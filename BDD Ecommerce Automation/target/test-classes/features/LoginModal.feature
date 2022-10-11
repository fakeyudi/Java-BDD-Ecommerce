Feature: Login Modal

  Scenario: Login Modal has all fields in home page
    Given Launch Chrome browser
    When Flipkart home page opens
    Then Verify Login Text is Present
    And Verify Email field is Present
    And Verify Password field is Present
    And Verify Login Button is Present
    Then Close Browser

  Scenario: Login Modal has close button and can be closed
    Given Launch Chrome browser
    When Flipkart home page opens
    Then Verify Close Button is Present
    And Click Close Button
    Then Close Browser