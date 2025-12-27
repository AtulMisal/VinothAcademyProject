package utilityFiles;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShots extends BrowserInitialization{

	public static String screenshot() throws IOException 
	{
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File scrfile = ts.getScreenshotAs(OutputType.FILE);
		
	  File destfile=new File("C:\\Users\\atulm\\Desktop\\Selenium_Programs\\SDETProject-02\\Screenshotss\\"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
	  FileUtils.copyFile(scrfile, destfile);
	  return destfile.getAbsolutePath();
	}
}
