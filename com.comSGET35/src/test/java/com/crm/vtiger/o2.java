package com.crm.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class o2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Documents")).click();
		WebElement dropdown = driver.findElement(By.id("qccombo"));
        Select select = new Select(dropdown);
        select.selectByValue("Documents");
        driver.findElement(By.name("notes_title")).sendKeys("Avengers");
        driver.findElement(By.name("assigntype")).click();
	}

}
