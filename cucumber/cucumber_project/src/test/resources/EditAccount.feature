Feature: Edit Account function of Salesforce application

Scenario Outline: Edit Account

When Enter username as 'saranya09.shanmugam.6e32e22b26bd@agentforce.com'
And Enter password as 'Anvika@01'
When Click on Login button
Then User should be loggedin successfully
When Click on toggle menu button from the left corner
And Click view All
And Click on Sales from App Launcher
And Click on Accounts tab
And Search for the account 'Saran'
And Click the dropdown icon next to the account and select Edit
And Set Type to Technology Partner
And Set Industry to Healthcare
And Enter the Billing Address as 'Bangalore'
And Enter the Shipping Address as 'Bangalore'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Active to NO
And Enter a unique number in the Phone field as '998877664'
And Set Upsell Opportunity to No
And Click Save
Then Verify the phone number
