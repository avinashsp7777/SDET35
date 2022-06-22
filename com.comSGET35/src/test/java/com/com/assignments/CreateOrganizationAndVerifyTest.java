package com.com.assignments;

import org.testng.annotations.Test;

import com.crm.objectRepository.CreateNewOrganizationPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.OrganizationInfoPage;
import com.crm.objectRepository.OrganizationPage;

import genericUtalities.BaseClass;


public class CreateOrganizationAndVerifyTest extends BaseClass{

	@Test
	public void CreateOrganizationTest() throws Throwable  {
		
        //WebDriver driver = null;
        //WebDriverManager.chromedriver().setup();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//create objects
//	    JavaUtility jLib = new JavaUtility();
//		ExcelUtility eXib = new ExcelUtility();
//		FileUtality fLib = new FileUtality();
//		WebDriverUtility wLib = new WebDriverUtility();
//	
//		//read commondata
//		String URL = fLib.getProertyKeyValue("url");
//		String USERNAME = fLib.getProertyKeyValue("username");
//	    String PASSWORD = fLib.getProertyKeyValue("password");
//		String BROWSER = fLib.getProertyKeyValue("browser");
		
		//to get random number
		int randNum = jLib.getRandomNumber();
		
		//Read data from excel sheet
		String orgName = eLib.readDataFromExcel("Sheet1", 3, 3)+randNum;
		
		//launch the browser
//		if(BROWSER.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}else if (BROWSER.equals("chrome")) {
//			driver= new ChromeDriver();
//		}else if(BROWSER.equals("ie")) {
//			driver= new InternetExplorerDriver();
//		}else {
//			driver=new ChromeDriver();
//		}
//		
//		driver.get(URL);
//		
//		LoginPage loginpage = new LoginPage(driver);
//	    loginpage.loginToApplicati(USERNAME, PASSWORD);
		//driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("username"));
		//driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.id("submitButton")).submit();
		
	    //click on organization link
	    HomePage homepage = new HomePage(driver);
	    homepage.getOrganizationLnk().click();
	    
	    //click on create organization
	    OrganizationPage orgPage = new OrganizationPage(driver);
	    orgPage.clickOnCreateOrgLkp();
	   
	   //enter the organization name and click on create organization
	    OrganizationInfoPage orgInfo = new OrganizationInfoPage(driver);
	    //orgInfo.getOgnHeaderTxt();
	    
	   //create new organization page
	   CreateNewOrganizationPage newOrgPage = new CreateNewOrganizationPage(driver);
	   newOrgPage.enterOrgInfo(orgName);
	   newOrgPage.clickOnSaveBtn();
	  //click on save button
	  
		
//	    driver.findElement(By.linkText("Organizations")).click();
//		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
//		//String orginization = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
//		driver.findElement(By.name("accountname")).sendKeys(orgName);
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		//Thread.sleep(2000);
	//String orgName1 = driver.findElement(By.id("dtlview_Organization Name")).getText();
	 String presentOrgName =orgInfo.getOgnHeaderTxt().getText();
		
	if(presentOrgName.equals(orgName)) {
	System.out.println("Organization is created");
	}else {
		System.out.println("Organization is not created");
	}
		
		//fprop.close();
		//fxl.close();
		//driver.quit();
	}
}

