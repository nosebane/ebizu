Meta:
@tag epics : products

Narrative:
As a user admin of ZoukEBC
I want to manage products

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


Scenario: Add New Product
Given click products menu
When click manage products menu
And click new product
And insert product name <$name>
And select prod category <$category>
And insert prod mixer <$mixer>
And insert prod description <$description>
And insert prod brand <$brand>
And insert prod curtype <$curtype>
And insert prod categoryprice <$categoryprice>
And insert prod size <$size>
And insert prod color <$color>
And insert prod sku <$sku>
And insert prod barcode <$barcode>
And insert prod sellprice <$sellprice>
And insert prod remark <$remark>
And select prod custodystatus <$custodystatus>
And select prod rsvnstatus <$rsvnstatus>
And assert prod costprice <$costprice>
And assert prod profitmargin <$profitmargin>
And click save product
Then save product success

Examples:
| no | name | category | mixer | description | brand | curtype | categoryprice | size | color | sku | barcode | sellprice | costprice | profitmargin | remark | custodystatus | rsvnstatus |   
| 01 | AutoProduct | Bottle | Redbull | AutoProduct desc | AutoProduct brand | MYR | Zouk Saturday | 6 | red | 5 | 4 | 10 | 8.58 | 16.60 | AutoProduct remark | Active | Active |


Scenario: Edit Product
Given search product name <$nameedt> 
When click edit products 
And assert product edited <$nameedt>
And insert product name <$name>
And select prod category <$category>
And insert prod description <$description>
And insert prod brand <$brand>
And insert prod curtype <$curtype>
And insert prod categoryprice <$categoryprice>
And insert prod size <$size>
And insert prod color <$color>
And edit prod sku <$sku>
And edit prod barcode <$barcode>
And insert prod sellprice <$sellprice>
And insert prod remark <$remark>
And select prod custodystatus <$custodystatus>
And select prod rsvnstatus <$rsvnstatus>
And assert prod costprice <$costprice>
And assert prod profitmargin <$profitmargin>
And click save edit product
Then edit product success

Examples:
| no | name | nameedt | category | mixer | description | brand | curtype | categoryprice | size | color | sku | barcode | sellprice | costprice | profitmargin | remark | custodystatus | rsvnstatus |   
| 01 | AutoProductedt | AutoProduct | Bottle | 1 x 7up | AutoProduct descedt | AutoProduct brandedt | IDR | Zouk Friday | 1 | white | 2 | 3 | 15 | 12.86 | 16.60 | AutoProduct remarkedt | Inactive | Inactive |

Scenario: Delete Product
Given search product name <$nameedt> 
When assert delete product <$nameedt>
And click delete product
Then assert delete success

Examples:
| no | nameedt | 
| 01 | AutoProductedt | 

Scenario: Add New Category
Given click categories
When click new category
And insert category name <$catname>
And click save category
Then save category success

Examples:
| no | catname | 
| 01 | AutoCategory | 

Scenario: Edit Category
Given click edit <$catnameedt>
When insert category name <$catname>
And click save category
Then edit category success

Examples:
| no | catname | catnameedt |
| 01 | AutoCategoryedt | AutoCategory |

Scenario: Delete Category
Given click delete <$catname>
Then delete category success

Examples:
| no | catname | catnameedt |
| 01 | AutoCategoryedt | AutoCategory |

Scenario: New Category Price
Given click products menu
When click category price
And click new category price
And insert catprice name <$name>
And insert catprice desc <$desc>
And assert bottle name
And insert bottle price <$bottleprice>
And click save catprice
Then save catprice success

Examples:
| no | name | desc | bottleprice |
| 01 | AutoCatPrice | AutoCatPrice desc | 100 |

Scenario: Edit Category Price
Given search category price <$nameedt>
When click edit category price
And insert catprice name <$name>
And insert catprice desc <$desc>
And assert bottle name
And insert bottle price <$bottleprice>
And click save catprice
Then edit catprice success

Examples:
| no | name | desc | bottleprice | nameedt |
| 01 | AutoCatPriceedt | AutoCatPrice descedt | 150 | AutoCatPrice | 

Scenario: Delete Category Price
Given search category price <$nameedt>
When click delete category price
Then delete catprice success

Examples:
| no | nameedt |
| 01 | AutoCatPriceedt | 

