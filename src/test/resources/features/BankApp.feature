Feature: BankApp

Scenario: Account for user
  Given user should register to bank with following data
  |Account Number| Routing Number|
  |123456789012  |123456789      |
  Then user should be successfully registered to the bank with the following
    |Account Number| Routing Number|
    |123456789012  |123456789      |