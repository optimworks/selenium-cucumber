package locators;

import org.openqa.selenium.By;

import utilities.JavaUtility;

public class CreatedashBoardLocators {

	static String boardName = "jana" + JavaUtility.randomNumber;

	public static By verifyCreateDashBoardPage = By.xpath("//h1[text()='" + boardName + "']");
	public static By listTitleName = By.cssSelector(".list-name-input");
	public static By addList = By.cssSelector(".mod-list-add-button");
	public static By addCardTitle = By.cssSelector(".js-card-title");
	public static By addCardButton = By.cssSelector(".js-add-card");
	public static By closeIcon = By.cssSelector("[aria-label='Cancel list editing']");

	public static By addACardButtonInsecondList = By.xpath("//a[@class='open-card-composer js-open-card-composer']");
	public static By addACardButtonInThirdList = By.xpath("//h2[text()='HONDA']/../following-sibling::div[2]//span[text()='Add a card']");
	public static By addACardButtonInFristList = By.xpath("//span[text()='Add a card']");

	public static By userMenuItems = By.xpath("//button[@data-testid='header-member-menu-button']");
	public static By logout = By.xpath("//button[@data-testid='account-menu-logout']");
	public static By logoutSubmit = By.cssSelector("#logout-submit");
	public static By addAnotherList = By.xpath("//span[text()='Add another list']");
}
