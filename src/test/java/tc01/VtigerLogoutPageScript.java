package tc01;

import org.testng.annotations.Test;

import genericLibrary.BaseClassVtiger;
import pageObjModel.SignInVtiger;
import pageObjModel.SignOutVtiger;

public class VtigerLogoutPageScript extends BaseClassVtiger{
	@Test
	public void tc2() throws Exception {
		SignInVtiger s=new SignInVtiger(driver);
		s.loginVtiger();
		
	    SignOutVtiger si=new SignOutVtiger(driver);
	    
	    si.logOutBtnVtiger();
	}

}
