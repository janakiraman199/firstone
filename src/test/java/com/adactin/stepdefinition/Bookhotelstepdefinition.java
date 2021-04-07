package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;
import com.adactin.test.Bookhotel;
import com.framework.org.CucumberFramework.Baseclass;

import cucumber.api.java.en.*;

public class Bookhotelstepdefinition extends Baseclass {
	public static WebDriver driver=Runner.driver;

	Bookhotel bk= new Bookhotel(driver);

@Given("^User enter valid fisrt name$")
public void user_enter_valid_fisrt_name() throws Throwable {
	inputOfElement(bk.getFirstname(), "ram");
    
}

@Given("^User enter valid last name$")
public void user_enter_valid_last_name() throws Throwable {
	inputOfElement(bk.getLastname(), "prasad");
    
}

@Given("^User enter valid address$")
public void user_enter_valid_address() throws Throwable {
	inputOfElement(bk.getAddress(), "no 5, thiruvanmiyur");
    
}

@Given("^User enter valid card number$")
public void user_enter_valid_card_number() throws Throwable {
	inputOfElement(bk.getCvvnumber(), "2365");
    
}

@Given("^User enter valid card type$")
public void user_enter_valid_card_type() throws Throwable {
	dropdown(bk.getCcnumber(), "AMEX");
    
}

@Given("^User enter valid expiry date$")
public void user_enter_valid_expiry_date() throws Throwable {
	dropdown(bk.getExpirymonth(), "3");
    
}

@Given("^User enter valid expiry year$")
public void user_enter_valid_expiry_year() throws Throwable {
	dropdown(bk.getExpiryyear(), "2014");
	}

@Given("^User enter valid cvv number$")
public void user_enter_valid_cvv_number() throws Throwable {
	inputOfElement(bk.getNumber(), "123");
    
}

@Then("^User clicks booknow option$")
public void user_clicks_booknow_option() throws Throwable {
	click(bk.getBooknow());
   
}


}
