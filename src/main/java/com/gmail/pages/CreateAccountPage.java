package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gmail.base.Keyword;

public class CreateAccountPage {

	Keyword keyword=new Keyword();
	@FindBy(xpath="//div[@class=\"header__aside\"]/gws-dropdown-button/div")
	private  WebElement createAccount;
	
	public CreateAccountPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	public void verifyCreateAccountDisplayed(String CreateAccount) {

		Assert.assertTrue(createAccount.isDisplayed());
	}

	
	
	@FindBy (xpath="//div[@class=\"header__aside\"]/descendant::span[text()='Sign in']")
	WebElement signIn;
	
	public void clickOnSignInButton() {
		signIn.click();
	}
}
