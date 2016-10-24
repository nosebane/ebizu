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


Scenario: Add New Genre
Given click rooms menu
When click manage genre 
And click new genre
And insert genre name <$name>
And insert genre color <$color>
And click save genre
Then save genre success

Examples:
| no | name | color |
| 01 | AutoGenre | #ff00ff |

Scenario: Edit Genre
Given click Edit genre menu 
When assert edited genre correct <$nameedt> 
And insert genre name <$name>
And insert genre color <$color>
And click save genre
Then edit genre success

Examples:
| no | name | color | nameedt |
| 01 | AutoGenreedt | #00ff00 | AutoGenre |

Scenario: Delete Genre
Given assert delete genre correct <$nameedt> 
When click delete genre menu 
Then delete genre success

Examples:
| no | nameedt |
| 01 | AutoGenreedt |

Scenario: New Room
Given click manage room menu 
When click new room
And insert room name <$name>
And insert room description <$description>
And insert room genre <$genre>
And select room bookable <$bookable>
And insert room schedule <$schedule>
And insert room open time <$opentime>
And insert room close time <$closetime>
And click save room 
Then save room success

Examples:
| no | name | description | genre | bookable | sequence | schedule | opentime | closetime | 
| 01 | AutoRoom | AutoRoomdesc | DUBSTEP | Enable | 100 | Everyday | 00:00 | 04:00 | 

Scenario: Edit Room
Given click edit room menu 
When assert edited room <$nameedt>
And insert room name <$name>
And insert room description <$description>
And insert room genre <$genre>
And select room bookable <$bookable>
And insert room schedule <$schedule>
And insert room open time <$opentime>
And insert room close time <$closetime>
And click save room 
Then edit room success

Examples:
| no | name | nameedt | description | genre | bookable | sequence | schedule | opentime | closetime | 
| 01 | AutoRoomedt | AutoRoom | AutoRoomdescedt | TECHNO | Disable | 100 | Saturday | 00:13 | 04:13 | 

Scenario: Delete Room
Given assert delete room <$nameedt> 
When click delete room menu 
Then delete room success

Examples:
| no | nameedt | 
| 01 | AutoRoomedt | 

Scenario: New Room Setting with eventprice
Given click rooms setting
When select room setting room <$room>
And insert room setting startdate <$startdate>
And insert room setting enddatae <$enddate>
And select room setting openday <$openday>
And select room setting event <$event>
And insert room setting bottleratio <$bottleratio>
And insert room setting opentime <$opentime>
And insert room setting closetime <$closetime>
And select room setting catprice <$catprice>
And click save room setting
And check on room calendar <$startdate> <$room>
And assert room setting pop up <$opentime> <$closetime> <$bottleratio> <$ticketprice> <$catprice>


Examples:
| no | room | startdate | enddate | openday | event | ticketprice | bottleratio | opentime | closetime | catprice | 
| 01 | Zouk Mainroom | 28-Oct-2016 | 28-Oct-2016 | Friday | REHAB | 0 | 6 | 00:00 | 04:00 | Zouk Friday | 

Scenario: New Room Setting without eventprice
Given on page view
Given click rooms menu
Given click rooms setting
When select room setting room <$room>
And insert room setting startdate <$startdate>
And insert room setting enddatae <$enddate>
And select room setting openday <$openday>
And insert room setting ticket price <$ticketprice>
And insert room setting bottleratio <$bottleratio>
And insert room setting opentime <$opentime>
And insert room setting closetime <$closetime>
And select room setting catprice <$catprice>
And click save room setting
And check on room calendar <$startdate> <$room>
And assert room setting pop up <$opentime> <$closetime> <$bottleratio> <$ticketprice> <$catprice>



Examples:
| no | room | startdate | enddate | openday | event | ticketprice | bottleratio | opentime | closetime | catprice | 
| 01 | Zouk Mainroom | 28-Oct-2016 | 28-Oct-2016 | Friday | REHAB | 13 | 6 | 00:00 | 04:00 | Zouk Friday | 

Scenario: Update rooms setting
When check on room calendar <$startdate> <$room>
And edit room setting opentime <$opentime>
And edit room setting closetime <$closetime>
And edit room setting bottleratio <$bottleratio>
And click update room setting button
And check on room calendar <$startdate> <$room>
And assert room setting pop up <$opentime> <$closetime> <$bottleratio> <$ticketprice> <$catprice>

Examples:
| no | room | startdate | enddate | openday | event | ticketprice | bottleratio | opentime | closetime | catprice | 
| 01 | Zouk Mainroom | 28-Oct-2016 | 28-Oct-2016 | Friday | REHAB | 13 | 9 | 01:01 | 11:11 | Zouk Friday | 

Scenario: Delete rooms setting
When check on room calendar <$startdate> <$room>
And click delete room setting button

Examples:
| no | room | startdate | enddate | openday | event | ticketprice | bottleratio | opentime | closetime | catprice | 
| 01 | Zouk Mainroom | 28-Oct-2016 | 28-Oct-2016 | Friday | REHAB | 13 | 9 | 01:01 | 11:11 | Zouk Friday | 

Scenario: New Room Setting without eventprice
Given on page view
Given click rooms menu
Given click rooms setting
When select room setting room <$room>
And insert room setting startdate <$startdate>
And insert room setting enddatae <$enddate>
And select room setting openday <$openday>
And insert room setting ticket price <$ticketprice>
And insert room setting bottleratio <$bottleratio>
And insert room setting opentime <$opentime>
And insert room setting closetime <$closetime>
And select room setting catprice <$catprice>
And click save room setting
And check on room calendar <$startdate> <$room>
And assert room setting pop up <$opentime> <$closetime> <$bottleratio> <$ticketprice> <$catprice>



Examples:
| no | room | startdate | enddate | openday | event | ticketprice | bottleratio | opentime | closetime | catprice | 
| 01 | Zouk Mainroom | 28-Oct-2016 | 28-Oct-2016 | Friday | REHAB | 13 | 6 | 00:00 | 04:00 | Zouk Friday | 

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


Scenario: new Table setting
Given click table setting menu
When select table setting room <$room>
And select table setting table <$table>
And insert table setting start date <$startdate>
And insert table setting end date <$enddate>
And insert table setting open days <$openday>
And insert table setting minimum bottle <$minbottle>
And click save table setting
And check on table calendar <$startdate> <$room> <$minbottle>


Examples:
| no | room | table | startdate | enddate | openday | minbottle |  
| 01 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 2 | 

Scenario: Edit Table setting
Given choose room for table calendar <$room>
When click edit on table calendar <$startdate> <$room> 
And edit table setting minimum bottle <$minbottle>
And click update room setting button


Examples:
| no | room | table | startdate | enddate | openday | minbottle |  
| 01 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 
| 02 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 
| 03 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 
| 04 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 
| 05 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 
| 06 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 
| 07 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 

Scenario: Delete Table setting
Given choose room for table calendar <$room>
When click delete on table calendar <$startdate> <$room> <$minbottle>

Examples:
| no | room | table | startdate | enddate | openday | minbottle |  
| 01 | Zouk Mainroom | ZC1 @ C | 28-Oct-2016 | 28-Oct-2016 | Saturday | 5 | 