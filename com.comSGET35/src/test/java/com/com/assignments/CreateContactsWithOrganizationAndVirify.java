package com.com.assignments;

import java.io.FileInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.objectRepository.ContactInfoPage;
import com.crm.objectRepository.ContactsPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.OrganizationInfoPage;
import com.crm.objectRepository.OrganizationPage;

import genericUtalities.ExcelUtility;
import genericUtalities.FileUtality;
import genericUtalities.JavaUtility;
import genericUtalities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactsWithOrganizationAndVirify {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//create object
		JavaUtility jLib = new JavaUtility();
		ExcelUtility eLib = new ExcelUtility();
		FileUtality fLib = new FileUtality();
		WebDriverUtility wLeb = new WebDriverUtility();
		    
		//Fetching data from property file
	    String URL = fLib.getProertyKeyValue("url");
		String USERNAME = fLib.getProertyKeyValue("password");
		String PASSWORD = fLib.getProertyKeyValue("password");
		String BROWSER= fLib.getProertyKeyValue("browser");
		
		//to get random number
	    int randNum = jLib.getRandomNumber();
		
		//fetching data from excelSheet
	    String orgName = eLib.readDataFromExcel("Sheet1", 3, 3)+randNum;
	    
	    //launching the browser
	    if(BROWSER.equals("firefox")) {
	    	driver= new FirefoxDriver();
	    }else if(BROWSER.equals("chrome")) {
	    	driver= new ChromeDriver();
	    }else if(BROWSER.equals("ie")) {
	    	driver= new InternetExplorerDriver();
	    } else {
	    driver=new ChromeDriver();
	    }
	    //get url
		driver.get(URL);
		
		//enter username and passwor and click on login page
		 LoginPage loginpage = new LoginPage(driver);
		 loginpage.loginToApplicati(USERNAME, PASSWORD);
		 
		//click on organization link
	    HomePage homepage = new HomePage(driver);
	    homepage.getOrganizationLnk().click();
	    
	    //click on create organization
	    OrganizationPage orgPage = new OrganizationPage(driver);
	    orgPage.clickOnCreateOrgLkp();
	   
	   //enter the organization name and click on create organization
	    OrganizationInfoPage orgInfo = new OrganizationInfoPage(driver);
	    orgInfo.getOgnHeaderTxt();
		
	    //driver.findElement(By.linkText("Organizations")).click();
		//driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		//String orginization = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		Thread.sleep(2000);
		//driver.get("http://localhost:8888");
		//enter the username in username text field
		//driver.findElement(By.name("user_name")).sendKeys("admin");
		//enter the password in password text field
		//driver.findElement(By.name("user_password")).sendKeys("admin");
		//driver.findElement(By.id("submitButton")).submit();
		//driver.findElement(By.linkText("Organizations")).click();
		//driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		//driver.findElement(By.name("accountname")).sendKeys("TYY");
		//driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		String orgName1 = driver.findElement(By.id("dtlview_Organization Name")).getText();
		if(orgName.equals(orgName1))
			System.out.println("Organization is created");
		else System.out.println("Organization is not created");
		
		//click on create contact icon
		ContactsPage cpage = new ContactsPage(driver);
		cpage.getCreatecontLkpUpImg().click();
		
		ContactInfoPage conInfo = new ContactInfoPage(driver);
		conInfo.getcontactHeaderTxt();
		
		
	    //fetching the lastNum from excelsheet
	    String contact = eLib.readDataFromExcel("Sheet1", 3, 3)+randNum;
				
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rina");
		driver.findElement(By.name("lastname")).sendKeys("Dhoni");
		//driver.findElement(By.xpath("//input[@accesskey=\\\"S\\\"]")).click();
		String parentWid = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name=\"account_id\"]/..//img[@title='Select']")).click();
		
		Set<String> childWid = driver.getWindowHandles();
		
		for (String ele : childWid) {
			driver.switchTo().window(ele);
		}
		
		//driver.findElement(By.linkText(organization)).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentWid);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		String firstName = driver.findElement(By.id("dtlview_First Name")).getText();
		
		if(firstName.equals("Rina"))
			System.out.println("Contacts created");
		else 
			System.out.println("contacts not created");
		driver.quit();
	}
	}



