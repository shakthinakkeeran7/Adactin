

Feature: Adactin Hotel Application

  Test Automation for Adactin Hotel Booking

  @TC-101
  Scenario: To verify valid login details

    Given Launch hotel reservation application using URL as in the test data
    When Login to the application using "shakthinakkeeran" and "shakthinakkeeran" as in the test data

		
		
  @TC-102
  Scenario: To veryfy whether the check-out date field accepts a later date than check-in date
  
    Given Launch hotel reservation application using URL as in the test data
    When Login to the application using "shakthinakkeeran" and "shakthinakkeeran" as in the test data
    And Select location as in test data "New York"
    And Select Room Type as in test data "Standard"
    And Select hotel as in test data "Hotel Sunshine"
    And Select no of room as in test data "2 - Two"
    And Enter check-in date later than check out date field as in test data "30/03/2023" and "25/03/2023"
    And Click on search button
    Then verify that system gives an error saying "Check-In Date shall be before than Check-Out Date"

    @TC-103
    Scenario: To Check if error is data field is in the past
    Given Launch hotel reservation application using URL as in the test data
    When Login to the application using "shakthinakkeeran" and "shakthinakkeeran" as in the test data
    And Select location as in test data "New York"
    And Select Room Type as in test data "Standard"
    And Select hotel as in test data "Hotel Sunshine"
    And Select Room type as in the test data "2 - Two"
    And Select no of room as in test data "2 - Two"
    And Enter check-in date later than check out date field as in test data "18/03/2023" and "22/03/2023"
    And Click on search button
    Then verify that system gives an error saying "Check-In Date should be either Today or Later Date"
		
    
    
    @TC-104 
    Scenario: To verify Whether locations in select Hotel page are displayed according to the location selected in search Hotel
    Given Launch hotel reservation application using URL as in the test data
    When Login to the application using "shakthinakkeeran" and "shakthinakkeeran" as in the test data
    And Select location as in test data "New York"
    And Select Room Type as in test data "Standard"
    And Select hotel as in test data "Hotel Sunshine"
    And Select Room type as in the test data "2 - Two"
    And Select no of room as in test data "2 - Two"
    And Enter check-in date later than check out date field as in test data "23/03/2023" and "25/03/2023"
   	And Click on search button
   	Then Verify that hotel displayed is the same as selected in search Hotel form
   
    @TC-105
    Scenario: To verify date and Check out date are being displayed in selected Hotel page according to the dates selected in search Hotel
   Given Launch hotel reservation application using URL as in the test data
    When Login to the application using "shakthinakkeeran" and "shakthinakkeeran" as in the test data
    And Select location as in test data "New York"
    And Select Room Type as in test data "Standard"
    And Select hotel as in test data "Hotel Sunshine"
    And Select Room type as in the test data "2 - Two"
    And Select no of room as in test data "2 - Two"
    And Enter check-in date later than check out date field as in test data "23/03/2023" and "25/03/2023"
    And Click on search button
    Then Verify that Check-in-date and Check-out-dates are the same as selected in search hotel form
    