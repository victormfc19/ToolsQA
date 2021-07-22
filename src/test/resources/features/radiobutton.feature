Feature: Inspect radio button
  As a user I want to verify that the radio button works correctly

  @Test1RadioButton
  Scenario: Select radio button Yes
    Given the user is on the page ToolsQA
    When i select the radio button Yes
    Then I should see  'Yes'
