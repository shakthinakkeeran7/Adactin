package com.adactin.stepDefinition;

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

	public static WebDriver driver = TestRunner.driver;

	@Then("Verify that hotel displayed is the same as selected in search Hotel form")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_hotel_form() {

		for (WebElement each : selectHotelPage.getHotelName()) {
			
			//testContext.getScenarioContext().setContext(Context.HotelName, a);
			Assert.assertEquals(testContext.getScenarioContext().getContext(Context.Hotel_Name), getText(each));
			System.out.println(getText(each));
		}

	}
}
