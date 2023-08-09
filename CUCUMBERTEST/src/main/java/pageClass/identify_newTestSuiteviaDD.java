package pageClass;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class identify_newTestSuiteviaDD {
	

	WebDriver driver;
	
By Username = By.xpath("/html/body/div/div[3]/div[1]/div/div[1]/div[2]/form/div[3]/input");
By Password = By.xpath("/html/body/div/div[3]/div[1]/div/div[1]/div[2]/form/div[4]/input");
By Login = By.xpath("/html/body/div/div[3]/div[1]/div/div[1]/div[2]/form/div[5]/input");
By Dashboard = By.xpath("/html/body/div/div[3]/div[2]/div/section/section/div/section[1]/div[1]/ul/li[1]/a/span");
By Test_Suite_Box=By.cssSelector("li:nth-of-type(4) > a > span");
By NewTest_Suite = By.xpath("/html/body/div[1]/div[3]/div[2]/div/section/section/div/section[1]/div[2]/button");
By NewTest_Suite_text = By.xpath("/html/body/div[1]/div[3]/div[2]/div/section/section/div/section[1]/div[1]/ul/li[2]/span");
By title_box = By.xpath("/html/body/div[1]/div[3]/div[2]/div/section/section/div/section[2]/div[2]/div[1]/section/form/div/div[2]/div/div/input");
By create_button =By.xpath("/html/body/div[1]/div[3]/div[2]/div/section/section/div/section[2]/div[2]/div[3]/div/button[1]");
By verification =By.xpath("//div[text()='Test Suite has been saved successfully.']");

public identify_newTestSuiteviaDD(WebDriver driver1_x)   //Made constructor and passed reference variable
{
	driver = driver1_x;	
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
public void NewTest_Suite () throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(NewTest_Suite).click();
}
public void NewTest_Suite_text () throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(NewTest_Suite_text).isDisplayed();
}
public void Title_box () throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(title_box).sendKeys("testSuite00"+Integer.toString(new Random().nextInt(4))+1);
}
public void Create_button () throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(create_button).click();
}
public void verification () throws InterruptedException 
{	Thread.sleep(1000);

	 driver.findElement(verification).isDisplayed();
		Thread.sleep(5000);
		driver.close();

	 
}
	

}
