package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class identify_DashboardLocators {		
	
	WebDriver driver;
	
By Username = By.xpath("/html/body/div/div[3]/div[1]/div/div[1]/div[2]/form/div[3]/input");
By Password = By.xpath("/html/body/div/div[3]/div[1]/div/div[1]/div[2]/form/div[4]/input");
By Login = By.xpath("/html/body/div/div[3]/div[1]/div/div[1]/div[2]/form/div[5]/input");
By Dashboard = By.xpath("/html/body/div/div[3]/div[2]/div/section/section/div/section[1]/div[1]/ul/li[1]/a/span");
By Test_Suite_Box=By.xpath("//i[@class='nav-icon testcases']");
By Test_Suite_text = By.xpath("(//h3[@class='box-title'])[1]");





public identify_DashboardLocators(WebDriver driver1_x)   //Made constructor and passed reference variable
{
	driver = driver1_x;	//  gautam_1 is the reference which is taking the value of driver_2
	
}

public void broswer_login()
{

	String projectPath=System.getProperty("user.dir");

	System.out.println("project path is:"+projectPath);

	System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");

}

public void Name(String a)
{
	driver.findElement(Username).sendKeys(a);
}
	

public void putPassword(String b)

{
	driver.findElement(Password).sendKeys(b);
	
}

public void Login_Button()
{
	driver.findElement(Login).click();
	
}

public void Dashboard_Displayed()
{
	driver.findElement(Dashboard).isDisplayed();
}
public void Test_Suite_Boxxx() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(Test_Suite_Box).click();
}
public void Test_suite_text_header()
{
	driver.findElement(Test_Suite_text).isDisplayed();
}
}
