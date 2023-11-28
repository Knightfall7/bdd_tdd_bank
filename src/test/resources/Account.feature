Feature: Account deposit

  Scenario: User inserts in money to the account
    Given that Users balance is 100 kr
    When User puts in 50 kr
    Then Users current balance should be 150 kr.