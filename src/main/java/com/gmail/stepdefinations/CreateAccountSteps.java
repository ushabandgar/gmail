package com.gmail.stepdefinations;

import com.gmail.pages.CreateAccountPage;

import io.cucumber.java.en.Then;

public class CreateAccountSteps {

	 
	@Then("{string} text is displayed correctly to users")
	public void createAccountDisplayedOrNot(String CreateAccount) {
		CreateAccountPage createAccountPage=new CreateAccountPage();
		createAccountPage.verifyCreateAccountDisplayed(CreateAccount);
	}

	@Then("{string} button is clickable")
	public void reateAccountClickableOrNot(String CreateAccount) {
		CreateAccountPage createAccountPage=new CreateAccountPage();
		createAccountPage.verifyCreateAccountClickable(CreateAccount);
	}
}
