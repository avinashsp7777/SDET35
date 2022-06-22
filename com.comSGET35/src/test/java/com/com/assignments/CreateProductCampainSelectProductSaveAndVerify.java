package com.com.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductCampainSelectProductSaveAndVerify {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		FileInputStream fprop = new FileInputStream("./src/test/resources/Excel2.xlsx");
		Properties prop = new Properties();
		prop.load(fprop);
		
		FileInputStream fxl = new FileInputStream("./src/test/resources/Excel2.xlsx");
		Workbook workbook = WorkbookFactory.create(fxl);
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("submitButton")).submit();
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();
		String product = workbook.getSheet("Sheet1").getRow(7).getCell(2).getStringCellValue();
		driver.findElement(By.name("productname")).sendKeys(product);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		String prodName = driver.findElement(By.id("dtlview_Product Name")).getText();
		if(prodName.equals(product))
			System.out.println("product created successfully");
		else
			System.out.println("produt not created");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("More"))).click().perform();
		action.moveToElement(driver.findElement(By.name("Campaigns"))).click().perform();
		driver.findElement(By.xpath("//img[@title=\"Create Campaign...\"]")).click();
		String campaign = workbook.getSheet("Sheet1").getRow(9).getCell(2).getStringCellValue();
		driver.findElement(By.name("campaignname")).sendKeys(campaign);
		driver.findElement(By.xpath("//input[@name=\"product_name\"]/..//img[@title=\"Select\"]")).click();
		String parentWindowID = driver.getWindowHandle();
		Set<String> windowID = driver.getWindowHandles();
		for (String ele : windowID) {
			driver.switchTo().window(ele);
		}
		
		driver.findElement(By.linkText("Laptops")).click();
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		WebElement campName = driver.findElement(By.id("dtlview_Campaign Name"));
		wait.until(ExpectedConditions.visibilityOf(campName));
		String campaignName = campName.getText();
		
		if(campaign.equals(campaignName))
			System.out.println("campain created");
		else System.out.println("campain failed to create");
		
		action.moveToElement(driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"))).perform();
		action.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
		
		fprop.close();
		fxl.close();
		driver.quit();
		
	}
}


