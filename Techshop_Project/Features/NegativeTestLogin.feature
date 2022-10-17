Feature: Testing Login functionality to the application

Scenario Outline: The Scenario tests all the invalid username and password
Description: We can use boundary tests, State Transition techniques, etc.

/#Given I open the browser
# And I navigate to the application // after using hooks we do noit need this steps.
When I click on the sign in button on nomepage
And I enter "<email>" and "<password>"
And I click on the login button
Then I supposed to get an error message

Examples:
| email                     | password |

| testuser123456@email.com  | 123456 |
| testuser1234567@email.com | 123456 |
| testuser12345@email.com   | 123456 |

| testuser@email.com      | 123456 |


  