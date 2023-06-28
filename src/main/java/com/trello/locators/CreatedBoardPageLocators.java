package com.trello.locators;

import org.openqa.selenium.By;

public class CreatedBoardPageLocators {
	//public static String lblBoardName = "//div[@aria-label='Board name']//*[text()='value']";
	public static By txtAddAList = By.xpath("//span[contains(text(),'Add a list')]/../following-sibling::input");
	public static By txtAddAnotherList = By.xpath("//span[contains(text(),'Add another list')]/../following-sibling::input");
	public static By btnAddList = By.xpath("//input[@value='Add list']");
	public static By lnkAddACard = By.xpath("//span[contains(text(),'Add a card')]");
	public static By txtAddCardTitle = By.xpath("//textarea[contains(@class,'list-card')]");
	public static By btnAddCard = By.xpath("//input[@value='Add card']");
	public static By btnAddAList = By.xpath("//*[contains(text(),'Add a list')]/..");
	public static By btnShowMenu = By.xpath("//button[@aria-label='Show menu']");
	public static By btnOpenMore = By.xpath("//a[contains(@class,'open-more')]");
	public static By btnCloseBoard = By.xpath("//a[contains(text(),'Close board…')]");
	public static By btnClose = By.xpath("//input[@value='Close']");
	public static By lnkPermanentlyDelete = By.xpath("//button[contains(text(),'Permanently delete board')]");
	public static By btnDelete = By.xpath("//button[text()='Delete']");
}
