package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjModel.SignInVtiger;
import pageObjModel.SignOutVtiger;

public class BaseClassVtiger {
	public WebDriver driver;
	public PropertyFileVtiger pdata=new PropertyFileVtiger();
	public WebDriverUtilsOfVtiger utilities=new WebDriverUtilsOfVtiger();
	
	@BeforeClass
	public void openApp() throws IOException {
		driver=new ChromeDriver();
	    driver.get(pdata.getPropertyData("URL"));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void tc1() throws Exception {
		SignInVtiger s=new SignInVtiger(driver);
		s.loginVtiger();
	}
	
	@AfterMethod
	public void tc2() throws Exception {
		
		
	    SignOutVtiger si=new SignOutVtiger(driver);
	    
	    si.logOutBtnVtiger();
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}

}
