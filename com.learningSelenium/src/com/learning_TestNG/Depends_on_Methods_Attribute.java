package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_Methods_Attribute {
	@Test(dependsOnMethods = {"loginTest"})
	public void purchaseTest() {
	
		Reporter.log("Executeing Purchase Test Case", true);
	}
	
	@Test(dependsOnMethods = {"RegisterTest"})
	public void loginTest() {
	
		Reporter.log("Executeing login Test Case", true);
	}
	
	@Test
	public void RegisterTest() {
	
		Reporter.log("Executeing Register Test Case", true);
	}
	

}
