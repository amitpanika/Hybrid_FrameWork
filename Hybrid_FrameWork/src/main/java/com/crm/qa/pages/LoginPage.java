package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import dev.failsafe.internal.util.Assert;

public class LoginPage extends TestBase {
	
	// PageFactory - OR;
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//bitton[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//img[Contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	// Initializing the page object;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions;
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	 
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}

}
