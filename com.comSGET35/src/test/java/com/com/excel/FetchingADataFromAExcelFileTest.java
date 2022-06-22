package com.com.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtalities.ExcelUtility;

public class FetchingADataFromAExcelFileTest {
	public static void main(String[] args) throws Throwable {
		ExcelUtility xLib = new ExcelUtility();
		//FileInputStream fin = new FileInputStream("./src/test/resources/Excel1.xlsx");
		//Workbook workbook = WorkbookFactory.create(fin);
		//Sheet sheet = workbook.getSheet("sheet1");
		//Row row = sheet.getRow(0);
		//Cell cell = row.getCell(0);
	    //String name = cell.toString();
		//System.out.println(name);
		String FirstName = xLib.readDataFromExcel("Sheet1", 1, 2);
		System.out.println(FirstName);
	}
	
}

