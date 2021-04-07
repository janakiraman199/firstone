package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.test.Logout;
import com.framework.org.CucumberFramework.Baseclass;

import cucumber.api.java.en.*;

public class logoutstepdefintion extends Baseclass {

	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	//Logout lg= new Logout(driver);

	@Given("^User clicks logout$")
	public void user_clicks_logout() throws Throwable {

	}

	@Then("^User exits out of application$")
	public void user_exits_out_of_application() throws Throwable {
		click(pom.getlg().getLogout());
	}

}
