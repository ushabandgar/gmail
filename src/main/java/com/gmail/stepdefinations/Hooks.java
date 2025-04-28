package com.gmail.stepdefinations;

import org.openqa.selenium.OutputType;

import com.gmail.base.Keyword;
import com.gmail.exception.InvalidBrowserException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	Keyword keyword=new Keyword();
	
	@Before
  
	public void setUp() {

		keyword.openBrowser("firefox");
		keyword.launchUrl("https://workspace.google.com/intl/en-US/gmail/");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screebshotName=scenario.getName().replace(" ", "_");
			byte[] screenshotFile= Keyword.driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotFile, "img/png", screebshotName);
		}
		keyword.quitBrowser();
	}
}
