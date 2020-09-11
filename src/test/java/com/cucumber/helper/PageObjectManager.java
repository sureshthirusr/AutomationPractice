package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.HomePage;
import com.cucumber.pom.LogOut;
import com.cucumber.pom.SignInPage;
import com.cucumber.pom.SignInVerify;

public class PageObjectManager {

	public WebDriver driver;

	private HomePage hp;
	private SignInPage sp;
	private SignInVerify sv;
	public LogOut lo;

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public SignInPage getSp() {
		sp = new SignInPage(driver);
		return sp;
	}

	public SignInVerify getSv() {
		sv = new SignInVerify(driver);
		return sv;
	}

	public LogOut getLo() {
		lo = new LogOut(driver);
		return lo;
	}

	public PageObjectManager(WebDriver mdriver) {
		this.driver = mdriver;
	}
}