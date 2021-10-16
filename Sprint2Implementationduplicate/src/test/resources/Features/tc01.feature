Feature: Test Login Functionality

Scenario: Check login is successful with valid credentials

Given browser is open
And user is on login page
When user enters email and password
Then user is navigated to the home page

Scenario: check login is unsuccessful with taking email blank

Given page is loaded
When user enters password
And clicks on login
Then user  should be displayed a message error "Login was unsuccessful"


Scenario: To verify Password field must not be same as that of e-mail.
Given page is here
When user enter email and password same as email
Then user  showing 'password is not same as e-mail'

Scenario: To verify for valid e-mail and invalid password
Given page is there
When user enters valid email and invalid password
Then user should displayed " The credentials provided are incorrect" on page


