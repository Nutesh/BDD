#Author: neelimap 
@newRegistration

Feature: Registrationn

Background: User is on home page of the sampleApplication 
and Registration link is avaialble. 
user has also clicked on the registration link

Scenario: Successful Regisration with valid data
Description: to register, user needs to enter his valid username, password & confirm password
Given User is on registration page
When user enters valid username, valid password and matching confirmPassword
Then Message displayed 'Registration Successful'

