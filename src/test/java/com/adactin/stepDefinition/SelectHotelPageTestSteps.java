package com.adactin.stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.adactin.baseclass.BaseClass;
import com.adactin.enums.Context;
import com.adactin.manager.PageObjectManager;
import com.adactin.pageobjects.SelectHotelPage;
import com.adactin.runner.TestRunner;
import com.adactin.util.TestContext;

import io.cucumber.java.en.Then;

public class SelectHotelPageTestSteps extends BaseClass {
	TestContext testContext;
	SelectHotelPage selectHotelPage;

	public SelectHotelPageTestSteps(TestContext context) {
		testContext = context;
		selectHotelPage = testContext.getPageObjectManager().getSelectHotelPage();
	}

	@Then("Verify that hotel displayed is the same as selected in search Hotel form")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_hotel_form() throws InterruptedException {
		Assert.assertEquals(testContext.getScenarioContext().getContext(Context.HOTEL_NAME),
				getAttribute(selectHotelPage.getHotelName(), "value"));
		

	}
	
	@Then("Verify that Check-in-date and Check-out-dates are the same as selected in search hotel form")
	public void verify_that_check_in_date_and_check_out_dates_are_the_same_as_selected_in_search_hotel_form() {
		Assert.assertEquals(testContext.getScenarioContext().getContext(Context.CHECK_IN_DATE),
				getAttribute(selectHotelPage.getCheckInDate(), "value"));
		Assert.assertEquals(testContext.getScenarioContext().getContext(Context.CHECK_OUT_DATES),
				getAttribute(selectHotelPage.getCheckOutDate(), "value"));
	
	}

}
