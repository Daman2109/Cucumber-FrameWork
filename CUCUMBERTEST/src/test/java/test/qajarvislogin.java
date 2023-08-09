//package test;
//
//import org.openqa.selenium.WebDriver;
//import pageClass.identify_LoginLocators;
//import baseClass.Base;
//import io.cucumber.java.en.*;
//
//public class qajarvislogin extends Base {
//	
//	WebDriver driver;
//	public identify_LoginLocators login;
//	
//	@Override
//	public void pageSetup()
//	
//	{
//		this.driver= getDriver();
//		this.login = new identify_LoginLocators(this.driver);
//	}
//
//	@Given("Chrome browser is open")
//	
//	public void browser_is_open()
//	{
//		//System.out.println("inside:browser is open");
//		login.broswer_login();
//	    
//	}
//
//	@And("user enter(.*) and (.*)$")
//	public void user_enter_the_valid_credentials(String username,String password) {
//		
//		login.Name(username);
//		login.putPassword(password);
//	}
//
//	@And("user click on login button")
//	public void user_click_on_login_button() {
//		login.Login_Button();
//	}
//	@Then("User is navigated to the home page")
//	public void User_is_navigated_to_the_home_page() throws InterruptedException
//	{
//	        //xyz.Dashboard_Displayed();
//		Thread.sleep(2000);
//		driver.close();
//	}
//
//}
