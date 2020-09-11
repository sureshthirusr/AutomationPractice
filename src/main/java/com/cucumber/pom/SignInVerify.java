package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignInVerify {
	
	public WebDriver driver;

//	@FindBy(xpath = "//a[@class='login']")
//	private WebElement signInLink;
//
//	@FindBy(id = "search_query_top")
//	private WebElement searchFeild;
	
	public SignInVerify(WebDriver ndriver) {
		this.driver = ndriver;
		// to initialize webElement
		PageFactory.initElements(driver, this);
	}
}
