package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.manager.FileReaderManager;
import com.adactin.stepDefinition.Temp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", glue = "com.adactin.stepDefinition", dryRun = false, monochrome = true, stepNotifications = true

)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver = BaseClass.getBrowser(browser);
		

	}

	@AfterClass
	public static void tearDown() {
		// driver.quit();
	}

}
