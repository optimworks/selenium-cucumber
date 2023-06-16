package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility extends BaseClass{
	public static WebDriverWait wait;

	public static void waitForElementsToLoadInDOM(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void visibilityOfElementLocated(WebDriver driver, By element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20000));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By)element));
	}

	public static void waitForElementToBeClickable(WebDriver driver, By element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void click(WebDriver driver, By element) {
		waitForElementToBeClickable(driver, element);
		driver.findElement(element).click();
	}
	
	public static void sendKeys(WebDriver driver, By element, String text) {
		visibilityOfElementLocated(driver, element);	
		driver.findElement(element).sendKeys(text);
	}
	
	
	
	
	
}
