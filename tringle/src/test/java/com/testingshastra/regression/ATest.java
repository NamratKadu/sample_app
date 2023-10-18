package com.testingshastra.regression;

import org.testng.annotations.Test;

import DataProviders.dataSet;

public class ATest{
	@Test(dataProvider="Pincode data", dataProviderClass=dataSet.class)
	public void m1(String pincodes) {
		System.out.println("Pincode"+pincodes);
	

	}
	@Test
public  void m2() {
	// TODO Auto-generated method stub
	

}
	@Test
public void m3() {
		String dir=System.getProperty("usere.dir");
	System.out.println(dir);

}
}
