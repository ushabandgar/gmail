package com.gmail.stepdefinations;

import com.gmail.pages.CreateAccountPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountSteps {

	@Then("{string} text is displayed correctly to users")
	public void createAccountDisplayedOrNot(String createAccount) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyCreateAccountDisplayed(createAccount);
	}

	@Then("{string} button is clickable")
	public void createAccountClickableOrNot(String createAccount) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyCreateAccountClickable(createAccount);
	}

	@When("User click on {string} button")
	public void clickOnCreateAccount(String CreateAccount) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.clickOnCreateAccount(CreateAccount);
	}
	
	
	@Then("On click of {string} showing options {string} and {string}")
	public void createAccountClickOptions(String createAccount,String forMyPersonalUse, String forMyWorkOrBusiness) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyCreateAccountOptions(createAccount,forMyPersonalUse,forMyWorkOrBusiness);
	}
}
