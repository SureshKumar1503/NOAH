package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.WebDriverUtilsOfVtiger;

public class SignOutVtiger {
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement imgBtn;
	
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement logOutBtn;

	private WebDriver driver;
	
	public SignOutVtiger(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void logOutBtnVtiger() {
		WebDriverUtilsOfVtiger utilities=new WebDriverUtilsOfVtiger();
		utilities.mouseHover(driver, imgBtn);
		logOutBtn.click();
	}

}
