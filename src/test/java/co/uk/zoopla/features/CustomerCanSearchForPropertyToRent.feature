Feature: Search Property For Sale
  As a customer
  I want the ability to search for any property of my choice in any location
  so that i can buy the property

  Scenario Outline: Customer can search for any property
  Given I navigate to zoopla homepage
  When I enter a "<Location>" in the seach text box
  And I select "<MinPrice>" from minimum price dropdown
  And I select "<MaxPrice>" from maximum price dropdown
  And I select "<Property>" from property type dropdown
  And I select "<Bed>" from Bedrooms dropdown
  And I click on Search button
  Then a list of "<ProperType>" in "<Location>" are displayed
  Examples:
|Location|MinPrice|MaxPrice|Property|Bed|PropertyType|
|Manchester|£250,000|£230,000|Houses|3+|Houses       |
 #|London|£120,000|£400,000|Farms/land|No min|Property |
 #|Coventry|£120,000|£230,000|Flats|3+|Flat|
 #|Birmingham|      |        |     |  |      |
@ignore
Scenario Outline: Customer cannot search for property with missing values
Given I navigate to zoopla homepage
When I enter a "<Location>" in the seach text box
And I select "<MinPrice>" from minimum price dropdown
And I select "<MaxPrice>" from maximum price dropdown
And I select "<Property>" from property type dropdown
And I select "<Bed>" from Bedrooms dropdown
And I click on Search button
Then an error message is displayed
Examples:
|Location|MinPrice|MaxPrice|Property|Bed|PropertyType|
|     |£250,000|£230,000|Houses|3+|Houses       |

 @ignore
Scenario Outline: Error page is displayed
Given I navigate to zoopla homepage
When I enter a "<Location>" in the seach text box
And I select "<MinPrice>" from minimum price dropdown
And I select "<MaxPrice>" from maximum price dropdown
And I select "<Property>" from property type dropdown
And I select "<Bed>" from Bedrooms dropdown
And I click on Search button
Then an error result page is displayed
  Examples:
|Location|MinPrice|MaxPrice|Property|Bed|PropertyType|
|M291XC|£250,000|£230,000|Houses|3+|Houses       |
|£££|£120,000|£400,000|Farms/land|No min|Property |
|123|£120,000|£230,000|Flats|3+|Flat|