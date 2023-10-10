Feature: sign in to CNBC

@t1
Scenario: verify user able to sign in with valid credential to CNBC 
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And enter valid email address "yadavhselevol@gmail.com"
And enter valid password "Lovelesh1*"
And select the checkbox to stay signed in
And click on sign in button
And click on my account button in CNBC dashboard
Then verify system displaying signed in users email address "yadavhselevol@gmail.com"
And click on sign out button
# failed due to recaptcha


@t2
Scenario: verify user able to login with incorrect password in CNBC 
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And enter valid email address "lovelesh1528@gmail.com"
And enter invalid password "Lovelesh1#"
And select the checkbox to stay signed in
And click on sign in button
Then verify system displaying error message "Incorrect login information. Please try again."
# failed due to recaptcha


@t3
Scenario: verify user able to Reset Password in to CNBC 
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And enter valid email address "lovelesh1528@gmail.com"
And enter invalid password "Lovelesh1#"
And click on forgot password link
And enter your email "lovelesh1528@gmail.com" to receive to reset password mail
And click on continue button 
Then verify user able to see message "Enter your Email or Username and we will send you instructions for how to reset your password."
When click on close button

