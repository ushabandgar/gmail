Feature: Login functionality


 Scenario: Verify that the Gmail login URL loads properly
    When User navigates to url the Gmail login page should be loaded properly
    
 @today   
 Scenario: Verify user can successfully log in with valid credentials
    When User navigates to url the Gmail login page should be loaded properly
    Then The user enters Valid email and password
    Then The user should be redirected to the inbox
    