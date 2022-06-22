package genericUtalities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author avinash s p
 *
 */
public class ExcelUtility {

	public FileInputStream fs;
	/**
	 * 
	 *@return
	 */

	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
		fs = new FileInputStream("./src/test/resources/Excel2.xlsx");
		Workbook workbook = WorkbookFactory.create(fs);
		Sheet sheet = workbook.getSheet(sheetName);
	    Row row = sheet.getRow(rowNum);
	    Cell cell = row.getCell(cellNum);
	    String data = cell.toString();
	    return data;
	}
	/**
	 * its used to write data into excel file
	 * @param sheetName
	 * @return
	 * @throws Throwable 
	 */
	public void writeDataInToExcel(String sheetName,int rowNum,int cellNum,String data) throws Throwable {
		fs = new FileInputStream("./src/test/resources/Excel2.xlsx");
		Workbook workbook = WorkbookFactory.create(fs);
		Sheet sheet = workbook.getSheet(sheetName);
		 Row row = sheet.getRow(rowNum);
		 Cell cell = row.createCell(cellNum);
		 cell.setCellValue(data);
		 FileOutputStream fout = new FileOutputStream("./src/test/resources/Excel2.xlsx");
		 workbook.write(fout);
		 fs.close();
		 fout.close();
	}
	
	public void closeExcel() throws Throwable {
		fs.close();
	}

}
