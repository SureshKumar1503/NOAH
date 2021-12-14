package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePage {
	
	@FindBy(xpath="//a[text()='Calendar']")
	private WebElement CalendarBtn;
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement LeadBtn;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement OrgBtn;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement ContactBtn;
	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement OpportunitiesBtn;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement ProductBtn;
	
	public WebDriver driver;
	
	public HomePagePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void homePageBtn() {
		CalendarBtn.click();
	}

}
