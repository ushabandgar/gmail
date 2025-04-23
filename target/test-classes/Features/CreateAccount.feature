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


@today
Scenario Outline: Verify on click of "Next" button after entering First name is navigating to "Basic Information" page.
When User click on "Create account" button
And User click on "For my personal use" option
And User enters "<firstName>"
And Click on Next button
Then User should navigate to "Basic information" page

Examples:
|firstName|
|usha|
|parth|


