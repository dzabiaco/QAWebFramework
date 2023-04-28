Feature: Contact Us

  Scenario: Validate Successfull
    Given I access page
    When I enter a first name
    And I enter last name
    And I enter an email adress
    And I enter comment
    And I click on submit
    Then I should see a messages