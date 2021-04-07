package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactin.test.Loginpage;
import com.framework.org.CucumberFramework.Baseclass;

import cucumber.api.java.en.*;

public class LoginStepdefinition extends Baseclass {
	
	public static WebDriver driver=Runner.driver;
	PageObjectManager pm= new PageObjectManager(driver);
	
	//Loginpage lp = new Loginpage(driver);

	@Given("^User launching the adactin application$")
	public void user_launching_the_adactin_application() throws Throwable {
		String geturl = FileReaderManager.getInstace().getCrInstance().geturl();
		getUrl(geturl);
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		inputOfElement(pm.getlp().getUsername(),arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		inputOfElement(pm.getlp().getPassword(), arg1);

	}

	@Then("^User has entered valid username and password$")
	public void user_has_entered_valid_username_and_password() throws Throwable {
		click(pm.getlp().getButton());
	}
}
