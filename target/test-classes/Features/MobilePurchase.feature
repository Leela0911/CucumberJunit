#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Mobile Purchase

  @mobile
  Scenario: Mobile
   Given user lanuch flipkart
    And user login into flipkart
  When user search mobile
   And user choose the mobile and doing payment
  Then user receive order confirmation message
   
@smoke
  Scenario: Mobile one dim list
   Given user lanuch flipkart
   And user login into flipkart
  When user search mobile by using one dim list
   |iphone|realme|
  And user choose the mobile and doing payment
    Then user receive order confirmation message
   
   @sanity
  Scenario: Mobile one dim map
    Given user lanuch flipkart
    And user login into flipkart
    When user search mobile by using one dim map
   | phone1 | realme |
   | phone2 | oppo |
   | phone3 | iphone |
    And user choose the mobile and doing payment
    Then user receive order confirmation message
   
   