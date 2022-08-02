package autoapp.automation.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static BrowserDriver driver;

	@Before
	public void setUp() {
	// String browserName = "chrome";//browser name hardcoded , should be retrieved from property file
		driver = new BrowserDriver(driver);
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
