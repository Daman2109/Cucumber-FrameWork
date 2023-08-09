package test;

import org.openqa.selenium.WebDriver;

import baseClass.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageClass.identify_testSuiteLocators;

public class qaJarvisTestSuiteCases extends Base {
	WebDriver driver;
	public identify_testSuiteLocators dash;
	
	@Override
	public void pageSetup()
	
	{
		this.driver= getDriver();
		this.dash = new identify_testSuiteLocators(this.driver);
	}

	@Given("Chrome browser is Open...")
	
	public void browser_is_open()
	{
		//System.out.println("inside:browser is open");
		//dash.broswer_login();
	    
	}
  
	@And("user enters (.*) and (.*)$")
	public void user_enter_the_valid_credentials(String username,String password) throws InterruptedException {
		
		Thread.sleep(2000);
		dash.Name(username);
		dash.putPassword(password);
		
	
	}

	@And("user click on login..")
	public void user_click_on_login_button() {
		dash.Login_Button();
		
	}
	

	@And("User on the Test Suites & Cases Module..")
	public void User_click_on_TestSuite_Button() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.Test_Suite_Boxxx();

	}

	
	@Then("User is navigated to create new test suite pagE..")
	public void User_is_navigated_to_create_new_test_suite_pagE() throws InterruptedException {
		dash.NewTest_Suite_text();
		

	}


}
