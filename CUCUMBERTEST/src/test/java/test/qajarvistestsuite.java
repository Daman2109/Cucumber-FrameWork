package test;

import org.openqa.selenium.WebDriver;

import baseClass.Base;
import io.cucumber.java.en.*;

import pageClass.identify_testSuiteLocators;

public class qajarvistestsuite  extends Base {
	WebDriver driver;
	public identify_testSuiteLocators dash;
	
	@Override
	public void pageSetup()
	
	{
		this.driver= getDriver();
		this.dash = new identify_testSuiteLocators(this.driver);
	}

	@Given("Chrome browser is Open..")
	
	public void browser_is_open()
	{
		//System.out.println("inside:browser is open");
		//dash.broswer_login();
	    
	}
  
	@And("user Enters (.*) and (.*)$")
	public void user_enter_the_valid_credentials(String username,String password) throws InterruptedException {
		
		Thread.sleep(2000);
		dash.Name(username);
		dash.putPassword(password);
		
	
	}

	@And("user click on login...")
	public void user_click_on_login_button() {
		dash.Login_Button();
		
	}
	

	@And("User on the Test Suites & Cases Module...")
	public void User_click_on_TestSuite_Button() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.Test_Suite_Boxxx();

	}
	@And("User clicks on Create a new Test Suite buttoN...")
	public void user_clicks_on_Create_a_new_Test_Suite_button() throws Exception {
		dash.NewTest_Suite();
		
	}
	@And("user enter title")
	public void user_enter_title() throws Exception {
		dash.Title_box();
		
	}
	@And("user click on create button")
	public void user_click_on_create_button() throws Exception {
		dash.Create_button();
		
	}
	
	
	@Then("User created new test suite...")
	public void User_created_new_test_suite() throws InterruptedException {
		dash.verification();

	}



}
