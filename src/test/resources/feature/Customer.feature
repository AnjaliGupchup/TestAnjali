Feature: customer check
@1
Scenario Outline: Customer account check
Given url is launched
When Customer login tab is clicked
When "<customername>" customer is able to login
#And Logged in customer should be able to see "Account Number, Balance, Currency"

  Examples:
    | customername |
    | Harry Potter |
#
#Given url is launched
#When "" customer logs in
#And  Transactions tab is available on Customer page
#When Customer Clicks on the transactions button
#Then All transactions should be displayed with headers "Date-Time, amount, transaction type"
#And  "Reset,Date filters, Back, Logout" button should be enabled
#When  "Reset" button is clicked
#Then all transactions should be deleted
#When  "Back" button is clicked
#Then User navigates to "Home" Page
#When  "Logout" button is clicked
#Then Customer logs out
#
Scenario Outline: Customer Home page
#Given url is launched
When "<customername>" customer clicks on deposit button
And customer enters "<amount>" to be deposited
#Then Deposit successful message should be displayed once done
  Examples:
    | customername | amount |
    | Harry Potter | 50     |



#Given  url is launched
#When "" customer clicks on withdraw button
#Then  Amount to be withdrawn should be visible with amount field
#And  Transaction successful message should be displayed once done
#And  Transaction failed message should be displayed when there is no amount left to be withdrawn
#
