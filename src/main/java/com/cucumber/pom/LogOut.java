package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	public WebDriver driver;

//	@FindBy(xpath = "//a[@class='login']")
//	private WebElement signInLink;
//
//	@FindBy(id = "search_query_top")
//	private WebElement searchFeild;
	
	public LogOut(WebDriver kdriver) {
		this.driver = kdriver;
		// to initialize webElement
		PageFactory.initElements(driver, this);
	}

}
