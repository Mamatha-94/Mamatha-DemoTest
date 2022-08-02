package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import static org.junit.Assert.assertTrue;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BrowserDriver {

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public BasePage(BrowserDriver driver) {
		super(driver);
	}

	public static WebElement getWebElement(By xpathString) {

		WebElement we = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpathString));
			wait.until(ExpectedConditions.presenceOfElementLocated(xpathString));
			wait.until(ExpectedConditions.elementToBeClickable(xpathString));

			we = driver.findElement(xpathString);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return we;
	}

	public static void clickElement(By xpath) {

		WebElement we = getWebElement(xpath);
		try {
			we.click();
		} catch (ElementClickInterceptedException e) {

		}
	}

	public static void enterText(By xpathString, String textToEnter) {
		WebElement we = getWebElement(xpathString);
		try {
			we.sendKeys(textToEnter);
		} catch (ElementClickInterceptedException e) {

		}
	}

	public static void checkIfDisplayed(By xpath) {
		WebElement we = getWebElement(xpath);
		if (we.isDisplayed()) {
			System.out.println("The message is displayed");
			assertTrue("The message is displayed", we.isDisplayed());
		} else {
			System.out.println("The message is not displayed");
			assertTrue("The message is not displayed", we.isDisplayed());
		}
	}

	public static void mouseHover(By xpath) {
		WebElement we = getWebElement(xpath);
		Actions actions = new Actions(driver);
		actions.moveToElement(we).perform();
	}
}
