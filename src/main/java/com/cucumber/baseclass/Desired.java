package com.cucumber.baseclass;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Desired {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--incognito");
		// options.addArguments("--headless");
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("chrome.switches", "--disable-extensions");
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		options.addArguments("--test-type");
		//options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		options.addArguments("--no-sandbox");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation");
		options.addArguments("--disable-gpu");
		// options.setExperimentalOption("useAutomationExtension", false);
		// options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));

		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 

		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println("done");

		/*
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * 
		 * WebElement amazonLogoDown =
		 * driver.findElement(By.xpath("//*[@id='navFooter']/div[3]/span[1]/div/a/div"))
		 * ; js.executeScript("arguments[0].scrollIntoView();", amazonLogoDown);
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement amazonLogoUp =
		 * driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a/span[1]"));
		 * js.executeScript("arguments[0].scrollIntoView();", amazonLogoUp);
		 */

	}
}
