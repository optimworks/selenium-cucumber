package com.trello.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.trello.base.BaseClass;
import com.trello.locators.LogOutPageLocators;
import com.trello.utilities.GlobalVariables;

public class LogOutPage extends BaseClass{
	boolean bStatus;
	WebDriver driver;
	public LogOutPage(WebDriver driver) {
		this.driver = driver;
	}
	

public void verifyLogOutPageDisplayed() {
	bStatus = waitForElementVisibility(driver,LogOutPageLocators.lblAtlassionaccount, GlobalVariables.mediumwait);
	Assert.assertTrue(bStatus, "Trello logOut page is not displayed");
}

public void clickOnLogOut() {
	waitForElementVisibility(driver,LogOutPageLocators.btnLogOut, GlobalVariables.shortwait);
	waitForElementClickable(driver,LogOutPageLocators.btnLogOut, GlobalVariables.shortwait);
	click(driver,LogOutPageLocators.btnLogOut);
}

}
