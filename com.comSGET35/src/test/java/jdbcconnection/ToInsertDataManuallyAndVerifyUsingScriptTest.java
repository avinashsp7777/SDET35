package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToInsertDataManuallyAndVerifyUsingScriptTest {

	public static void main(String[] args) throws SQLException, Throwable {
		// TODO Auto-
		//initiating the browser specific class
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8084");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text() = 'Sign in']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[text() = 'Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys("promax"); 
		String projectName = "promax";
		driver.findElement(By.name("createdBy")).sendKeys("David");
		WebElement projectStatusDropDown = driver.findElement(By.xpath("//label[text() = 'Project Status ']/..//select[@name=\"status\"]"));
		Select select= new Select(projectStatusDropDown);
		select.selectByValue("Created");
		driver.findElement(By.xpath("//input[@value=\"Add Project\"]")).click();
		
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		String query= "select * from project";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		ResultSet resultofsql = statement.executeQuery(query);
		while(result.next()) {
			String actualProject = result.getString(4);
			if(projectName.contains(actualProject)) {
				System.out.println("true");
			}
			else System.out.println("false");
		}
		connection.close();
		driver.quit();

	}

}
