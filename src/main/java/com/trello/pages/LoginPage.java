package com.trello.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.trello.base.BaseClass;
import com.trello.locators.LoginPageLocators;
import com.trello.utilities.GlobalVariables;

public class LoginPage  {
	WebElement wbElement;
	WebDriver driver;
	boolean bStatus;
	BaseClass base = new BaseClass();
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void verifyTrelloLoginPageDisplayed() {
		bStatus = base.waitForElementVisibility(driver,LoginPageLocators.lblTrello, GlobalVariables.mediumwait);
		//wbElement = driver.findElement(LoginPageLocators.lblTrello);
		Assert.assertTrue(bStatus, "Trello login page is not displayed");
	}
	
	public void enterEmail(String sEmail) {
		base.waitForElementVisibility(driver,LoginPageLocators.txtEmail, GlobalVariables.mediumwait);
		base.sendKeys(driver,LoginPageLocators.txtEmail, sEmail);
	}
	
	public void clickOnContinue() {
		base.waitForElementVisibility(driver,LoginPageLocators.btnContinue, GlobalVariables.mediumwait);
		base.waitForElementClickable(driver,LoginPageLocators.btnContinue, GlobalVariables.mediumwait);
		base.click(driver,LoginPageLocators.btnContinue);
	}
	
	public void enterPassword(String sPassword) {
		base.waitForElementVisibility(driver,LoginPageLocators.txtPassword, GlobalVariables.mediumwait);
		base.sendKeys(driver,LoginPageLocators.txtPassword, sPassword);
	}
	
	public void clickOnLogin() {
		base.waitForElementVisibility(driver,LoginPageLocators.btnLogin, GlobalVariables.mediumwait);
		base.waitForElementClickable(driver,LoginPageLocators.btnLogin, GlobalVariables.mediumwait);
		base.click(driver,LoginPageLocators.btnLogin);
	}
	
	
	
}
