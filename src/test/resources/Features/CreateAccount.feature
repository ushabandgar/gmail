zFeature: Create Account functionality

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