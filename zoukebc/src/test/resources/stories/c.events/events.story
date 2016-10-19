Meta:
@tag epics : events

Narrative:
As a user admin of ZoukEBC
I want to manage events

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


Scenario: New Event
Given click menu events
When click manage menu
And click new event
And insert room event <$room>
And insert category event <$category>
And insert date event <$date>
And insert name event <$name>
And insert body event <$body>
And insert supportby event <$supportby>
And insert ticketprice event <$ticketprice>
And select banner event <$banner>
And insert website event <$website>
And insert video event <$video>
And insert category price event <$categoryprice>
And insert guestlist event <$guestlist>
And insert guestlisturl event <$guestlisturl>
And click save event

Examples:
| no | room | category | date | name | body | supportby | ticketprice | banner | website | video | categoryprice | guestlist | guestlisturl |
| 01 | Zouk Mainroom | Weekly Night | 2016-10-29 00:00 | AutoEvent | Autobody | AutoSupport | 13 | Yes | http://autoweb.com | http://autovid.com | Zouk Saturday | Yes | http://autoguest.com |

Scenario: Edit Event
Given search event <$nameedt>
When click edit event
And assert event edit <$nameedt>
And insert room event <$room>
And insert category event <$category>
And insert date event <$date>
And insert name event <$name>
And insert body event <$body>
And insert supportby event <$supportby>
And insert ticketprice event <$ticketprice>
And select banner event <$banner>
And insert website event <$website>
And insert video event <$video>
And insert category price event <$categoryprice>
And insert guestlist event <$guestlist>
And click save edit event

Examples:
| no | room | category | date | name | nameedt | body | supportby | ticketprice | banner | website | video | categoryprice | guestlist | 
| 01 | Apex | Special | 2016-10-28 00:00 | AutoEventedt | AutoEvent | Autobodyedt | AutoSupportedt | 15 | No | http://autoweb.com | http://autovid.com | Zouk Friday | No | 
 
 Scenario: Delete Event
Given search event <$nameedt>
When event selected <$nameedt>
And click delete event

Examples:
| no | nameedt | 
| 01 | AutoEventedt | 
 
Scenario: New Event Category
Given click event category menu
When click new event category
And insert name event category <$name>
And insert description event category <$description>
And click save event category

Examples:
| no | name | description |
| 01 | AutoCategoryPrice | AutoCategoryPrice Desc |

Scenario: Edit Event Category
Given click edit event category
When assert edit event category <$nameedt>
And insert name event category <$name>
And insert description event category <$description>
And click save event category

Examples:
| no | name | description | nameedt |
| 01 | AutoCategoryPriceedt | AutoCategoryPrice Descedt | AutoCategoryPrice |

Scenario: Delete Event Category
Given assert delete event category <$name>
When click delete event category 

Examples:
| no | name |
| 01 | AutoCategoryPriceedt | 

