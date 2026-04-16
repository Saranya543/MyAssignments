Feature: Login Function of Leaftaps application

@Smoke @Sanity
Scenario: Login with Valid Credentials


And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then User should be loggedin

@Sanity
Scenario: Login with Invalid Credentials


And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on the Login button
But It throws error message