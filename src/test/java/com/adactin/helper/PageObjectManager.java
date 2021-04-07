package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.test.Bookhotel;
import com.adactin.test.Loginpage;
import com.adactin.test.Logout;
import com.adactin.test.Searchhotel;
import com.adactin.test.Selecthotel;

public class PageObjectManager {
	public static WebDriver driver;
	private Loginpage lp;
	private Searchhotel sh;
	private Selecthotel se;
	private Bookhotel bk;
	private Logout lg;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Loginpage getlp() {
		lp = new Loginpage(driver);
		return lp;

	}

	public Searchhotel getsh() {
		sh = new Searchhotel(driver);
		return sh;
	}

	public Selecthotel getse() {
		se = new Selecthotel(driver);
		return se;
	}

	public Bookhotel getbk() {
		bk = new Bookhotel(driver);
		return bk;

	}

	public Logout getlg() {
		lg = new Logout(driver);
		return lg;
	}
}
