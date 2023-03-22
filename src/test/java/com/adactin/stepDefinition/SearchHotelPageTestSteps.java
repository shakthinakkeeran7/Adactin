package com.adactin.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.adactin.baseclass.BaseClass;
import com.adactin.manager.PageObjectManager;
import com.adactin.runner.TestRunner;

import io.cucumber.java.en.*;

public class SearchHotelPageTestSteps extends BaseClass {
	public static WebDriver driver = TestRunner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@When("Select location as in test data {string}")
	public void select_location_as_in_test_data(String Location) {
		selectDropDownOption(pom.getSearchHotelPage().getLocation(), "visibletext", Location);

	}

	@When("Select hotel as in test data {string}")
	public void select_hotel_as_in_test_data(String Hotels) {
		selectDropDownOption(pom.getSearchHotelPage().getHotels(), "visibletext", Hotels);

	}

	@When("Select Room type as in the test data {string}")
	public void select_room_type_as_in_the_test_data(String RoomType) {
		selectDropDownOption(pom.getSearchHotelPage().getNoOfRooms(), "visibletext", RoomType);

	}

	@When("Select no of room as in test data {string}")
	public void select_no_of_room_as_in_test_data(String NumberOfRooms) {
		selectDropDownOption(pom.getSearchHotelPage().getNoOfRooms(), "visibletext", NumberOfRooms);

	}

	@When("Enter check-in date later than check out date field as in test data {string} and {string}")
	public void enter_check_in_date_later_than_check_out_date_field_as_in_test_data_and(String CheckInDate,
			String CheckOutDate) {
		clearonWebelement(pom.getSearchHotelPage().getCheckInDate());
		inputValuestoWebelement(pom.getSearchHotelPage().getCheckInDate(), CheckInDate);
		clearonWebelement(pom.getSearchHotelPage().getCheckOutDate());
		inputValuestoWebelement(pom.getSearchHotelPage().getCheckOutDate(), CheckOutDate);

	}

	@Then("verify that system gives an error saying {string}")
	public void verify_that_system_gives_an_error_saying(String ErrorMessage) {

		clickonWebelement(pom.getSearchHotelPage().getSubmit());
		
		
		
	}

}
