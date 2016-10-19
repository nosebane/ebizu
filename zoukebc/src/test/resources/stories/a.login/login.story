Meta:
@tag epics : login

Narrative:
As a user admin of ZoukEBC
I want to login

Scenario: Login Success
Given on page view
When insert username <$username>
And insert password <$password>
And click login
And assert dashboard
Then login success


Examples:
| no | username | password |
| 01 | info@zoukclub.com.my | 123456 |


