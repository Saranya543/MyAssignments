Feature: CreateLead Function of Leaftaps application

@Regression @Sanity
Scenario Outline: CreateLead with multiple sets of data

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then User should be loggedin
When Click on the Crmsfa link
And Click on the Leads link
And Click on the CreateLead link
And Enter the Companyname as <companyname>
And Enter the Firstname as <firstname>
And Enter the Lastname as <lastname>
And Click on the CreateLead button
Then Lead should be creates


Examples:
|companyname|firstname|lastname|
|Qeagle|Vineeth|Rajendran|
|TestLeaf|Bhuvanesh|Moorthy|