package com.adactin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class SearchHotelPage {

	public static WebDriver driver;

	public SearchHotelPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	@FindBy(id = "location")
	private WebElement Location;

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getNoOfAdults() {
		return NoOfAdults;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getCheckIn_Error() {
		return CheckIn_Error;
	}

	public WebElement getCheckOutError() {
		return CheckOutError;
	}

	public WebElement getChildRoom() {
		return ChildRoom;
	}

	@FindBy(id = "hotels")
	private WebElement Hotels;

	@FindBy(id = "room_type")
	private WebElement RoomType;

	@FindBy(id = "room_nos")
	private WebElement NoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement CheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement CheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement NoOfAdults;

	@FindBy(id = "Submit")
	private WebElement Submit;

	@FindBy(id = "checkin_span")
	private WebElement CheckIn_Error;

	@FindBy(id = "checkin_span")
	private WebElement CheckOutError;
	
	
	@FindBy(id = "child_room")
	private WebElement ChildRoom;
	
	
	
	
	

}
