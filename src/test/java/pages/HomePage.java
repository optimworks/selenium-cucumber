package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import locators.HomePageLocators;
import utilities.BaseClass;

public class HomePage extends BaseClass {

	WebElement ele;
	WebDriverWait wait;

	public void verifyHomePage() {

		wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10000));
		WebElement createButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(HomePageLocators.createButton));
		String create = createButton.getText();
		Assert.assertEquals(create, "Create");
	}

	public void clickOnCreateButton() {
		click(driver, HomePageLocators.createButton);
	}

	public void clickOnCreateDashBoard() {
		wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePageLocators.createBoard)).click();
	}

	public void enterBoardName(String boardName) {
		wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(HomePageLocators.boardTitle)).sendKeys(boardName);

	}

	public void clickOnCreateBoardButton() {
		click(driver, HomePageLocators.createBoardButton);
	}
}
