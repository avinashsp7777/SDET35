package com.crm.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class o1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	     //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.name("productname")).sendKeys("admin");
		WebElement dropdown = driver.findElement(By.name("productcategory"));
		Select select = new Select(dropdown);
		select.selectByValue("Hardware");
		WebElement dropdown1 = driver.findElement(By.name("manufacturer"));
		Select select1=new Select(dropdown1);
		select1.selectByValue("LexPon Inc.");
		driver.findElement(By.xpath("//input[@name=\"assigntype\" and @value = 'T']"));
		driver.findElement(By.id("my_file_element")).sendKeys("C:\\Users\\User\\Downloads\\New Doc 2021-08-30 19.23.15_1.jpg");
	//	Select select2 = new Select(dropdown2);
//		select.selectByIndex(3);
//		driver.findElement(By.className("crmbutton small save")).click();
		Thread.sleep(10000);
		driver.quit();
	}

}
