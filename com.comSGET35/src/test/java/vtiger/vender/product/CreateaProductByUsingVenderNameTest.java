package vtiger.vender.product;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateaProductByUsingVenderNameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Random refVar = new Random();
		int ranNum = refVar.nextInt(10);
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		WebElement element1 = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/menuDnArrow.gif\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(element1).perform();
		driver.findElement(By.name("Vendors")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Vendor...\"]")).click();
		driver.findElement(By.name("vendorname")).sendKeys("redmi");
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		String element2 = driver.findElement(By.xpath("//span[@class=\"lvtHeaderText\"]")).getText();
		if(element2.contains("redmi")) 
			System.out.println("vendor is created");
		else System.out.println("vendor is not created");
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();
		driver.findElement(By.name("productname")).sendKeys("Note 5"+ranNum);
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();
		Set<String> element3 = driver.getWindowHandles();
		for (String ele : element3) {
			driver.switchTo().window(ele);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM")) 
				break;
			
		Thread.sleep(2000);
		driver.findElement(By.name("search_text")).sendKeys("redmi");
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[.='redmi']")).click();
		}
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		String productName = driver.findElement(By.id("dtlview_Product Name")).getText();
		
		Set<String> element4 = driver.getWindowHandles();
		for (String ele : element4) {
			driver.switchTo().window(ele);
			if(productName.contains("Note 5")) 
				System.out.println("product is created");
			else System.out.println("prodict is not created");
			driver.close();
		}
		WebElement AdminButton = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		action.moveToElement(AdminButton).perform();
		WebElement signOutButton = driver.findElement(By.xpath("//a[text() = 'Sign Out']"));
		action.moveToElement(signOutButton).click();
		
		driver.quit();
	}

}
