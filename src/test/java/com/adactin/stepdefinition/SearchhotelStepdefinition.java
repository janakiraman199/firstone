package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.test.Searchhotel;
import com.framework.org.CucumberFramework.Baseclass;

import cucumber.api.java.en.*;

public class SearchhotelStepdefinition extends Baseclass {
	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	// Searchhotel sh = new Searchhotel(driver);

	@Given("^User entering valid datas in search hotel$")
	public void user_entering_valid_datas_in_search_hotel() throws Throwable {

	}

	@When("^User enter valid location$")
	public void user_enter_valid_location() throws Throwable {
		dropdown(pom.getsh().getLocation(), "Sydney");

	}

	@When("^User enter valid hotel$")
	public void user_enter_valid_hotel() throws Throwable {
		dropdown(pom.getsh().getHotels(), "Hotel Creek");

	}

	@When("^User enter valid roomtype$")
	public void user_enter_valid_roomtype() throws Throwable {
		dropdown(pom.getsh().getRoomtype(), "Double");
	}

	@When("^User enter valid number of rooms$")
	public void user_enter_valid_number_of_rooms() throws Throwable {
		dropdown(pom.getsh().getRoomnum(), "3");

	}

	@When("^User enter valid checkin date$")
	public void user_enter_valid_checkin_date() throws Throwable {
		clear(pom.getsh().getDatepick());
		inputOfElement(pom.getsh().getDatepick(), "23/04/2021");

	}

	@When("^User enter valid checkout date$")
	public void user_enter_valid_checkout_date() throws Throwable {
		clear(pom.getsh().getDatepick_out());
		inputOfElement(pom.getsh().getDatepick_out(), "30/04/2021");

	}

	@When("^User enter valid adults$")
	public void user_enter_valid_adults() throws Throwable {
		dropdown(pom.getsh().getAdult(), "4");

	}

	@When("^User enter valid children$")
	public void user_enter_valid_children() throws Throwable {
		dropdown(pom.getsh().getChild(), "3");

	}

	@Then("^User clicks search option$")
	public void user_clicks_search_option() throws Throwable {
		click(pom.getsh().getSubmit());

	}

}
