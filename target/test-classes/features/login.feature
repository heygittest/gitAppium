Feature: Application login

Scenario Outline: Home page default login
Given user has driver exe
And url entered as "http://www.qaclickacademy.com"
And user clicks on login
When user logs in with user <username> and password <password> and logs in
Then home page should be displayed

Examples:
|username | password|
|ankita.lawate@gmail.com|anki1389|
|test99@gmail.com|123456|
 
