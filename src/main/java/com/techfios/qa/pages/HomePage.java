package com.techfios.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techfios.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//h2[contains(text(), 'Dashboard')]") WebElement dashboard;
	@FindBy(xpath = "//span[contains(text(),'Customers')]")
	WebElement customers;
	@FindBy(xpath = "//a[contains(text(),'Add Customer')]")
	WebElement addcustomer;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);		
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnDashboard() {
		dashboard.click();
	}
	
	public void clickOnCustomers() {
		Actions action = new Actions(driver);
		action.moveToElement(customers).build().perform();
		addcustomer.click();
	}

	
}
