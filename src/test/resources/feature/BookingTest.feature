

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
    And Select hotel as in test data "Hotel Sunshine"
    And Select Room type as in the test data "2 - Two"
    And Select no of room as in test data "2 - Two"
    And Enter check-in date later than check out date field as in test data "20/03/2023" and "19/03/2023"
    Then verify that system gives an error saying "check-indate should not be later than checkout-date"

    #@TC-103
    #Scenario: To Check if error is data field is in the past
   #Given Launch hotel reservation application using URL as in the test data
    #And Login to the application using username and password as in the test data
    #And Select location as in test data
    #And Select hotel as in test data
    #And Select Room type as in the test data
    #And Select no of room as in test data
    #And Enter check-in-date as in test data
    #Then verify that application throws error massage
    #@TC-104 
    #Scenario: To verify Whether locations in select Hotel page are displayed according to the location selected in search Hotel
    #Given Launch hotel reservation application using URL as in the test data
    #And Login to the application using username and password as in the test data
    #And Select location as in test data
    #And Select hotel as in test data
    #And Select Room type as in the test data
    #And Select no of room as in test data
    #And Enter check-in-date as in test data
    #And Select No-of-adults as in test data
    #And Click on search button
    #Then Verify that hotel displayed is the same as selected in search Hotel form
    #@TC-105
    #Scenario: To verify date and Check out date are being displayed in selected Hotel page according to the dates selected in search Hotel
   #Given Launch hotel reservation application using URL as in the test data
    #And Login to the application using username and password as in the test data
    #And Select location as in test data
    #And Select hotel as in test data
    #And Select Room type as in the test data
    #And Select no of room as in test data
    #And Enter check-in-date as in test data
    #And Select No-of-adults as in test data
    #And Click on search button
    #Then Verify that Check-in-date and Check-out-dates are the same as selected in search hotel form
    