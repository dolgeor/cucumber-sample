Feature: Rest client

  Scenario: Call website
    When I call https://www.google.com/
    Then I should receive 200 http code