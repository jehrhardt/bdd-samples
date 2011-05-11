Feature: Prime Factor Calculation

Scenario: it should calculate the prime factors of 6
  Given I have entered 3 into the calculator
  And I have entered 2 into the calculator
  When I press divide
  Then the stored result should be 1.5
