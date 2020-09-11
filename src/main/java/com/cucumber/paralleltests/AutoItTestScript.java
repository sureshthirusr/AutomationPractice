package com.cucumber.paralleltests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItTestScript {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.tinyupload.com/");
		// driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement upload_Button= driver.findElement(By.xpath("//*[@id=\"__cond-24\"]/div/div/div/div/div[2]/form/label/div/div[2]/button[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		Thread.sleep(3000);

		//executor.executeScript("arguments[0].click();", upload_Button);
		upload_Button.click();
		System.out.println("clicked");
		
		Runtime.getRuntime().exec("D:\\AutoIt\\AutoScriptExecutor1.exe");
		Thread.sleep(2000);
		System.out.println("Completed");
		
//		WebElement submit= driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
//		submit.click();
	}

}
