package com.testingshastra.regression;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProviders.dataSet;
import Dem.tringle.utility.ExcelUtil;

public class pinCodeData {
	@Test(dataProvider = "Pincode data",dataProviderClass = dataSet.class)
	public void showpincode(String pincode) {
		System.out.println("show pincodes"+ pincode);
		
	}
	@DataProvider(name="Pincode data")
	public String[][]dataPincode() throws IOException {
		ExcelUtil excel=new ExcelUtil();
		 String [][]pincodes =(String[][]) excel.loadExcelTo2DArray("/src/test/resourses/Pincodes.xlsx","pincodes");
		
		return pincodes;
		// TODO Auto-generated method stub

	}
	/*@DataProvider(name=" Credential Data")
	public void credentialsData() throws IOException {
		ExcelUtil excel= new ExcelUtil();
		excel.loadExcelIn2SArray("/src/main/resousrese", "cridential");
		
		

	}*/

}

