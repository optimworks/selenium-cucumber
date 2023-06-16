package locators;

import org.openqa.selenium.By;

public class HomePageLocators {

	public static By createButton = By.xpath("//p[text()='Create']");
	public static By createBoard = By.xpath("//span[text()='Create board']");
	public static By boardTitle = By.xpath("//input[@data-testid='create-board-title-input']");
	public static By createBoardButton = By.xpath("//button[text()='Create']");
}
