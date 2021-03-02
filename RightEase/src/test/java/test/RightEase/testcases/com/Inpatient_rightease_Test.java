package test.RightEase.testcases.com;

import org.testng.annotations.BeforeMethod;

import com.rightease.Util.righteaseUtil;
import com.rightease.pages.HomePage_rightease;
import com.rightease.pages.LoginPage_rightease;

import test.RightEase.base.com.righteaseTestBase;

public class Inpatient_rightease_Test extends righteaseTestBase {

	LoginPage_rightease loginPage_rightease;
	HomePage_rightease homepage;
	righteaseUtil RighteaseUtil;
	
	public Inpatient_rightease_Test() {
	   super();
	}
	
	@BeforeMethod
	  public void setup() {
		 initialization();
		 RighteaseUtil=new righteaseUtil();
		 LoginPage_rightease loginPage_rightease=new LoginPage_rightease();
		 homepage=loginPage_rightease.login(prop.getProperty("username"),prop.getProperty("password"));
	 }
	
	

}
