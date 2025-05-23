package com.gmail.stepdefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.gmail.base.Keyword;
import com.gmail.pages.CreateAccountPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
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

	@And("User enters {string} as username")
	public void enterFirstName(String firstName) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.enterFirstName(firstName);
	}

	@And("Click on Next button")
	public void clickOnNext() throws InterruptedException {
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

	@And("User enter username from excel")
	public void enterUserNameFromExcel() throws IOException {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.getUsernameFromExcel();
		createAccountPage.enterFirstNameFromExcel();
	}

	@And("User enters firstname as {string}")
	public void enterFirstNameAsParameter(String firstName) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.enterFirstName(firstName);
	}

	@And("Click On Back from browser")
	public void clickBackFromCreateAccountPage() {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.clickOnBackButton();
	}

	@Then("User should navigate to Sign In page")
	public void verifyNavigateToSingInPage() {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyAfterBackNavigateToSignInPage();
	}

	@Then("User should see the {string} dropdown")
	public void userShouldSeeTheDropDown(String dropDownName) throws InterruptedException {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.dropDowns(dropDownName);
	}

	@And("User should see the {string} input")
	public void userShouldSeeTheInput(String inputfieldName) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.userShouldSeeInputFields(inputfieldName);
	}

	@And("User should see the {string} link")
	public void userShouldTheLink(String linkName) {
		Assert.assertTrue(Keyword.driver.findElement(By.partialLinkText(linkName)).isDisplayed());
	}

	@And("User should see the {string} button")
	public void userShouldSeeTheButton(String buttonText) {
		Assert.assertTrue(Keyword.driver.findElement(By.xpath("//span[text()=\"Next\"]")).isDisplayed());
	}

	@And("User click on {string} Dropdown")
	public void userClickOnDropdown(String dropDownName) {

		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.clickOnDropDown(dropDownName);
	}
	@Then("The Month dropdown should display following months in correct order:")
	public void monthDropdownShouldHaveAllMonthInOrder(DataTable datatable) throws InterruptedException {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.verifyMonthDropdownListwithOrder(datatable);
	}
}
