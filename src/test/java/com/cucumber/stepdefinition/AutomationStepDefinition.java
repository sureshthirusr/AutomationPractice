package com.cucumber.stepdefinition;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cucumber.baseclass.BaseClass;
import com.cucumber.helper.FileReaderManager;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.testrunner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AutomationStepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("Scenario name: "+name);
	}
	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("      Status: "+status);
		
		if (scenario.isFailed()) {
			takeScreenShot(scenario.getName());
		}
	}
	
	@Given("^User open application$")
	public void user_open_application() throws Throwable {
		System.out.println("User launch the application");
	}

	@Given("^User reach the homepage$")
	public void user_reach_the_homepage() throws Throwable {
		System.out.println("User reach the homepage");
	}

	@Given("^User launch the AutomationPractice application$")
	public void user_launch_the_AutomationPractice_application() throws Throwable {
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);
	}

	@When("^User Click on SignIn Button in the header$")
	public void user_Click_on_SignIn_Button_in_the_header() throws Throwable {
		clickonWebelement(pom.getHp().getSignInLink());
	}

	@When("^User Enter email Id \"([^\"]*)\" in SignIn page$")
	public void user_Enter_email_Id_in_SignIn_page(String email) throws Throwable {
		inputValuestoWebelement(pom.getSp().getEmailFeild(), email);
	}

	@When("^User Enter Password \"([^\"]*)\" in SignIn page$")
	public void user_Enter_Password_in_SignIn_page(String password) throws Throwable {
		inputValuestoWebelement(pom.getSp().getPasswordFeild(), password);
	}

	@When("^User Click SignIn button in SignIn page$")
	public void user_Click_SignIn_button_in_SignIn_page() throws Throwable {
		clickonWebelement(pom.getSp().getSignInBtn());
	}

	@Then("^User Verify the UserName displayed in the header$")
	public void user_Verify_the_UserName_displayed_in_the_header() throws Throwable {
	//	Assert.assertEquals(" ", "  ");
		driver.findElement(By.className(""));
	}

	@When("^User click on the Menu navigation in the Header$")
	public void user_click_on_the_Menu_navigation_in_the_Header() throws Throwable {
		//Assert.assertEquals("s","S");
 
	}

	
	@When("^User Click on the Product Selection in the Menu Navigation$")
	public void user_Click_on_the_Product_Selection_in_the_Menu_Navigation() throws Throwable {

	}

	@When("^User to view the Product in  the page$")
	public void user_to_view_the_Product_in_the_page() throws Throwable {

	}

	@Then("^User Verify the product in the given page$")
	public void user_Verify_the_product_in_the_given_page() throws Throwable {

	}

	@When("^User able to select the product$")
	public void user_able_to_select_the_product() throws Throwable {

	}

	@When("^User able to click the product which customer want$")
	public void user_able_to_click_the_product_which_customer_want() throws Throwable {

	}

	@When("^User able to select the quantity, size and color$")
	public void user_able_to_select_the_quantity_size_and_color() throws Throwable {

	}

	@When("^User click the proceed to checkout$")
	public void user_click_the_proceed_to_checkout() throws Throwable {

	}

	@When("^User verify the delivery address$")
	public void user_verify_the_delivery_address() throws Throwable {

	}

	@When("^User click the proceed button$")
	public void user_click_the_proceed_button() throws Throwable {

	}

	@Then("^User verify the product which is selected$")
	public void user_verify_the_product_which_is_selected() throws Throwable {

	}

	@When("^User able to select the payment mode on the payment page$")
	public void user_able_to_select_the_payment_mode_on_the_payment_page() throws Throwable {

	}

	@When("^User click on the Payment mode which he prefers$")
	public void user_click_on_the_Payment_mode_which_he_prefers() throws Throwable {

	}

	@When("^User click on the confirm order button$")
	public void user_click_on_the_confirm_order_button() throws Throwable {

	}

	@Then("^User verify the order is placed or not$")
	public void user_verify_the_order_is_placed_or_not() throws Throwable {

	}

	@When("^Failed User to click on SignOut button$")
	public void Failed_user_to_click_on_SignOut_button() throws Throwable {

	}

	@Then("^Failed User verify the logout session$")
	public void Failed_user_verify_the_logout_session() throws Throwable {
	}
	
	@When("^User to click on SignOut button$")
	public void user_to_click_on_SignOut_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^User verify the logout session$")
	public void user_verify_the_logout_session() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	
	@When("^User Enter email Id (\\d+)@gmail\\.com in SignIn page$")
	public void user_Enter_email_Id_gmail_com_in_SignIn_page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User Enter Password (\\d+) in SignIn page$")
	public void user_Enter_Password_in_SignIn_page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("^user launch the facebook application$")
	public void user_launch_the_facebook_application() throws Throwable {
driver.navigate().to("https://www.facebook.com");
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("1223");
	}

	@When("^User click on password button$")
	public void user_click_on_password_button() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("1223");
	}

	@Then("^User validate the homepage$")
	public void user_validate_the_homepage() throws Throwable {
		driver.findElement(By.id("dfdf")).click();
	}

}
