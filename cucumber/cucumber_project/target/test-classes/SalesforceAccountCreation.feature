Feature: Create Account function of Salesforce application

Scenario Outline: Create Account

When Enter username as 'saranya09.shanmugam.6e32e22b26bd@agentforce.com'
And Enter password as 'Anvika@01'
When Click on Login button
Then User should be loggedin successfully
When Click on toggle menu button from the left corner
And Click view All
And Click on Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter account name as <accountName>
And Select Ownership as Public
And Click on save
Then Account should be created

Examples:
|accountName|
|Saran|

