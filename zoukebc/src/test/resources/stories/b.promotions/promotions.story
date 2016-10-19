Meta:
@tag epics : promotions

Narrative:
As a user admin of ZoukEBC
I want to manage promotion

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


Scenario: Add New Promotion
Given click promotions
When click manage promotions
And click new promotions
And insert room <$room>
And insert offer name <$offername>
And insert start date <$startdate>
And insert end date <$enddate>
And insert description <$description>
And insert terms
And select banner <$banner>
And click save
And notif save showup

Examples:
| no | room | offername | startdate | enddate | description | banner |
| 01 | zouk main | AutoOfferName | 2016-12-01 00:00 | 2016-12-31 00:00 | autodesc | Yes |

Scenario: Edit Promotion
Given search promotions <$offernameedt>
When click edit promotions 
And insert offer name <$offername>
And insert start date <$startdate>
And insert end date <$enddate>
And insert description <$description>
And insert terms
And select banner <$banner>
And click save for edit promo

Examples:
| no | room | offername | startdate | enddate | description | banner | offernameedt | 
| 01 | zouk main | AutoOfferNameedt | 2016-11-01 00:00 | 2016-11-30 00:00 | autodescedt | No | AutoOfferName |

Scenario: Delete Promotion
Given search promotions <$offernameedt>
When click delete promotions

Examples:
| no | offernameedt |
| 01 | AutoOfferNameedt |

