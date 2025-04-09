package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gmail.base.Keyword;
import com.gmail.base.WaitFor;

public class LoginAccountPage {
	
	Keyword keyword = new Keyword();
	
	@FindBy(xpath = "//div[@class=\"header__aside\"]/a[2]")
	private WebElement signInBTn;
	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement emailInputBox;
	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement passwordInputBox;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtn;

	public LoginAccountPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void ClickOnSignBtn() {
		WaitFor.elementTobeVisible(signInBTn);
		keyword.clickOn(signInBTn);
		Assert.assertTrue(Keyword.driver.getCurrentUrl().contains("https://accounts.google.com/"));
		
	}

	public void enterValidCredentials() throws InterruptedException {
		WaitFor.elementTobeVisible(emailInputBox);
		keyword.clickOn(emailInputBox);
		emailInputBox.sendKeys("rosh19989@gmail.com");
		nextBtn.click();
	
		
		passwordInputBox.sendKeys("Rosh@12345");
		nextBtn.click();
	}
}
