package com.testingshastra.regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BTest {
	/*@BeforeClass //it will be executed before first test case of current class
	public void M3() {
		// TODO Auto-generated method stub

	}*/
	@BeforeMethod // before method executed only before every test cases of current class
	public void M7() {
		// TODO Auto-generated method stub
		System.out.println("Before method");

	}
	@BeforeTest // before test executed before all test cases
	public void M4() {
		// TODO Auto-generated method stub
		System.out.println("Before Test");

	}
	@BeforeSuite //Before suit executed suit
	public void M5() {
		System.out.println("BeforeSuite");

	}
	@Test
	public  void M6() {
		

	}

}
/*
 * BeforeSuit
 * BeforeTest
 * BeforeClass
 * BeforeMethod
 * @Test
 * AfterMethod
 * AfterClass
 * AfterTest
 * AfterSuit
 * */
