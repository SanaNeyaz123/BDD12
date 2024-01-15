 Feature:Login
 
 Scenario: Successful Login with valid input
 Given user launch Chrome browser
 When user open Url "https://practicetestautomation.com/practice-test-login/"
 And user enter username "student" and password as "Password123"
 And click on submit_button
 Then Page title should be "Logged In Successfully/practice Test Automation"
 When User click on logout button
 And close browser
 
 