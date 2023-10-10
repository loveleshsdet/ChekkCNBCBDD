Feature: Create free account & sign in Account

@t1
Scenario: verify user able to create account in CNBC 
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And click on create free account link in sign in page 
And enter valid email address "yadavhselevol@gmail.com"
And enter valid password "Lovelesh1*"
And select the checkbox to accept CNBC terms of service and privacy policy
And click on create account button
Then verify system displaying message "Thank you for creating a CNBC account  ."
When click on done button
#sometimes failing due to recaptcha



@t2
Scenario: verify system throwing error message when existing user trying to create account
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And click on create free account link in sign in page 
And enter valid email address "yadav.lovelesh15@gmail.com"
And enter valid password "Lovelesh1*"
And select the checkbox to accept CNBC terms of service and privacy policy
And click on create account button
Then verify system throwing error message "An account with this email address already exists."

@t3
Scenario: verify system throwing error message when user trying to create account with invalid email
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And click on create free account link in sign in page 
And enter valid email address "yadav.cmail.com"
And enter valid password "Lovelesh1*"
And select the checkbox to accept CNBC terms of service and privacy policy
And click on create account button
Then verify system displaying error message "Please enter a valid email address."

@t4
Scenario: verify system throwing error message when user trying to create account without accepting terms and conditions
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And click on create free account link in sign in page 
And enter valid email address "samual@gmail.com"
And enter valid password "Lovelesh1*"
#And select the checkbox to accept CNBC terms of service and privacy policy
And click on create account button
Then verify system throwing the error message "Please agree to the following terms to continue." when user not selected terms and conditions checkbox

@t5
Scenario: verify system throwing error message when user clicks create account button without filling email and password fields
Given User launch browser
When user opens URL "https://www.cnbc.com/"
And click on sign in button in CNBC dashboard
And click on create free account link in sign in page 
And click on create account button
Then verify system displaying error message "Email is required"
And verify system displaying error message "Please enter a valid password"
