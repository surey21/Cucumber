@LoginPage
Feature: Verifying Adactin Hotel Login  details

  Background: 
    Given User should entered in adactin hotel home page

  @Loginpage
  Scenario Outline: Verifying Adactin hotel Book hotels with valid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"

    Examples: 
      | userName | password |
      | Suresh21 | SURESH   |

  @loginPage.
  Scenario Outline: Verifying Adactin hotel Book hotels with valid credentials with using enter key
    When User should perform login "<userName>","<password>" with ENTER key
    Then Verify after Login "Hello Suresh21!"

    Examples: 
      | userName | password |
      | Suresh21 | SURESH   |

  @LoginPageError
  Scenario Outline: Verifying Adactin hotel Book hotels with invalid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Loginerror with invalid credentials  "Invalid Login details or Your Password might have expired"

    Examples: 
      | userName    | password |
      | Suresh21335 | SURESH   |
