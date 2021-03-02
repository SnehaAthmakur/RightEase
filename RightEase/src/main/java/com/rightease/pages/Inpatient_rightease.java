package com.rightease.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.RightEase.base.com.righteaseTestBase;

public class Inpatient_rightease extends righteaseTestBase {
	
	@FindBy(xpath="//a[@class='main-nav'][1]")
	WebElement InpatientTab;
	
	@FindBy(xpath="//span[contains(text(),'Patients')]")
	WebElement Patients;
	
	@FindBy(xpath="//select[@class='search-options']")
	WebElement searchoptions;
	
	@FindBy(xpath="//input[@id='tabletFocus']")
	WebElement EnterPatientName;
	
	@FindBy(xpath="//i[@class='glyphicon glyphicon-repeat']")
	WebElement SearchIcon;
	
	// Initializing the page objects:
	
	public Inpatient_rightease() {
		PageFactory.initElements(driver, this);
	}
	
    //Actions:
	 public void InPatient_Test() {
		 InpatientTab.click();
		 Patients.click();
		 searchoptions.click();
		 EnterPatientName.click();
		 SearchIcon.click();	 
	 }

	
}
