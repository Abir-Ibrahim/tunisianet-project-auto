#Author:Ibrahim Abir
Feature: Tunisianet disqueSSD

  Scenario: order a product
    Given user is on disqueSSD page
    When user checks if the product "Disque Dur Interne Patriot SSD P220 SATA III 2.5 / 128 Go" is available and clicks on the product
    Then user order the product "Disque Dur Interne Patriot SSD P220 SATA III 2.5 / 128 Go"
    And user is directed to the shopping cart that contains "Disque Dur Interne Patriot SSD P220 SATA III 2.5 / 128 Go"
