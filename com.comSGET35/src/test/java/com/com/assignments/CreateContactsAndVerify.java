package com.com.assignments;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.objectRepository.ContactInfoPage;
import com.crm.objectRepository.ContactsPage;
import com.crm.objectRepository.CreateNewContactPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;

import genericUtalities.BaseClass;
import genericUtalities.ExcelUtility;
import genericUtalities.FileUtality;
import genericUtalities.JavaUtility;
import genericUtalities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactsAndVerify extends BaseClass{
@Test
	public void CreateContactTest() throws Throwable {
		// TODO Auto-generated method stub
		//WebDriver driver=null;
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//read common data
//	    JavaUtility jLeb = new JavaUtility();
//	    ExcelUtility eLib = new ExcelUtility();
//	    FileUtality flib = new FileUtality();
//	    WebDriverUtility wLeb = new WebDriverUtility();
	    
	    //to get random number
	    int randNum = jLib.getRandomNumber();
	    
	    //read common data
//	    String URL = flib.getProertyKeyValue("url");
//		String USERNAME = flib.getProertyKeyValue("password");
//		String PASSWORD = flib.getProertyKeyValue("password");
//		String BROWSER= flib.getProertyKeyValue("browser");
		
		//Fetching the data from excel sheet
		String firstname = eLib.readDataFromExcel("Sheet1", 1, 2)+randNum;
		
		String lastname = eLib.readDataFromExcel("Sheet1", 2, 2 )+randNum;
		
		//launch the browser
//		if(BROWSER.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}else if(BROWSER.equals("chrome")) {
//		driver=new ChromeDriver();
//		}else if(BROWSER.equals("chrome")) {
//			driver = new InternetExplorerDriver();
//		}else {
//			driver =new ChromeDriver();
//		}
//		
		//login to app
		//driver.get(URL);
		
		//enter the username password and click on submit button
		//LoginPage lpage = new LoginPage(driver);
		//lpage.loginToApplicati(USERNAME, PASSWORD);
		
		//click on contacts link
		HomePage hpage = new HomePage(driver);
		hpage.getContactLnk().click();
		
		//click on create contact icon
		ContactsPage cpage = new ContactsPage(driver);
		cpage.clickOnCreateContLkp();
	
		//
		//ContactInfoPage conInfo = new ContactInfoPage(driver);
		//conInfo.getcontactHeaderTxt();
		
		
		
		
		
		
		//driver.findElement(By.linkText("Contacts")).click();
		//driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		//WebElement genderDropDown = driver.findElement(By.name("salutationtype"));
		//Select gender = new Select(genderDropDown);
		//gender.selectByValue("Mr.");
		//String firstName = workbook.getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
		//String lastName = workbook.getSheet("Sheet1").getRow(5).getCell(3).getStringCellValue();
//		driver.findElement(By.name("firstname")).sendKeys("ajith");
//		driver.findElement(By.name("lastname")).sendKeys("vijay");
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		 
//	    String firstName = driver.findElement(By.id("dtlview_First Name")).getText();
//	    String lastName = driver.findElement(By.id("dtlview_Last Name")).getText();
//		Thread.sleep(2000);
	//    String firstVerify = driver.findElement(By.id("dtlview_First Name")).getText();
      
		//enter the first name, last name and click on save button
		//String lastVerify = driver.findElement(By.id("dtlview_Last Name")).getText();
		
		////enter the first name, last name and click on save button
		CreateNewContactPage newContactPage = new CreateNewContactPage(driver);
		newContactPage.createAContact(firstname, lastname);
		
		
	
		ContactInfoPage conInfo = new ContactInfoPage(driver);
		String presentContactName = conInfo.getcontactHeaderTxt().getText();
		
		if(firstname.equals(presentContactName))
			System.out.println("contact is created");
		else System.out.println("contact is not created");
		
//		if(lastname.equals(lastVerify)) 	
//			System.out.println("Lastname pass");
//		else								
//			System.out.println("lastname fail");
//		
		//fprop.close();
		//fxl.close();
		//driver.quit();
	}
}

	