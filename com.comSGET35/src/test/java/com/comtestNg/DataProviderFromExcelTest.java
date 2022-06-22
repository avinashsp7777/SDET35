package com.comtestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtalities.ExcelUtility;

public class DataProviderFromExcelTest {
	@Test(dataProvider = "excelFile")
	
public void Propfile(String key, String value)
	{
	System.out.println(key+" "+value);
	}

	@DataProvider
	public Object[][] excelFile() throws Throwable{
    Object[][] objArr= new Object[2][2];
	ExcelUtility eXib = new ExcelUtility();
	objArr[0][0]=eXib.readDataFromExcel("Sheet1", 0, 0);
	objArr[0][1]=eXib.readDataFromExcel("Sheet1",0 ,2);
	return objArr;
}
}
			
