Feature: profile details & change password 

Scenario: verify user able to create account in CNBC 
Given User launch browser
When user opens URL "https://www.cnbc.com/"
#And click on create free account button in dashboard
And click on sign in button in CNBC dashboard
And click on create free account link in sign in page 
And enter valid email address "yadavhselevol@gmail.com"
And enter valid password "Lovelesh1*"
And select the checkbox to accept CNBC terms of service and privacy policy
And click on create account button
Then verify system displaying message "Thank you for creating a CNBC account  ."
And click on conform watchlist button
And click on my account button in CNBC dashboard
Then verify system displaying signed in users email address "yadavhselevol@gmail.com"
When click on profile option
And user enters first name as "Samual"
And user enters last name as "India"
And click on save changes button
Then verify system displaying message "Your changes have been saved."
And reload the page and verify first name "Sam" and last name "India" details are saved or not
And click on submit button
Then verify system displaying error message "Old Password is required"
Then verify system displaying error message "Please enter a valid password"
Then verify system displaying error message "New Password Confirmation is required"
When to reset password , user enters old password "Lovelesh1*"
And enters new password "Lovelesh1$"
And enters conform new password "Lovelesh1$"
And click on submit button
Then verify system displaying message "You have successfully reset your password. A confirmation email has been sent to yadavhselevol@gmail.com."
And click on my account button in CNBC dashboard
And click on sign out button
# failed due to recaptcha