package genericLibraries;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot implements AutoConstant
{
	public String getPhoto(WebDriver driver, String name) throws Throwable
	{
		Date d = new Date();
		// convert the date to string and also replace the : with -
		String date = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(photoPath+date+name+".png");
		FileUtils.copyFile(src, dest);
		return name;
		
		
		}

}
