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

import com.crm.objectRepository.CreateNewOrganizationPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.OrganizationInfoPage;
import com.crm.objectRepository.OrganizationPage;

import genericUtalities.BaseClass;
import genericUtalities.ExcelUtility;
import genericUtalities.FileUtality;
import genericUtalities.JavaUtility;
import genericUtalities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationWithIndustryAndVerify extends BaseClass {
@Test
	public void CreateOrganizationWithIndustriesTest() throws Throwable {
		// TODO Auto-generated method stub
		//WebDriver driver=null;
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		JavaUtility jLib = new JavaUtility();
//		FileUtality fLib = new FileUtality();
//		ExcelUtility eLib = new ExcelUtility();
//	    WebDriverUtility wLib = new WebDriverUtility();
//	    
	    //Fetching data from property file
		//FileInputStream fprop = new FileInputStream("./src/test/resources/resources.properties");
		//Properties prop = new Properties();
		//prop.load(fprop);
	 
	    //Fetching data from property file
//		String URL = fLib.getProertyKeyValue("url");
//		String USERNAME = fLib.getProertyKeyValue("password");
//		String PASSWORD = fLib.getProertyKeyValue("password");
//		String BROWSER= fLib.getProertyKeyValue("browser");
		
        //To get random number
		int randNum = jLib.getRandomNumber();
		
		//fetching data from excelSheet
		String orgName = eLib.readDataFromExcel("Sheet1", 3, 3)+randNum;
		String industryName = eLib.readDataFromExcel("Sheet1", 2, 3);
		String typeName = eLib.readDataFromExcel("Sheet1", 2, 2);
		
		//FileInputStream fxl = new FileInputStream("./src/test/resources/Excel2.xlsx");
		//Workbook workbook = WorkbookFactory.create(fxl);
//		if(BROWSER.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}else if(BROWSER.equals("chrome")) {
//			driver= new ChromeDriver();
//		}else if(BROWSER.equals("ie")) {
//		driver=new InternetExplorerDriver();
//		}else {
//			driver= new ChromeDriver();
//		}
		
		//Login to application
		//driver.get(URL);
		
		//enter the user name and password and click on submit button
		//LoginPage lpage = new LoginPage(driver);
		//lpage.loginToApplicati(USERNAME, PASSWORD);
		
		//click on the organization link
		HomePage homepage = new HomePage(driver);
		homepage.getOrganizationLnk().click();
		
		//click on create organization icon
		OrganizationPage opage = new OrganizationPage(driver);
		opage.clickOnCreateOrgLkp();
		
		//enter the organization name with industry and type
		CreateNewOrganizationPage cpage = new CreateNewOrganizationPage(driver);
		cpage.enterOrgInfo(orgName);
		cpage.selectIndustry(industryName);
		cpage.selectType(typeName);
		
		
		//driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("username"));
		//driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.id("submitButton")).submit();
		
		//driver.findElement(By.linkText("Organizations")).click();
		//driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		//String orginization = workbook.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		//driver.findElement(By.name("accountname")).sendKeys(orginization);
		
		//WebElement industryDrop = driver.findElement(By.name("industry"));
		//Select indDropDown = new Select(industryDrop);
		//String industry = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		//indDropDown.selectByValue(industry);
		
		//driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		//Thread.sleep(2000);
		//String orgName1 = driver.findElement(By.id("dtlview_Organization Name")).getText();
		//String indust = driver.findElement(By.id("dtlview_Industry")).getText();
		
		// verify whether the organization is created or not
		OrganizationInfoPage oginfo= new OrganizationInfoPage(driver);
		String presentOrgName = oginfo.getOgnHeaderTxt().getText();
		if(presentOrgName.contains(orgName)) {
			
			System.out.println("orginization with industary and type is created");
		}else {
			System.out.println("orginization is not created");
		}
		
		//mouse over o administrator link and click on signout link
		//hpage.logout(driver);
		
		//fprop.close();
		//fxl.close();
		driver.quit();
	}
}

	


