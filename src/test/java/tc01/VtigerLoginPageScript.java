package tc01;

import org.testng.annotations.Test;

import genericLibrary.BaseClassVtiger;
import pageObjModel.SignInVtiger;

public class VtigerLoginPageScript extends BaseClassVtiger{
	@Test
	public void tc1() throws Exception {
		SignInVtiger s=new SignInVtiger(driver);
		s.loginVtiger();
	}

}
