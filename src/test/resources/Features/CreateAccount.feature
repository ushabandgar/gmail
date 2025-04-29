Feature: Create Account functionality

Scenario: Verify that the "Create account" text is displayed correctly to users.
Then "Create account" text is displayed correctly to users

Scenario: Verify that the "Create account" button is clickable
When User click on "Create account" button
Then "Create account" button is clickable

Scenario: Verify that on click of "Create Account" showing options "For my personal use" and "For my work or bussiness" using paramerization
When User click on "Create account" button
Then On click of "Create Account" showing options "For my personal use" and "For my work or business"


Scenario: Verify on click of "For my Personal use" , user is redirecting to url "https://accounts.google.com/lifecycle/steps/signup/name........" or signup page
When User click on "Create account" button
And User click on "For my personal use" option
Then User should navigate to Signup page


Scenario: Verify "First Name" field is mandatory.If clicked on Next without first name is showing error message "Enter first name".
When User click on "Create account" button
And User click on "For my personal use" option
And Click on Next button
Then User should get error message "Enter first name"



Scenario Outline: Verify on click of "Next" button after entering First name is navigating to "Basic Information" page.
When User click on "Create account" button
And User click on "For my personal use" option
And User enters "<firstName>" as username
And Click on Next button
Then User should navigate to "Basic information" page

Examples:
|firstName|
|usha|
|parth|


Scenario: read firstName from excel
When User click on "Create account" button
And User click on "For my personal use" option
And User enter username from excel
And Click on Next button
Then User should navigate to "Basic information" page

Scenario: Verify on click of Back button from Create Account page is navigating to Login page.
When User click on "Create account" button
And User click on "For my personal use" option
And Click On Back from browser
Then User should navigate to Sign In page

Scenario: Verify ui elements of Basic Information page
When User click on "Create account" button
And User click on "For my personal use" option
And User enters "parth" as username
And Click on Next button 
Then User should see the "Month" dropdown
And User should see the "Day" input
And User should see the "Year" input
And User should see the "Gender" dropdown
And User should see the "Why we ask for birthday and gender" link
And User should see the "Next" button

@today
Scenario: Verify that Month dropdwon has 12 months in correct order
When User click on "Create account" button
And User click on "For my personal use" option
And User enters "parth" as username
And Click on Next button 
And User click on "Month" Dropdown
Then The Month dropdown should display following months in correct order:
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
