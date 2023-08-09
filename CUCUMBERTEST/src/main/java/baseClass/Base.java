package baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class Base{
	
public WebDriver driver; //driver1 is the refrence variable of webdriver class
public String url = "https:elden.qajarvis.com/#/login";


public Base()
{
	this.driver = new ChromeDriver();
	driver.manage().window().maximize();
	this.driver.get(url);
pageSetup();	
	System.out.println("hi");
}


public abstract void pageSetup();

public WebDriver getDriver()

{
	return driver;
}

}