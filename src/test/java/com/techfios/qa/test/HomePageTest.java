package com.techfios.qa.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.techfios.qa.base.TestBase;
import com.techfios.qa.pages.HomePage;
import com.techfios.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle() {
		String homepagetitle =homepage.verifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "Dashboard- iBilling", "Homepage tile is not found.");
	}
	
	@Test(priority=2)
	public void verifyDashbaordPage() {
		homepage.clickOnDashboard();
	}
	
	public void clickOnCustomers() {
		
	}
	

	
//	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
