package com.cucumber.paralleltests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + ".\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.twitter.com");
	}
}
