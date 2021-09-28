package genericLibraries;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public PropertyFile p = new PropertyFile();
	public WebDriverUtilities utilities= new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
	public void closeApp(ITestResult r)
	{
		int status= r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			Screenshot s = new Screenshot();
			s.getPhoto(driver, name);
			
		}
		driver.quit();
		
		
		driver.close();
	}
	
	
}
