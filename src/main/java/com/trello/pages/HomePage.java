package com.trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.trello.base.BaseClass;
import com.trello.locators.HomePageLocators;
import com.trello.utilities.GlobalVariables;

public class HomePage {
	public WebElement wbElement;
	public WebDriver driver;
	boolean bStatus;
	BaseClass base = new BaseClass();
	
   public HomePage(WebDriver driver) {
	   this.driver = driver;
   }
		
	public void verifyHomePageDisplayed() throws InterruptedException {
		bStatus = base.waitForElementVisibility(driver,HomePageLocators.lblGetTrelloForFree, GlobalVariables.mediumwait);
		//wbElement = driver.findElement(HomePageLocators.lblGetTrelloForFree);
		Assert.assertTrue(bStatus, "Home page is not displayed");
	}
	
	public void clickOnLogin() throws InterruptedException {
		base.waitForElementVisibility(driver,HomePageLocators.btnLogin, GlobalVariables.mediumwait);
		base.waitForElementClickable(driver,HomePageLocators.btnLogin, GlobalVariables.mediumwait);
		base.click(driver,HomePageLocators.btnLogin);
	}
}
