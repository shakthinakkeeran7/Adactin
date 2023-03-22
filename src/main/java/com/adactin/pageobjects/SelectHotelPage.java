package com.adactin.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public static WebDriver driver;
	
	public SelectHotelPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHotelName() {
		return HotelName;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	@FindBy (id = "hotel_name_0")
	private WebElement HotelName;


	@FindBy (id = "arr_date_0")
	private WebElement CheckInDate;

	@FindBy (id = "dep_date_0")
	private WebElement CheckOutDate;
	
	
} 
