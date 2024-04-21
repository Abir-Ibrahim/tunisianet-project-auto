#Author: Ibrahim Abir
Feature: search bar TUNISIANET

  Scenario: product search
    Given user is on homepage
    When user enter prodct name in the search bar "sac à dos" and clicks on search
    Then user is directed to the products page that contains "RÉSULTATS DE LA RECHERCHE SAC À DOS"
