package com.rightease.pages;

import org.apache.poi.ss.formula.eval.StringValueEval;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.RightEase.base.com.righteaseTestBase;

public class HomePage_rightease extends righteaseTestBase {

	//Annotations
	 @FindBy(xpath="//span[contains(text(),'Mother Hospital')]")
	 WebElement MotherHospital;
	 
	 @FindBy(xpath="//span[text()='Appointments']")
	 WebElement Appointments;
	 
	 @FindBy(xpath="//*[contains(@class, 'btn create-btn btn-info')]")
	 WebElement NewAppointme;
	 
	 @FindBy(xpath="//input[@id='tabletAutoFocus']")
	 WebElement MR_No;
	 
	 @FindBy(xpath="//input[@placeholder='Name']")
	 WebElement Name;
	 
	 @FindBy(xpath="//input[@placeholder='Phone']")
	 WebElement Phone;
	 
	 @FindBy(xpath="//input[@id='dp1600521977301']")
	 WebElement clickAppointmentDate;
	 
	 @FindBy(xpath="//button[@id='free']")
	 WebElement Free;
	 
	 @FindBy(xpath="//button[@class='btn btn-info create-btn']")
	 WebElement CreateAppointment;
	 
	 @FindBy(xpath="//select[@id='gender']")
	 WebElement GenderSelect;
	 
	 
	// Initializing the page objects:
	    public HomePage_rightease() {
			PageFactory.initElements(driver, this);
		}
	    
	    
	 //Actions: 
	    public boolean Validatelogo()
		{
			return MotherHospital.isDisplayed();
		}	   
	    public void ClickAppointments() {
	    	Appointments.click();
	    }
	    public void ClickNewAppointmentTest() {
	    	NewAppointme.click();
	    }
	    
	    public void CreateNewAppointments(String MR_Num, String APPName,  String Phone_Num, String Gender, String Date_of_Birth, String Month, String Year, String Doctor, String BookingType, String Appointment_Date, String SelectSlot) {
	    	MR_No.sendKeys("12345");
	    	Name.sendKeys("ABC");
	    	Phone.sendKeys(String.valueOf(Phone_Num));
	        GenderSelect.click();
	    	Select select=new Select(GenderSelect);

	    	select.selectByVisibleText("Male");
	   
	    
	    	Select select1=new Select(driver.findElement(By.name("date")));
        	select1.selectByVisibleText(Date_of_Birth);
        	Select select2=new Select(driver.findElement(By.name("month")));
        	select2.selectByVisibleText(Month);
        	Select select3=new Select(driver.findElement(By.name("year")));
 		    select3.selectByVisibleText(Year);
 		    Select  select4=new Select(driver.findElement(By.className("form-control pristine untouched")));
      	    select4.selectByVisibleText(Doctor);
      	    Select select5=new Select(driver.findElement(By.name("booktype")));
		    select5.selectByVisibleText(BookingType);	
		    Select select6=new Select(driver.findElement(By.id("dp1600521977301")));
		    select6.selectByVisibleText(Appointment_Date);
		    Select select7=new Select(driver.findElement(By.name("appointment.appointmentStart")));
         	select7.selectByVisibleText(SelectSlot);
	    }   
	    
	    public void ClickFreeTest() {
	    	Free.click();
	    }
	    
	    public void ClickCreateAppointmentTest() {
	    	CreateAppointment.click();
	    }
	    
	    
}










