package com.cucumber.baseclass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class A {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	//	cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cap);
		WebDriver driver = new ChromeDriver(cap);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("//span[text()='Create an account']"));
		String text = create.getText();
		System.out.println(text);
		
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Greens");
		String at = txtUser.getAttribute("value");
		System.out.println(at);
		

	/*	Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement amazonLogoDown = driver.findElement(By.xpath("//*[@id='navFooter']/div[3]/span[1]/div/a/div"));
		js.executeScript("arguments[0].scrollIntoView();", amazonLogoDown);

		Thread.sleep(5000);

		WebElement amazonLogoUp = driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a/span[1]"));
		js.executeScript("arguments[0].scrollIntoView();", amazonLogoUp);*/

	}
}
