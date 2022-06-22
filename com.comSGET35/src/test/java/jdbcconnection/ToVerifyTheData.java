package jdbcconnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToVerifyTheData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("http://localhost:8084");
      driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
      driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Projects")).click();
      driver.findElement(By.xpath("//span[text() = 'Create Project']")).click();
      
      Thread.sleep(2000);
      driver.quit();
      
      
      
     
      
     
      
      
     
	}

}
