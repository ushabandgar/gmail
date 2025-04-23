package com.gmail.stepdefinations;

import com.gmail.pages.CreateAccountPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

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
	public void createAccountClickOptions(String createAccount, String forMyPersonalUse, String forMyWorkOrBusiness) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyCreateAccountOptions(createAccount, forMyPersonalUse, forMyWorkOrBusiness);
	}

	@And("User click on {string} option")
	public void clickOnForMyPersonalUseOption(String forMyPersonalUse) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.clickOnForMyPersonalUse(forMyPersonalUse);

	}

	@Then("User should navigate to Signup page")
	public void verifyUserNavigateToSignUpPageOnClickForMyPersonalUse() {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyUserNavigateToSignUpPageOnClickForMyPersonalUse();
	}
	
	@And("User enters {string}")
	public void enterFirstName(String firstName) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.enterFirstName(firstName);
	}
	
	@And("Click on Next button")
	public void clickOnNext() {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.clickOnNextButton();
	}
	
	@Then("User should get error message {string}")
	public void verifyFirstNameIsMandatory(String firstNameErrorMessage) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyFirstNameErrorMessage(firstNameErrorMessage);
	}
	
	@Then("User should navigate to {string} page")
	public void verifyUserNaviagteToBasicInformationPage(String basicInfoPage) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyUserNavigateToBasicInfoPage(basicInfoPage);
	}
}
