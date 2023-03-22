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
	
	@FindBy (xpath = "//input[contains(@id,'hotel_name') and @type='text']")
	private List<WebElement> HotelName;

	public List<WebElement> getHotelName() {
		return HotelName;
	}
	
	
} 
