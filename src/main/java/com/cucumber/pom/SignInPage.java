package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;

	public SignInPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement emailFeild;

	@FindBy(id = "passwd")
	private WebElement passwordFeild;

	@FindBy(id = "SubmitLogin")
	private WebElement signInBtn;

	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getPasswordFeild() {
		return passwordFeild;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

}


