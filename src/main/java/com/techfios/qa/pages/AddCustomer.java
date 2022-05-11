package com.techfios.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.techfios.qa.base.TestBase;

public class AddCustomer extends TestBase {
	Select select;
	
	@FindBy(id="account") WebElement fullName; 
	@FindBy(id="email") WebElement email; 
	@FindBy(id="phone") WebElement phone; 
	@FindBy(id="address") WebElement address; 
	@FindBy(id="city") WebElement city; 
	@FindBy(id="state") WebElement state; 
	@FindBy(id="zip") WebElement zip; 
	@FindBy(xpath="//button[@type='submit' and @id='submit']") WebElement submit;
	
	public void clickOnCustomers() {
		select = new Select(driver.findElement(By.linkText("Customers")));
		select.selectByIndex(0);
	}
	
	public void createAddCustomer(String COMPANY, String TAG, String FULLNAME, String EMAIL, String PHONE, String ADDRESS, String CITY, String STATE, String ZIP, String SUBMIT) {
		
		
		select = new Select(driver.findElement(By.name("cid")));
		select.selectByVisibleText(COMPANY);
		
		select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText(TAG);
		
		fullName.sendKeys(FULLNAME);
		email.sendKeys(EMAIL);
		phone.sendKeys(PHONE);
		address.sendKeys(ADDRESS);
		city.sendKeys(CITY);
		state.sendKeys(STATE);
		zip.sendKeys(ZIP);
		submit.click();
	}
	
	

	

	





}
