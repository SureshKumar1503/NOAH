package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.PropertyFileVtiger;

public class SignInVtiger {
	
	PropertyFileVtiger pfv=new PropertyFileVtiger();	
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement UN; 
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement PWD;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement SUB;
	
	public SignInVtiger(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginVtiger() throws Exception {
		UN.sendKeys(pfv.getPropertyData("username"));
		PWD.sendKeys(pfv.getPropertyData("password"));
		SUB.click();
	}
	/*
	public void pWordVtiger() {
		PWD.sendKeys("password");
	}
	public void submitBtn() {
		SUB.click();
	}
	*/

}
