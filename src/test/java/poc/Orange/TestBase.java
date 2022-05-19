package poc.Orange;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.*;
import java.net.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;

import org.openqa.selenium.remote.Augmenter;

import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.remote.http.Route;

public class TestBase {
	protected WebDriver driver;

	@Before
	public void inicio() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("browserVersion", "92.0");
		//chromeOptions.setCapability("platformName", "Windows XP");
		WebDriver driver = new RemoteWebDriver(new URL("http://172.16.111.20:31057/wd/hub"), chromeOptions);
		driver.get("https://www.orange.es/");
		driver.quit();
	}

	@After
	public void fin() {
		Utils.sleep(2);
		this.driver.close();
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

}
