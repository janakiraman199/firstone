package com.adactin.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cvvnumber;
	
	@FindBy(id="cc_type")
	private WebElement ccnumber;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement number;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	public Bookhotel(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
		
	}
	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	

}
