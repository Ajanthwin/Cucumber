Feature: Ebay Home Page Scenarios

  @P2
  Scenario: Advance Search Steps
    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I land on the Ebay home page

  @P5
  Scenario: Data from feature file
    Given I am on Ebay Advanced Search Page
    When I advanced search an item
      | keyword   | exclude     | min | max |
      | iphone 11 | refurbished | 300 | 900 |
