Feature: Prime Factor Calculation

Scenario: it should calculate the prime factors of 6
  Given a calculator
  When prime factors of 6 are calculated
  Then [2, 3] are the prime factors
