package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumber.baseclass.BaseClass;
import com.cucumber.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Report/FailedScenario.txt", 
					glue = "com\\cucumber\\stepdefinition", 
					plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report2/CucumberExtentReport2.html",
							"json:Report2/CucumberJsonReport2.json",
							"html:Report2",
							},
					monochrome=true,
					strict=true,
					dryRun=false
				//	tags="@RegressionTest"
		)

public class TestRunnerRerun {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver= BaseClass.getBrowser(browser);
	}
	
	@AfterClass
	public static void driverQuit() {
		driver.quit();
	}

}
