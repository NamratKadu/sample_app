package com.testingshastra.regression;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {
	private  static RemoteWebDriver driver;
	public  static RemoteWebDriver getDriver() {
		return driver;
	}
	@Parameters("browser-name")
	@BeforeMethod
	public RemoteWebDriver  setUp(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			System.out.println("Lunch Chrome Browser");
			
		} 
		/*else if(browserName.equalsIgnoreCase("Firefox")){
			driver=new Firefox();

		}
		else if (browserName.equalsIgnoreCase("internet explorer"))
			
		driver=new internet explorer();
		
		
	}*/
	else 
		System.err.println("Invalid Browser name:"+browserName);
		return driver;
	
		
	}
	@AfterMethod
	public void tearDown()  throws Exception{
		// TODO Auto-generated method stub
		driver.quit();// to close all window

	}
	
	
	
	

}
