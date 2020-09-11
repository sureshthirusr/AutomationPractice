package com.cucumber.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.helper.FileReaderManager;
import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(ExtendedCucumber.class)
//@ExtendedCucumberOptions(retryCount=4,
//						 jsonReport="REPORT/jsonReport.json"
//						)
@CucumberOptions(features = "src/test/java/com/cucumber/feature/AutomationPractice.feature",
					glue = "com\\cucumber\\stepdefinition", 
					plugin = {  "com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html",
								"html:target/CucumberHtmlReport", "json:target/cucumber.json",
								"rerun:Report/FailedScenario.txt" }, 
					monochrome = true, strict = true, dryRun = false, 
					tags = {"@RegressionTest" })

public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		System.out.println(browser);
		driver = BaseClass.getBrowser(browser);
	}

	@AfterClass
	public static void writeExtentReport() throws Throwable {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getCrInstance().getReportConfigPath()));
	}

}
