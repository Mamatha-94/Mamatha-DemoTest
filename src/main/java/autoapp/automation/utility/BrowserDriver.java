package autoapp.automation.utility;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver implements WebDriver {
	public static WebDriver driver;
	ConfigFileReader props = new ConfigFileReader();

	public BrowserDriver(WebDriver driver) {
		String browserName = props.readProperty("browser");
		System.out.println("driver " + browserName + "");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
			this.driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
			this.driver = new FirefoxDriver();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BrowserDriver.driver = driver;
	}

	public void close() {
		this.driver.close();
	}

	public WebElement findElement(By arg0) {
		return this.driver.findElement(arg0);
	}

	public List<WebElement> findElements(By arg0) {
		return this.driver.findElements(arg0);
	}

	public void get(String arg0) {
		this.driver.get(arg0);

	}

	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}

	public String getPageSource() {
		return this.driver.getPageSource();
	}

	public String getTitle() {
		return this.driver.getTitle();
	}

	public String getWindowHandle() {
		return this.driver.getWindowHandle();
	}

	public Set<String> getWindowHandles() {
		return this.driver.getWindowHandles();
	}

	public Options manage() {
		return this.driver.manage();
	}

	public Navigation navigate() {
		return this.driver.navigate();
	}

	public void quit() {
		this.driver.quit();
	}

	public TargetLocator switchTo() {
		return this.driver.switchTo();
	}
}