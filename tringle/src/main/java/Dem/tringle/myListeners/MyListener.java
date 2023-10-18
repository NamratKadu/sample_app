package Dem.tringle.myListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import Dem.tringle.utility.ScreenShot;

public class MyListener implements  ITestListener{
	@Test 
	public void onTestFailure(ITestResult result) {
		ScreenShot screenshot=new ScreenShot();
		try {
		screenshot.captureFullPageScreenShot(result.getMethod().getMethodName());
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	

}
