package com.framework.org.CucumberFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void inputOfElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void title(WebElement element) {
		element.getText();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateto(String value) {
		driver.navigate().to(value);
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void gettitle() {
		System.out.println(driver.getTitle());
	}

	public static void currentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void alert1(String options) {
		if (options.equalsIgnoreCase("ok")) 
		{
			driver.switchTo().alert().accept();
		} 
		else if (options.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void alert2(String options, String text) {
		if (options.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().accept();
		} else if (options.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().dismiss();
		}
	}

	public static void actions(String options, WebElement element) {
		Actions ac = new Actions(driver);
		if (options.equalsIgnoreCase("right")) {
			ac.contextClick(element).build().perform();
		} else if (options.equalsIgnoreCase("double")) {
			ac.doubleClick(element).build().perform();
		} else if (options.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).click().build().perform();
		}
	}

	public static void actions1(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

	public static void robotclass() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void windowhandle1() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void windowhandles2(String title) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title1 = driver.switchTo().window(string).getTitle();
			System.out.println(title1);
			if (driver.switchTo().window(string).getTitle().equals(title)) {
				driver.close();
			}
		}
	}

	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void checkbox(WebElement element) {
		element.click();
	}

	public static void implisitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void explisitwait() {
		WebDriverWait wait = new WebDriverWait(driver, 20);

	}

	public static void screenshot(String value) throws IOException {
		TakesScreenshot j = (TakesScreenshot) driver;
		File sourceFile = j.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir")+"\\CucumberFramework\\Screenshots"+value+ ".png");
		FileUtils.copyFile(sourceFile, destfile);
		driver.quit();

	}

	public static void dropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}
}
