package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learning_Configuration_Annotations {

	@Test
	public void Addtocart() {
		Reporter.log("Execute Add To Cart Test......", true);
	}
	@Test
	public void Removecart() {
		Reporter.log("Execute Remove From Cart Test......", true);
	
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Execute Before Class......", true);
	
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("Execute After Class......", true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Execute Before Method......", true);
	}
	@AfterMethod
	public void aftermetho() {
		Reporter.log("Execute After Method......", true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("Execute Before Test......", true);
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("Execute After Test......", true);
	}
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Execute Before suite......", true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("Execute After Suite......", true);
	}
}
