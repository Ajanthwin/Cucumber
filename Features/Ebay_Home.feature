Feature: Ebay Home Page Scenarios

  @P1
  Scenario: Advance Search Link
    Given I am on Ebay Home Page
    When I click on Advanced Link
    Then I land on the Advanced Search page

  @P3
  Scenario: Advance Search Link
    Given I am on Ebay Home Page
    When I search for 'Iphone 14'
    Then I validate at least 100000 results are displayed

  @P4
  Scenario: Advance Search Link
    Given I am on Ebay Home Page
    When I search for 'soap' in 'Baby' category
    Then I validate at least 1000 results are displayed

  @P6
  Scenario Outline: Data Driven testing
    Given I am on Ebay Home Page
    When I click on '<link>'
    Then I validate the page navigates to '<url>' and title contains '<title>'
    Examples:
      | link    | url                                                                   | title                                           |
      | Motors  | https://www.ebay.com/sch/Auto-Parts-Accessories/6028/bn_569479/i.html | www.ebay.com                                    |
      | Fashion | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545    | Clothing, Shoes & Accessories for sale \| eBay |
