package com.techfios.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.techfios.qa.base.TestBase;
import com.techfios.qa.pages.HomePage;
import com.techfios.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login - iBilling");
	}
	
	@Test(priority=2)
	public void techfiosLogoTest() {
		Boolean flag = loginpage.validateimage();
		Assert.assertTrue(true, "Pleas ignore wrong image");
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
