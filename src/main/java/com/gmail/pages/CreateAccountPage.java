package com.gmail.pages;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gmail.base.Keyword;
import com.gmail.base.WaitFor;

public class CreateAccountPage extends WaitFor {

	Keyword keyword = new Keyword();

	@FindBy(xpath = "//div[@class=\"header__aside\"]/gws-dropdown-button/div")
	private WebElement createAccount;

	@FindBy(xpath = "//div[@class=\"header__aside\"]/gws-dropdown-button/a")
	private List<WebElement> createAccountOptions;

	@FindBy(xpath = "//div[@class=\"header__aside\"]/gws-dropdown-button/a[1]/span")
	private WebElement forMyPersonalUse;

	@FindBy(xpath = "//h1[@class=\"vAV9bf\"]/span")
	private WebElement signupPageHeading;

	@FindBy(xpath = "//input[@id=\"firstName\"]")
	private WebElement firstNameTextField;

	@FindBy(xpath = "//span[text()=\"Next\"]")
	private WebElement nextButton;

	@FindBy(xpath = "//div[@jsname=\"B34EJ\"]/span")
	private WebElement firstNameErrorMessageValidation;

	@FindBy(xpath = "//h1[@id=\"headingText\"]/span")
	private WebElement basicInfoPageHeading;

	public CreateAccountPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void clickOnCreateAccount(String createAccount2) {

		createAccount.click();
		System.out.println("clicked on Create Account button");
	}

	public void verifyCreateAccountDisplayed(String CreateAccount) {
		Assert.assertTrue(createAccount.isDisplayed());
		System.out.println("Create Account button is visible to User.");
	}

	public void verifyCreateAccountClickable(String CreateAccount) {
		Assert.assertTrue(createAccount.isEnabled());
	}

	public void verifyCreateAccountOptions(String CreateAccount, String forMyPersonalUse, String forMyWorkOrBusiness) {

		List<String> actualOptions = new ArrayList<String>();

		for (WebElement option : createAccountOptions) {
			actualOptions.add(option.getText());
		}
		System.out.println("Options on click of create account: " + actualOptions);

		List<String> expectedOptions = new ArrayList<String>();
		expectedOptions.add(forMyPersonalUse);
		expectedOptions.add(forMyWorkOrBusiness);

		Assert.assertEquals(actualOptions, expectedOptions);
	}

	public void clickOnForMyPersonalUse(String forMyPersonalUse2) {

		forMyPersonalUse.click();
	}

	public void verifyUserNavigateToSignUpPageOnClickForMyPersonalUse() {

		String urlAfterClickOnForMyPersonalUse = Keyword.driver.getCurrentUrl();
		System.out.println(urlAfterClickOnForMyPersonalUse);
		if (urlAfterClickOnForMyPersonalUse.contains("signup")) {
			String actualSignupPageHeader = signupPageHeading.getText();
			String expectedSignupPageHeader = "Create a Google Account";
			Assert.assertEquals(actualSignupPageHeader, expectedSignupPageHeader);
		}
	}

	@FindBy(xpath = "//div[@class=\"header__aside\"]/descendant::span[text()='Sign in']")
	WebElement signIn;

	public void clickOnSignInButton() {
		signIn.click();
	}

	public void enterFirstName(String firstName) {

		firstNameTextField.sendKeys(firstName);
		System.out.println("entered firstname as :" + firstName);
	}

	public void clickOnNextButton() {

		nextButton.click();

	}

	public void verifyFirstNameErrorMessage(String firstNameErrorMessage) {

		String actualFirstNameErrorMessage = firstNameErrorMessageValidation.getText();
		assertEquals(actualFirstNameErrorMessage, firstNameErrorMessage);
	}

	public void verifyUserNavigateToBasicInfoPage(String basicInfoPageHeader) {

		WaitFor.untilUrlLoad("birthdaygender");
		String urlAfterClickOnNext = Keyword.driver.getCurrentUrl();
		Assert.assertTrue(urlAfterClickOnNext.contains("birthdaygender"));

		WaitFor.elementTobeVisible(basicInfoPageHeading);
		String actualBasicInfoPageHeading = basicInfoPageHeading.getText();
		System.out.println("actual heading: " + actualBasicInfoPageHeading);
		assertEquals(actualBasicInfoPageHeading, basicInfoPageHeader);
	}

	public List<String> getUsernameFromExcel() throws IOException {

		FileInputStream fis = new FileInputStream("src/test/resources/testdata/usha.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("username");

		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		List<String> usernames = new ArrayList<String>();
		for (Row row : sheet) {
			Cell cell = row.getCell(0);

			// s[rows][columns]=cell.toString();
			System.out.println(cell.toString());
			usernames.add(cell.toString());
		}
		return usernames;
	}

	public void enterFirstNameFromExcel() throws IOException {
		List<String> usernames = getUsernameFromExcel();
		for (String username : usernames) {
			firstNameTextField.clear();
			firstNameTextField.sendKeys(username);
			System.out.println("entered firstname as :" + username);
			// clickOnNextButton();
		}

	}

	public void clickOnBackButton() {

		Keyword.driver.navigate().back();
	}

	public void verifyAfterBackNavigateToSignInPage() {
		WaitFor.untilUrlLoad("gmail");
		Assert.assertTrue(Keyword.driver.getCurrentUrl().contains("gmail"));
	}

}
