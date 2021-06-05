package pageUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.Baseclass;

public class utility extends Baseclass{
	public static WebDriverWait wait;

	// This function is used to wait till to visibility of the element
	public static void waitForVisibilityOf(WebElement element) {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	// This function is used clear and enter the text field
	public static void type(WebElement element, String strValue) {
		waitForVisibilityOf(element);
		element.clear();
		element.sendKeys(strValue);
	}

	// This function is used to mouse hover into element
		public static void mouseHoverToElement(WebElement element) {
			waitForVisibilityOf(element);
			waitForElementToBeClickable(element);
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();

		}
		
		// This function is used to wait for element to be click-able
		public static void waitForElementToBeClickable(WebElement element) {
			wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
}
