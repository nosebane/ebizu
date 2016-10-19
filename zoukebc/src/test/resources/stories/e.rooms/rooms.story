Meta:
@tag epics : ebc

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


Scenario: New Table
Given on page view
Given click rooms menu
When click manage tables
And click new table
And insert area id <$areaid>
And insert table name <$name>
And insert table type <$type>
And click save table
Then save table success


Examples:
| no | areaid | name | type |
| 01 | R @ Zouk Mainroom | AutoTable | Circle |

Scenario: Edit Table
Given search table by name <$nameedt>
When click edit table
And insert area id <$areaid>
And insert table name <$name>
And insert table type <$type>
And click save table
Then save table success


Examples:
| no | areaid | name | type | nameedt |
| 01 | A @ Zouk Mainroom | AutoTableedt | Square | AutoTable |

Scenario: Delete Table
Given search table by name <$nameedt>
When click delete table
Then delete table success


Examples:
| no | nameedt |
| 01 | AutoTableedt |
