package com.trello.base;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    public static Properties prop;
    public  WebDriver driver;
    public  static WebDriverWait wait;
    public  static WebElement wbElement;
    public  static String screenshotPath;
	public  static String screenshotName;
   
    public  void loadConfig() {
    	try {
    	prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\config.properties");
		prop.load(ip);
    } catch (FileNotFoundException e) {
    	e.printStackTrace();
    } catch (IOException e) {
    	e.printStackTrace();
    }
    }  
    
    public WebDriver launchApp() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		return driver;		
}

    public  boolean waitForElementVisibility(WebDriver driver,By objLocator, int iTimeOut)  {	
    	try {
	      wait = new WebDriverWait(driver, Duration.ofSeconds(iTimeOut));
	      wait.until(ExpectedConditions.presenceOfElementLocated(objLocator));
	      wait.until(ExpectedConditions.visibilityOfElementLocated(objLocator));
	      return true;
    	}catch(Exception e) {
    		e.printStackTrace();
    		return false;	
    	}
		
    }
		
	public void click(WebDriver driver,By objLocator) {
		wbElement = driver.findElement(objLocator);
		wbElement.click();
	}
	
	public void sendKeys(WebDriver driver,By objLocator, String sValue) {
		wbElement = driver.findElement(objLocator);
		wbElement.sendKeys(sValue);
	}
	
	public void waitForElementClickable(WebDriver driver,By objLocator, int iTimeOut) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(iTimeOut));
		wait.until(ExpectedConditions.presenceOfElementLocated(objLocator));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(objLocator));
	    wait.until(ExpectedConditions.elementToBeClickable(objLocator));
	}
	/*
	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));

	}
	*/
	
	public static boolean verifyElementDisplayed(WebElement objLocator) {
		try {
			objLocator.isDisplayed();
			return true;
		}catch(Exception e) {
		return false;
		}
	}
	
	public  boolean verifyElementDisplayed(By objLocator) {
		try {
			driver.findElement(objLocator).isDisplayed();
			return true;
		}catch(Exception e) {
		return false;
		}
	}

}
