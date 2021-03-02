package com.rightease.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.RightEase.base.com.righteaseTestBase;

public class LoginPage_rightease extends righteaseTestBase {
 
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement Signin;
	
	@FindBy(xpath="//div[@class='container-fluild']//a//img")
	WebElement rightease;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement Login;
	
	public LoginPage_rightease() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean Validatelogo()
	{
		return rightease.isDisplayed();
	}
	
	public void clickSignin(){
		Signin.click();
	}
	
	
	public HomePage_rightease login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);	
		Login.click();
		return new HomePage_rightease();
	}
	
}
