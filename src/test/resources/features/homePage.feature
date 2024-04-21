#Author: Ibrahim Abir

Feature: TUNISIANET homePage

  
  Scenario: homePage menu verification
    Given user is on homePage
    When user moushover menu "Impression"
    And click on submenu "Photocopieurs A4 | A3"
    Then user is directed to submenu page that contains this product "IMPRIMANTE BROTHER MULTIFONCTION J4340DW"
                                                                           