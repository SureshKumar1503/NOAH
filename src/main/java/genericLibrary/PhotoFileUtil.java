package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PhotoFileUtil {
	
	public void getPhotoVtiger(WebDriver driver,String name) throws IOException {
		Date d=new Date();
		String date = d.toString().replaceAll(".", "-");
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File desti=new File(PathFiles.PhotoPath+date+name+".png");
		FileUtils.copyFile(src, desti);
	}

}
