package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {
	@Test(priority = 3)
	public void purchaseTest() {
	
		Reporter.log("Executeing Purchase Test Case", true);
	}
	
	@Test(priority = 0)
	public void loginTest() {
	
		Reporter.log("Executeing login Test Case", true);
	}
	
	@Test(priority = -1)
	public void RegisterTest() {
	
		Reporter.log("Executeing Register Test Case", true);
	}
	

}
