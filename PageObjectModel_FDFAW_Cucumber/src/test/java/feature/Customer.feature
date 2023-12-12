Feature: CreateCustomer

Scenario: Create customer1

Given user is in the create customer page
When user enter customername as "CutsomerA" and Description as "DescriptionA" and select radio as "cradio1" and clicks on createcustomerButton
Then customer should be created successfully

Scenario: Create customer2

Given user is in the create customer page
When user enter customername as "CustomerB" and Description as "DescriptionB" and select radio as "cradio2" and clicks on createcustomerButton
Then customer should be created successfully

Scenario: Create customer3

Given user is in the create customer page
When user enter customername as "CustomerC" and Description as "DescriptionC" and select radio as "cradio3" and clicks on createcustomerButton
Then customer should be created successfully

