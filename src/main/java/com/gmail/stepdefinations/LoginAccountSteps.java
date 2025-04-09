package com.gmail.stepdefinations;

import com.gmail.pages.LoginAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAccountSteps {

	@When("User navigates to url the Gmail login page should be loaded properly")
	public void navigatesToLoginPage() {
		LoginAccountPage loginAccountPage = new LoginAccountPage();
		loginAccountPage.ClickOnSignBtn();

	}

	@Then("The user enters Valid email and password")
	public void enterValidCredentials() throws InterruptedException {
		LoginAccountPage loginAccountPage = new LoginAccountPage();
		loginAccountPage.enterValidCredentials();
		
	}

	@Then("The user should be redirected to the inbox")
	public void verifyUserIsredirectedSuccessfully() {

	}

}
