package com.adactin.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	public Selecthotel(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
		
		}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
}
