Feature: Change Password

Scenario: Change Password with valid credentials
Given user navigates to change password screen
When user enters valid credentials
And hits update button
Then password should be changed successfully