package com.techfios.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.techfios.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIME = 20;
	public static long IMPLICIT_WAIT = 10;
		
	WebElement customerdropdown = driver.findElement(By.xpath("Customers"));
	
	public void selectDropDown() {
		Select sel = new Select(customerdropdown);
		sel.selectByIndex(0);
		
	}

}
