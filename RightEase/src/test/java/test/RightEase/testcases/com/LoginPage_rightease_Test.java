package test.RightEase.testcases.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rightease.pages.HomePage_rightease;
import com.rightease.pages.LoginPage_rightease;

import test.RightEase.base.com.righteaseTestBase;

public class LoginPage_rightease_Test extends righteaseTestBase {
	LoginPage_rightease LoginPage_Test;
	HomePage_rightease homepage_rightease;
	
	public LoginPage_rightease_Test() {
		super();
	}
	 
	@BeforeMethod
	public void setup() {
		righteaseTestBase.initialization();
		LoginPage_Test=new LoginPage_rightease();
	}
	
	@Test(priority=1)
	public void SigninTest() {
		LoginPage_Test.clickSignin();
	}
	
	@Test(priority=2)
	public void LoginpageTest() {
		LoginPage_Test.clickSignin();
		homepage_rightease=LoginPage_Test.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void ShowTest() {
		driver.quit();
	}
}



