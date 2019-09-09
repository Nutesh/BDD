Feature: cooking
Scenario: Verifying Title of page 
Given User is on 'Enquiry Form' Page
Then  'Verifying the title of page'

Scenario: Verifying Text 'Online Cooking School' on web page
Given User is on 'Enquiry Form' Page
Then 'Verifying the Text on page'

Scenario: Checking hyperlink 'Download our Recipe class Brochure' on page
Given User is on 'Enquiry Form' Page
When User clicks 'Download our Recipe class Brochure' button
Then verify the text 'Recipe class Brochure is sent to your registered mail id' on page

Scenario: Verifying 'Go Back to Registration' button
Given User is on 'message' Page
When user clicks 'Go Back to Registration' button
Then displays 'Enquiry Form' Page

Scenario: Invalid first Name
Given User is on 'Enquiry Form' Page
When user enters invalid first name
Then displays 'First Name must be filled out'

Scenario: Invalid last Name
Given User is on 'Enquiry Form' Page
When user enters invalid last name
Then displays 'Last Name must be filled out'

Scenario: Invalid Mobile 
Given User is on 'Enquiry Form' Page
When user enters alphabetic Mobile Number
Then displays 'Enter numeric value'

Scenario: Invalid Mobile Number 
Given User is on 'Enquiry Form' Page
When user enters Invalid Mobile Number
Then displays 'Enter ten digit Mobile number'

Scenario: Invalid Enquiry details 
Given User is on 'Enquiry Form' Page
When user clicks 'Enquire Now!!!' button
Then displays 'Enquiry details must be filled out'

Scenario: Valid Details
Given User is on 'Enquiry Form' Page
When user clicks 'Enquire Now1!!!' button
Then displays 'Thank you for submitting the online recipe class Enquiry'

Scenario: Valid Details to get Final Message
Given User is on 'Enquiry Form' Page
When user clicks 'Enquire Now1!!!' button
When user clicks 'Alert box message'
Then displays 'Our location representative will contact you soon'

