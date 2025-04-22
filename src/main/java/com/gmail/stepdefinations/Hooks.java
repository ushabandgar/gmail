package com.gmail.stepdefinations;

import com.gmail.base.Keyword;
import com.gmail.exception.InvalidBrowserException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	Keyword keyword=new Keyword();
	
	@Before
  
	public void setUp() throws InvalidBrowserException {
	public void setUp() {

		keyword.openBrowser("chrome");
		keyword.launchUrl("https://workspace.google.com/intl/en-US/gmail/");
	}
	
	@After
	public void tearDown() {
		keyword.quitBrowser();
	}
}
