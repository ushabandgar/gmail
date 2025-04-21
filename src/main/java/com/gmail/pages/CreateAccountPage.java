package com.gmail.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gmail.base.Keyword;

public class CreateAccountPage {

	Keyword keyword = new Keyword();
	@FindBy(xpath = "//div[@class=\"header__aside\"]/gws-dropdown-button/div")
	private WebElement createAccount;

	@FindBy(xpath="//div[@class=\"header__aside\"]/gws-dropdown-button/a")
	private List<WebElement> createAccountOptions;
	
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

	public void verifyCreateAccountOptions(String CreateAccount, String forMyPersonalUse,
			String forMyWorkOrBusiness) {

		List<String> actualOptions=new ArrayList<String>();
		
		for (WebElement option : createAccountOptions) {
			actualOptions.add(option.getText());
		}
		System.out.println("Options on click of create account: "+actualOptions);

		List<String> expectedOptions=new ArrayList<String>();
		expectedOptions.add("For my personal use");
		expectedOptions.add("For my work or business");
		
		Assert.assertEquals(actualOptions, expectedOptions);
	}

	
	
	@FindBy (xpath="//div[@class=\"header__aside\"]/descendant::span[text()='Sign in']")
	WebElement signIn;
	
	public void clickOnSignInButton() {
		signIn.click();
	}
}
