Feature: As a user, I want to Login ORCHESTRATOR PORTAL

  @ValidCase @SomeTags
  Scenario Outline:: Successful login using valid account
    Given Login form in login page
    When Submit email using "<email>" and password using "<password>"
    Then Then User verfiy the Page title
    Examples:
      | email                     | password  |
      | mobius@gaiansolutions.com | Gaian@123 |



#  @InvalidCase @SomeTags
#  Scenario Outline: Failed login using invalid account
#    Given Login form in login page
#    When Submit email using "<email>" and password using "<password>"
#    Then Login failed with displaying error message
#    Examples:
#      | email             | password |
#      | qwert             | 123456   |
#      |                   | 1234qw   |
#      | akutest@email.com |          |

