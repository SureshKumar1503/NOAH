package tc01;

import org.testng.annotations.Test;

import genericLibrary.BaseClassVtiger;
import pageObjModel.HomePagePage;

public class VtigerHomePageScript extends BaseClassVtiger {
	@Test
	public void tc3() throws Throwable {

		HomePagePage hp = new HomePagePage(driver);
		hp.homePageBtn();

	}

}
