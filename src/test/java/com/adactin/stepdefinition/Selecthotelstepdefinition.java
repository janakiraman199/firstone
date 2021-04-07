package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.test.Selecthotel;
import com.framework.org.CucumberFramework.Baseclass;

import cucumber.api.java.en.*;

public class Selecthotelstepdefinition extends Baseclass {
	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	 //Selecthotel se = new Selecthotel(driver);

	@Given("^User selecting valid hotel name$")
	public void user_selecting_valid_hotel_name() throws Throwable {
		//FileReaderManager.getInstace().getCrInstance().wait();
		click(pom.getse().getRadiobutton());
	}

	@When("^User clicks the radio button$")
	public void user_clicks_the_radio_button() throws Throwable {
		click(pom.getse().getContinuebutton());

	}

	@Then("^User clicks search options$")
	public void user_clicks_search_options() throws Throwable {

	}
}
