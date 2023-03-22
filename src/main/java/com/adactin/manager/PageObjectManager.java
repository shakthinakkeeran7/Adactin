package com.adactin.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pageobjects.LoginPage;
import com.adactin.pageobjects.SearchHotelPage;

public class PageObjectManager {
	WebDriver driver;
	LoginPage loginpage;
	SearchHotelPage searchHotelPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage getLoginpage() {

		if (loginpage == null) {
			loginpage = new LoginPage(driver);
		}
		return loginpage;
	}

	public SearchHotelPage getSearchHotelPage() {
		if (searchHotelPage == null) {
			searchHotelPage = new SearchHotelPage(driver);
		}
		return searchHotelPage;
	}

}
