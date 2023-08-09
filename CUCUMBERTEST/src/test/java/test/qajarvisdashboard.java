//package test;
//
//import org.openqa.selenium.WebDriver;
//
//import baseClass.Base;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import pageClass.identify_DashboardLocators;
//
//public class qajarvisdashboard  extends Base {
//
//	WebDriver driver_x;
//	public identify_DashboardLocators dash;
//	
//	@Override
//	public void pageSetup()
//	
//	{
//		this.driver_x= getDriver();
//		this.dash = new identify_DashboardLocators(this.driver_x);
//	}
//
//	@Given("Chrome browser is Open")
//	
//	public void browser_is_open()
//	{
//		//System.out.println("inside:browser is open");
//		dash.broswer_login();
//	    
//	}
//  
//	@And("user enter(.*) anD (.*)$")
//	public void user_enter_the_valid_credentials(String username,String password) {
//		
//		dash.Name(username);
//		dash.putPassword(password);
//		
//	
//	}
//
//	@And("user click on login Button")
//	public void user_click_on_login_button() {
//		dash.Login_Button();
//		
//	}
//	
//	@And("User is navigated to the home Pagee")
//	public void User_is_navigated_to_the_home_page_1() throws InterruptedException
//	{
//	        //xyz.Dashboard_Displayed();
//		Thread.sleep(2000);
//	}
//	@And("User clicks on the Test Suites & Cases Module")
//	public void user_clicks_on_the_test_suites_cases() throws Exception {
//		dash.Test_Suite_Boxxx();
//		
//	}
//	@Then("User is able to view test suite List")
//	public void user_is_able_to_view_test_suite_list() {
//		dash.Test_suite_text_header();
////		driver_x.close();
//
//		
//	}
//	
//	
//
//
//
//}
//


