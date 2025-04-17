package com.gmail.stepdefinations;

import com.gmail.base.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	Keyword keyword=new Keyword();
	
	@Before
	public void setUp() {
		keyword.openBrowser("firefox");
		keyword.launchUrl("https://workspace.google.com/intl/en-US/gmail/");
	}
	
	@After
	public void tearDown() {
		keyword.quitBrowser();
	}
}
