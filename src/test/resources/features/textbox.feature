Feature: Textbox of Elements

  Background:
    Given the user is on the page ToolsQA

  @Test2CorrectlyData
  Scenario: Complete form successfully
    When the user completes the corresponding fields
    | fullname |      email       | currentAddress | permanentAddress |
    | victor   | victor1@gmail.com| Bello          | Mirador          |
    | manuel   | manuel1@gmail.com| Bello          | Mirador  5ta     |
    Then he should see the summary of your information 'Email:victor1@gmail.com'


  @Test3IncorrectlyData
  Scenario: Fill in the form incorrectly
    When he enters the data incorrectly
      | fullname |      email   | currentAddress | permanentAddress |
      | victor   | victortcs.com| Bello          | Mirador          |
      | manuel   | mauneltcs.com| Bello          | Mirador 5ta      |
    Then the user should not see the summary of their information