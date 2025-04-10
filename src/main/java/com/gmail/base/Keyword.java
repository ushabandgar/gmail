
package com.gmail.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gmail.exception.InvalidBrowserException;

public class Keyword {

	public static RemoteWebDriver driver;

	public void openBrowser(String browserName) throws InvalidBrowserException {

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invald browser name");
		}
		System.out.println("Launched browser: " + browserName);
		throw new InvalidBrowserException(browserName);
	}

	public void launchUrl(String url) {
		driver.get(url);
		System.out.println("Launched url: " + url);
	}

	public void clickOn(WebElement element) {
		element.click();
		System.out.println("Clicked on: " + element.getText());

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();

	}
}
