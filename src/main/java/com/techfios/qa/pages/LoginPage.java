package com.techfios.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techfios.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory or object repository
	@FindBy(name = "username") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "//button[@type = 'submit']") WebElement loginButton;
	
	@FindBy(xpath = "//img[contains(@class,'logo')]") WebElement logo;
	
	//initializing the page object
	public LoginPage(){
		PageFactory.initElements(driver, this);	//this means current class object.
	}
	
	//actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateimage() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	};

}
