package com.techfios.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.techfios.qa.base.TestBase;
import com.techfios.qa.pages.AddCustomer;
import com.techfios.qa.pages.LoginPage;

public class AddCustomerTest extends TestBase{
	LoginPage loginpage;
	AddCustomer addcustomer;
	
	public AddCustomerTest(){
		super();	
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		loginpage.login("demo@techfios.com", "abc123");
	}
	
	@Test
	public void validateCreateAddCustomers() {
		addcustomer.clickOnCustomers();
		addcustomer = new AddCustomer();
		addcustomer.createAddCustomer("Amazon", "IT Training", "sokoeurn chhay", "sokoeurn@gmail.com", "2013214567", "carrollton", "Dallas", "TX", "75226", "Colombia");
		
	}


}
