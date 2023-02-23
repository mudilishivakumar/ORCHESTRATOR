
Feature: Automated Home Page ORCHESTRATOR PORTAL


Scenario Outline:User verfies the Home Page
Given Login form in login page
When Submit email using "<email>" and password using "<password>"
Then User is able to see all the Logos, Buttons in toolBar menu
  And User able to click all the buttons in toolBar menu

Examples:
| email                     | password  |
| mobius@gaiansolutions.com | Gaian@123 |