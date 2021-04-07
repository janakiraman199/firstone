package com.adactin.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public static WebDriver driver;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public Logout (WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getLogout() {
		return logout;
	}
	}
	


