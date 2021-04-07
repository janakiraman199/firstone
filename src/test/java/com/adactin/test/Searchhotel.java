package com.adactin.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
 private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnum;

	@FindBy(id="datepick_in")
	private WebElement datepick;
	
	@FindBy(id="datepick_out")
	private WebElement datepick_out;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public Searchhotel(WebDriver driver1) {
this.driver=driver1;
PageFactory.initElements(driver1, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnum() {
		return roomnum;
	}
	

	public WebElement getDatepick() {
		return datepick;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	
}
