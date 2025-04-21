package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.base.Keyword;
import com.gmail.base.WaitFor;

public class SignInPage {

	public SignInPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(xpath = "//input[@id=\"identifierId\"]")
	WebElement email;

	public void enterEmailId(String email) {
		this.email.sendKeys(email);
	}

	@FindBy(xpath = "//span[text()='Next']")
	WebElement next;

	public void clickOnNextButton() {
		WaitFor.elementToBeClick(next);
		next.click();

	}
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	public void enterPassword(String password) {
		WaitFor.elementTobeVisible(this.password);
		this.password.sendKeys(password);
	}
}
