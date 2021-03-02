package test.RightEase.testcases.com;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rightease.Util.righteaseUtil;
import com.rightease.pages.HomePage_rightease;
import com.rightease.pages.LoginPage_rightease;

import test.RightEase.base.com.righteaseTestBase;

public class HomePage_rightease_Test extends righteaseTestBase {
	LoginPage_rightease loginPage_rightease;
	HomePage_rightease homepage;
	righteaseUtil RighteaseUtil;
	String sheetname="CreateNewAppointment";
	
 public HomePage_rightease_Test() {
	 super(); 
 }
 
  @BeforeTest
  public void setup() {
	 initialization();
	 RighteaseUtil=new righteaseUtil();
	 LoginPage_rightease loginPage_rightease=new LoginPage_rightease();
	 loginPage_rightease.clickSignin();
	 homepage=loginPage_rightease.login(prop.getProperty("username"),prop.getProperty("password"));
 }
	
   @Test(priority=1)
   public void ValidatelogoTest() {
	  boolean flag=homepage.Validatelogo();
	   Assert.assertTrue(flag);
   }
 
   @Test(priority=2)
  public void ClickAppointmentsShow() {
	   homepage.ClickAppointments();
       homepage.ClickNewAppointmentTest();
 } 
   
   @DataProvider(name="sheetname")
	public Object[][] getrighteaseTestData(){
		Object data[][] =righteaseUtil.getTestData(sheetname);
		return data;
	}
   
   @Test(priority=3, dataProvider="sheetname")
   public void validateCreateNewAppointments(String MR_No, String Name, String Gender, String Phone, String Date_of_Birth, String Month, String Year, String Doctor, String BookingType, String Appointment_Date, String SelectSlot){
	
	  // homepage.CreateNewAppointments("02345", "Jack", "9533222321");
	   homepage.CreateNewAppointments(MR_No, Name, Phone, Gender, Date_of_Birth, Month, Year, Doctor, BookingType, Appointment_Date, SelectSlot);   
   }
   
 @Test(priority=4)
 public void ClickFreeShow() {
   homepage.ClickFreeTest();
  }
  @Test(priority=5)
  public void ClickCreateAppointmentShow() {
   homepage.ClickCreateAppointmentTest();
 }

  /* @AfterTest
   public void ShowTest() {
	   driver.quit();
   }  */
} 




