Feature: Buy a product from commence website
  this is simple website description

  Background:
    Given User navigate to macy website

    @SmokeTest
  Scenario Outline: Buy multiple shirt from online
    And User select a "<color>" shirt
    And User enter "<option>" payment information
    Then User buy the selected shirt
    Examples:
      | color | option |
      | red   | paypal |
      | green | debit  |
      | black | credit |