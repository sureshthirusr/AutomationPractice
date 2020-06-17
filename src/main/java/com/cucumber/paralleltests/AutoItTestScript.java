package com.cucumber.paralleltests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItTestScript {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\com\\cucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.tinyupload.com/");
		// driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		driver.get("http://toolsqa.com/automation-practice-form");
		Thread.sleep(10000);
		WebElement e = driver.findElement(By.id("photo"));
		e.click();
		Runtime.getRuntime().exec("C:\\AutoIt\\AutoItScriptExecutor.exe");
	}

}
