package com.rmg.create;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProjectAndValidateWithDatabase {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		//to fetch the data from property file
		FileInputStream fs = new FileInputStream("./src/test/resources/rmgresources.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		String BROWSER = prop.getProperty("chrome");
		String MYSQLUSERNAME = prop.getProperty("mysqlusername");
		String MYSQLPASSWORD = prop.getProperty("mysqlpassword");
		
		//get the url of the application
		driver.get(URL);
		//fill user name tesxfield
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		//fill the password textfield
		driver.findElement(By.name("password")).sendKeys("rmgy@9999");
		//click on submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//find and click on the project
		driver.findElement(By.linkText("Projects")).click();
		
		
		
		//get the url of the application
		
		
	    
	}

}
