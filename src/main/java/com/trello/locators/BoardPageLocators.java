package com.trello.locators;

import org.openqa.selenium.By;

public class BoardPageLocators {
	public static By lnkBoards = By.xpath("(//a//span[contains(text(),'Boards')])[2]");
	public static By btnCreateNewBoard = By.xpath("//span[text()='Create new board']/../..");
	public static By txtBoardTitle = By.xpath("//div[text()='Board title']/following-sibling::input");
	public static By btnCreate = By.xpath("//button[text()='Create']");
	public static By btnTemplates = By.xpath("//button//span[contains(text(),'Templates')]");
	public static By btnAccount = By.xpath("//button[@aria-label='Open member menu']/div");
	public static By btnLogout = By.xpath("//button//*[text()='Log out']");
	public static By btnBackToHome=By.xpath("//a[@aria-label='Back to home']");
}
