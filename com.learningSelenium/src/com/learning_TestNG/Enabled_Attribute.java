package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Attribute {
	@Test
	public void purchaseTest() {
	
		Reporter.log("Executeing Purchase Test Case", true);
	}
	
	@Test
	public void loginTest() {
	
		Reporter.log("Executeing login Test Case", true);
	}
	
	@Test(enabled = false)
	public void RegisterTest() {
	
		Reporter.log("Executeing Register Test Case", true);
	}
	

}