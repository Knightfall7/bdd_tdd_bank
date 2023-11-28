Feature: Account deposit

  Scenario Outline: User inserts in money to the account
    Given that Users balance is 100 dollars
    When User deposits 50 dollars
    Then The Users current balance is 150 kr.
    Examples: