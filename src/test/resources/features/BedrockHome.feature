@test
Feature: Bedrock Streaming Home Page Test
  As a user, I want to test the basic functions of the home page.

  Scenario: Home page title and menu control
    Given User navigates to "https://bedrockstreaming.com/"
    When User checks the home page title
    And User sees "Solutions" tab in the menu
    And User clicks on the Solutions menu
    And User clicks on the "Contact" button
    Then Contact page opens and the title is "Contact us"
    When User fills first name as "Ayse Nur"
    And User fills last name as "TETIK"
    And User fills company as "Bedrock"
    And User fills job title as "QA testeuse"
    And User fills email as "aysenur2044@hotmail.com"
    And User fills phone as "0769290691"
    And User fills message as "Hello !"
    Then Contact page opens and the title is "Contact us"
