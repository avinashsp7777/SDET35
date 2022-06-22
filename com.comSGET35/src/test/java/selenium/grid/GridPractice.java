package selenium.grid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridPractice {
@Test
public static void GridTest() throws MalformedURLException {
	URL url = new URL("http://localhost:4444/wd/hub");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver = new RemoteWebDriver(url, cap);
	driver.get("https://www.google.com");
	driver.quit();
	
}
}
