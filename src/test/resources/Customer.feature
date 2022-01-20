
Scenario Outline: Customer account check
Given url is launched
When Customer login tab is clicked
Then Customer page is available with the list of names of the customers
When "<customername>" customer is clicked
Then Logon option should be available for the customer
And Logged in customer should be able to see account number, balance and currency

  Examples:
  |customername|
  |Hermoine Granger|

Given url is launched
When "" customer logs in
And  Transactions tab is available on Customer page
When Customer Clicks on the transactions button
Then All transactions should be displayed with headers "Date-Time, amount, transaction type"
And  "Reset,Date filters, Back, Logout" button should be enabled
When  "Reset" button is clicked
Then all transactions should be deleted
When  "Back" button is clicked
Then User navigates to "Home" Page
When  "Logout" button is clicked
Then Customer logs out

Given url is launched
When "" customer clicks on deposit button
Then  Amount to be deposited should be displayed with amount field
And Deposit successful message should be displayed once done

Given  url is launched
When "" customer clicks on withdraw button
Then  Amount to be withdrawn should be visible with amount field
And  Transaction successful message should be displayed once done
And  Transaction failed message should be displayed when there is no amount left to be withdrawn

