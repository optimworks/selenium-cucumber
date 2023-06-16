package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import locators.CreatedashBoardLocators;
import utilities.BaseClass;

public class CreatedashBoardPage extends BaseClass {

	WebElement ele;
	WebDriverWait wait;

	public void verifyCreatedDashBoardPage(String boardName) {

		String boardTitle = driver.findElement(CreatedashBoardLocators.verifyCreateDashBoardPage).getText();
		Assert.assertEquals(boardTitle, boardName);
	}

	public void enterFristListName(String list1) {

		sendKeys(driver, CreatedashBoardLocators.listTitleName, list1);
	}

	public void enterSecondListName(String list2) {
		sendKeys(driver, CreatedashBoardLocators.listTitleName, list2);
	}

	public void enterThirdListName(String list3) {
		sendKeys(driver, CreatedashBoardLocators.listTitleName, list3);
	}

	public void enterFristCardTitleName(String card1) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card1);
	}

	public void clickOnAddCardButton() {
		click(driver, CreatedashBoardLocators.addCardButton);
//		driver.findElement(CreatedashBoardLocators.addCardButton).click();
	}

	public void enterSecondCardTitleName(String card2) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card2);
	}

	public void enterThirdCardTitleName(String card3) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card3);
	}

	public void clickAddListButton() {
		click(driver, CreatedashBoardLocators.addList);

//		driver.findElement(CreatedashBoardLocators.addList).click();
	}

	public void clickOnCloseIcon() {
		click(driver, CreatedashBoardLocators.closeIcon);

//		driver.findElement(CreatedashBoardLocators.closeIcon).click();
	}

	public void clickOnAddAnotherList() {
		click(driver, CreatedashBoardLocators.addAnotherList);

//		driver.findElement(CreatedashBoardLocators.addAnotherList).click();
	}

	public void clickOnAddACardButtonInFristList() {
		click(driver, CreatedashBoardLocators.addACardButtonInFristList);

//		driver.findElement(CreatedashBoardLocators.addACardButtonInFristList).click();
	}

	public void clickOnAddACardButtonInsecondList() {
		click(driver, CreatedashBoardLocators.addACardButtonInsecondList);

//		driver.findElement(CreatedashBoardLocators.addACardButtonInsecondList).click();
	}

	public void clickOnAddACardButtonInthirdList() {
		click(driver, CreatedashBoardLocators.addACardButtonInThirdList);

//		driver.findElement(CreatedashBoardLocators.addACardButtonInThirdList).click();
	}

	public void enterForthCardTitleName(String card4) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card4);
	}

	public void enterFivethCardTitleName(String card5) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card5);
	}

	public void enterSixthCardTitleName(String card6) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card6);
	}

	public void clickOnAddACardInThird() {
		click(driver, CreatedashBoardLocators.addACardButtonInThirdList);

//		driver.findElement(CreatedashBoardLocators.addACardButtonInThirdList).click();
	}

	public void enterSevenCardTitleName(String card7) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card7);
	}

	public void enterEigthCardTitleName(String card8) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card8);
	}

	public void enterNignthCardTitleName(String card9) {
		sendKeys(driver, CreatedashBoardLocators.addCardTitle, card9);
	}
}
