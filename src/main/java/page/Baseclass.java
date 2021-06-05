package page;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
 
 

public class Baseclass {
	protected static WebDriver driver;
	public static Logger log;
	String Baseurl = "https://www.amazon.in";
	 
	@Parameters("Browser")
	
	@BeforeClass
	
	public void launchbrowser(String br)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhay\\eclipse-workspace\\School\\Drivers\\chromedriver.exe");
		switch(br)
		{

		case "chrome":
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();

			break;

		case "firefox":
			break;


		}
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get(Baseurl);
		log = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");

	}
 
}
