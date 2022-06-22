package genericUtalities;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * 
 * @author Avinash S P
 *
 */
public class WebDriverUtility {
	/**
	 * it will wait for 10 seconds till the page gets load.
	 * @param driver
	 */
public void waitForPageToLoad(WebDriver driver) 
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
/**
 * it will wait for is elements
 * @param driver
 */
public void waitforPageToLoadForJSElement(WebDriver driver) 
{
	driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
}
/**
 * it will check for the element in the GUI for polling time of 500ms
 * @param driver
 * @param element
 */
public void waitForElementToBeClickable(WebDriver driver,WebElement element) 
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * it will check for the element in the GUI for polling time of 500ms
 * @param driver
 * @param title
 */
public void waitForTitleContains(WebDriver driver, String title) 
{
WebDriverWait wait = new WebDriverWait(driver,10); 
wait.until(ExpectedConditions.titleContains(title));
}
/**
 * here we are giving custom timeout
 * @param driver
 * @param pollingTime
 * @param element
 */
public void waitForElementToCustom(WebDriver driver, int pollingTime,WebElement element) 
{
FluentWait	wait=new FluentWait(driver);
wait.pollingEvery(pollingTime,TimeUnit.SECONDS);
wait.ignoring(Exception.class);
wait.until(ExpectedConditions.elementToBeClickable(element));
}
 /**
  * here we r giving custom timeout
  * @param element
  * @throws IntruptedException
  */
public void waitAndClick(WebElement element) throws InterruptedException
{
	int count=0;
	while(count<10)
	{
		try {
			element.click();
		} catch (Exception e) {
			count++;
		}
	}
	}
	/**
	 * used to switch from one window to another window
	 * @param driver
	 * @param partialWindow
	 */
	public void switchToWindow(WebDriver driver,String partialWindow)
	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String wTle = it.next();
			driver.switchTo().window(wTle);
		String currentWindow = driver.getTitle();
		if(currentWindow.contains(partialWindow))
		{
			break;
		}
		}
		
	}
	/**
	 * switch from one frame to another frame by using index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * switch from one frame to another frame by using id-attribute
	 * @param driver
	 * @param id_attribute
	 */
	public void switchToFrame(WebDriver driver,String id_attribute)
	{
		driver.switchTo().frame(id_attribute);
	}
	/** switch from one frame to another frame by using absolute_path
	 * @param driver
	 * @param element
	 */
	public void switchtoFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * its used to switch back from one child frame to parent frame
	 * @param driver
	 */
	public void switchBackToMainPage(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
		/**
		 * its used to Switch to alert pop up and accept
		 * @param driver
		 */
	 public void switchToAlertPopupAndaccept(WebDriver driver)
	 {
		 driver.switchTo().alert().accept();
	 }
		 /**
		  * it is used to switch to alert pop up and dismiss
		  * @param driver
		  */
	 public void switchToAlertAndDismiss(WebDriver driver)
	 {
		 driver.switchTo().alert().dismiss();
	 }
	 /**
	  * it is used to switch to select dropdown by using index
	  * @param element
	  * @param index
	  */
	 public void selectDropDown(WebElement element, int index) 
	 {
	 Select select = new Select(element);
	 select.selectByIndex(index);
	 }
	 /**
	  * it is used to switch to select drop down by using value
	  * @param element
	  * @param value
	  */
	 public void selectDropDown(WebElement element,String value)
	 {
		 Select select = new Select(element);
		 select.selectByValue(value);
     }
	 /**
	  *it is used to switch to select drop down by using visible_text
	  *@param element
	  *@param visible_text
	  */
	 public void selectDropDownByVtext(WebElement element,String visible_text)
	 {
		 Select select = new Select(element);
		 select.selectByVisibleText(visible_text);
	 }
	 /**
	  * it is used to mouse over on element
	  * @param driver
	  * @param element
	  */
	 public void mouseOverAnElement(WebDriver driver,WebElement element)
	 {
		 Actions action = new Actions(driver);
	  action.moveToElement(element).perform();
	 }
  /**
   * it is used to right click on element
   * @param driver
   * @param element
   */
	 public void rightClickOnElement(WebDriver driver,WebElement element)
	 {
		 Actions action = new Actions(driver);
		 action.contextClick(element).perform();
		  }
	 /**
	  * it is used to click on the enter button using Keyboard actions
	  * @param driver
	  */
	 public void clickOnEnterButton(WebDriver driver)
	 {
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.ENTER).perform();
		 }
	  /**
	   * it is used to take screenshot
	   * @param driver
	   * @param screenShotName
	   *@throws Throwable 
	   */
	 public void takeScreenshot(WebDriver driver,String screenShotName) throws Throwable  {
		TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
		File src = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\ScreenShot\\"+screenShotName+".PNG");
		Files.copy(src, dst);
	 }
	   /**
	    * it is used to perform scrollBar action
	    * @param driver
	    */
	 public void scrollBarAction(WebDriver driver)
	 {
		JavascriptExecutor javaScript = (JavascriptExecutor)driver;
		javaScript.executeScript("window.scrollBy(0,500)");
	 }
	 
	 }
	   
