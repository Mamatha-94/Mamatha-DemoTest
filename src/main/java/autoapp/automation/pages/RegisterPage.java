package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import autoapp.automation.utility.ConfigFileReader;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

	public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";
	public static String email_id = "email_create";
	
	// public static String signIn_xpath = "//a[@title='Log in to your customer account']"; //not a relative xpath, chances of failure.

	public static By signIn_xpath = By.xpath("//a[normalize-space(text())='Sign in']");
	public static By emailidXpath = By.xpath("//p[contains(text(),'Please enter your email address')]/ancestor::div[1]//input[@type='text']");
	public static By createAccountButton = By.xpath("//span[contains(normalize-space(.), \"Create an account\")]/ancestor::button");
	public static By invalidEmailError = By.xpath("//li[text()='Invalid email address.']");
	public static By dresses_xpath = By.xpath("(//a[text()='Dresses'])[last()]");
	public static By summerDresses_Submenu = By.xpath("(//a[@title='Summer Dresses'])[2]");
	public static By summerDresses_Banner = By.xpath("//div[normalize-space(text())='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']");

	public static void clickSignIn(String msg) {
		if (msg.equalsIgnoreCase("Sign in")) {
			clickElement(signIn_xpath);
		} else if (msg.equalsIgnoreCase("Dresses")) {
			clickElement(dresses_xpath);
		}
	}

	public static void createAccount(String emailid) {
		enterText(emailidXpath, emailid);
	}

	public static void openApplicaiton(String applicationName) {
		String url = null;
		if (applicationName.equalsIgnoreCase("automation practice")) {
			url = ConfigFileReader.readProperty("automationPracticeUrl");
		} else {
			url = ConfigFileReader.readProperty("newApplicationURL");
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	public RegisterPage(BrowserDriver driver) {
		super(driver);
	}

	public static void createAccountButton() {
		clickElement(createAccountButton);
	}

	public static void validateErrorMessage(String msg) {
		checkIfDisplayed(invalidEmailError);
		String s = getWebElement(invalidEmailError).getText();
		if (s.contentEquals(msg)) {
			assertTrue("Text is Matched", true);
		} else {
			assertTrue("Text is Not Matched", false);
		}
	}

	public static void verifySummerDresssesLink() {
		mouseHover(summerDresses_Submenu);
		checkIfDisplayed(summerDresses_Submenu);
		clickElement(summerDresses_Submenu);
		checkIfDisplayed(summerDresses_Banner);
	}

	public static void mouseHoverToElement(String strLink) {
		if (strLink.equalsIgnoreCase("Dresses")) {
			mouseHover(dresses_xpath);
		} else if (strLink.equalsIgnoreCase("Women")) {
			mouseHover(null);
		}
	}
}
