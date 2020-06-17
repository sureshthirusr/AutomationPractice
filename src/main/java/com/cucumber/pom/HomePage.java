package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInLink;

	@FindBy(id = "search_query_top")
	private WebElement searchFeild;
	
	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
		// to initialize webElement
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getSearchFeild() {
		return searchFeild;
	}
	
	
	

}
