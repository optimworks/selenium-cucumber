package com.trello.pages;


import com.trello.base.BaseClass;
import com.trello.locators.BoardPageLocators;
import com.trello.locators.CreatedBoardPageLocators;
import com.trello.utilities.GlobalVariables;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BoardsPage {
	BaseClass base = new BaseClass();
	WebElement wbElement;
	boolean bStatus;
	WebDriver driver;
	public BoardsPage(WebDriver driver) {
		this.driver = driver;
	}
	
public void verifyBoardPageDisplayed() throws InterruptedException {
	Thread.sleep(5000);
	bStatus = base.waitForElementVisibility(driver,BoardPageLocators.btnBackToHome, GlobalVariables.mediumwait);
	//wbElement = driver.findElement(BoardPageLocators.btnTemplates);
	Assert.assertTrue(bStatus, "Boards page is not displayed");
}

public void clickOnCreateNewBoard() {
	base.waitForElementVisibility(driver,BoardPageLocators.btnCreateNewBoard, GlobalVariables.shortwait);
	base.waitForElementClickable(driver,BoardPageLocators.btnCreateNewBoard, GlobalVariables.shortwait);
	base.click(driver,BoardPageLocators.btnCreateNewBoard);
}

public void enterBoardName(String sBoardName) {
	base.waitForElementVisibility(driver,BoardPageLocators.txtBoardTitle, GlobalVariables.shortwait);
	base.sendKeys(driver,BoardPageLocators.txtBoardTitle, sBoardName);
	}

public void clickOnCreate() {
	base.waitForElementVisibility(driver,BoardPageLocators.btnCreate, GlobalVariables.shortwait);
	base.waitForElementClickable(driver,BoardPageLocators.btnCreate, GlobalVariables.shortwait);
	base.click(driver,BoardPageLocators.btnCreate);
}

public void clickOnAccout() {
	base.waitForElementVisibility(driver,BoardPageLocators.btnAccount, GlobalVariables.shortwait);
	base.waitForElementClickable(driver,BoardPageLocators.btnAccount, GlobalVariables.shortwait);
	base.click(driver,BoardPageLocators.btnAccount);
}

public void clickOnLogout() {
	base.waitForElementVisibility(driver,BoardPageLocators.btnLogout, GlobalVariables.shortwait);
	base.waitForElementClickable(driver,BoardPageLocators.btnLogout, GlobalVariables.shortwait);
	base.click(driver,BoardPageLocators.btnLogout);
}

public void clickOnExistingBoard(String sBoardName) {
	By lnkBoard = By.xpath("//div[contains(@class,'board-tile')]//div[@title = '"+sBoardName+"']");  
	base.waitForElementVisibility(driver,lnkBoard, GlobalVariables.mediumwait);
	base.waitForElementClickable(driver,lnkBoard, GlobalVariables.mediumwait);
	base.click(driver,lnkBoard);
}

public void clickOnBackToHome() {
	base.waitForElementVisibility(driver,BoardPageLocators.btnBackToHome, GlobalVariables.shortwait);
	base.waitForElementClickable(driver,BoardPageLocators.btnBackToHome, GlobalVariables.shortwait);
	base.click(driver,BoardPageLocators.btnBackToHome);
}


}
