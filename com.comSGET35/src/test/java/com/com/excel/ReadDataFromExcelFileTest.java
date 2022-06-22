package com.com.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFileTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fin = new FileInputStream("./src/test/resources/Excel1.xlsx");
		Workbook workbook = WorkbookFactory.create(fin);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(4);
		cell.setCellValue("avinash");
		FileOutputStream fout = new FileOutputStream("./src/test/resources/Excel1.xlsx");
		workbook.write(fout);
		
	}
}
