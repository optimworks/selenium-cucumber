package com.trello.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import com.trello.locators.BoardPageLocators;
import com.trello.locators.CreatedBoardPageLocators;
import com.trello.utilities.GlobalVariables;
import com.trello.*;
import com.trello.base.BaseClass;

public class CreatedBoardPage extends BaseClass{
	WebDriver driver;
	public WebElement wElement;
	boolean bStatus;
	List<String> cards=new ArrayList<String>();  
	List<String> lists=new ArrayList<String>(); 
	Random objGenerator = new Random();
	int randomNumber = objGenerator.nextInt(3000);
	int j;
	
	public CreatedBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	//String sCardName = "Card" + randomNumber;
	
	public void verifyCreatedBoardPageDisplayed(String boardName) {
		By wbElement = By.xpath("//div[@aria-label='Board name']//*[text()='"+boardName+"']");
		bStatus = waitForElementVisibility(driver,wbElement, GlobalVariables.mediumwait);
		//wElement = driver.findElement(By.xpath("//div[@aria-label='Board name']//*[text()='"+boardName+"']"));
		Assert.assertTrue(bStatus, "Trello login page is not displayed");
	}
	
	public void enterListTitle(String sListName) {
		waitForElementVisibility(driver,CreatedBoardPageLocators.txtAddAList, GlobalVariables.shortwait);
		sendKeys(driver,CreatedBoardPageLocators.txtAddAList, sListName);
	}
	
	public void enterAnotherListTitle(String sAnotherList) {
		waitForElementVisibility(driver,CreatedBoardPageLocators.txtAddAnotherList, GlobalVariables.mediumwait);
		sendKeys(driver,CreatedBoardPageLocators.txtAddAnotherList, sAnotherList);
	}
	
	public void clickOnAddList() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnAddList, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnAddList, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.btnAddList);
	}
	
	public void clickOnAddACard() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.lnkAddACard, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.lnkAddACard, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.lnkAddACard);
	}
	
	public void enterCardTitle(String sCardTitle) {
		waitForElementVisibility(driver,CreatedBoardPageLocators.txtAddCardTitle, GlobalVariables.shortwait);
		sendKeys(driver,CreatedBoardPageLocators.txtAddCardTitle, sCardTitle);
	}
	
	public void clickOnAddCard() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnAddCard, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnAddCard, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.btnAddCard);
	}
	
	public List<String> addMultipleCard(int numberOfCards){
		for(int i=0; i<numberOfCards; i++) {
			cards.add("Card"+objGenerator.nextInt(200));
			enterCardTitle(cards.get(i));
			clickOnAddCard();
		}
		return cards;	
	}
	
	public List<String> addMultipleCard(List<String> cardNames){
		for(String cardName : cardNames) {
			enterCardTitle(cardName);
			clickOnAddCard();
		}
		return cardNames;
	}
	
	public void verifyMultipleCards(List<String> cards) {
		for(String card : cards) {
			By lnkCard = By.xpath("//div[contains(@class,'list-card')]//span[text()='"+card+"']");
			////div[contains(@class,'list-header')]//h2[contains(text(),'List58')]
			//div[contains(@class,'list-card')]//span[text()='"+card+"']
			bStatus = waitForElementVisibility(driver,lnkCard, GlobalVariables.mediumwait);
			Assert.assertTrue(bStatus, "Card: "+card+" is not displayed in Board Page");
		}
		
	}
	
	public List<String> addMultipleLists(int numberOfLists){
		lists.add("List"+objGenerator.nextInt(200));
		enterListTitle(lists.get(0));
		clickOnAddList();
		for(int i=1; i<numberOfLists; i++) {
			lists.add("List"+objGenerator.nextInt(200));
			enterAnotherListTitle(lists.get(i));
			clickOnAddList();
		}
		return lists;	
	}
	
	public void verifyMultipleLists(List<String> lists){
		for(String list : lists) {
	    	By lnkList = By.xpath("//div[contains(@class,'list-content')]//h2[text()='"+list+"']");
	    	bStatus = waitForElementVisibility(driver,lnkList, GlobalVariables.mediumwait);
			Assert.assertTrue(bStatus,
					"List: " + list + " is not displayed in Board Page");
	    }
	}
	
	public void verifyMultipleCardsInLists(List<String> lists, List<String> cards) {
		for (String list : lists) {
			for (String card : cards) {
				By lnkCard = By.xpath("//*[text()='"+list+"']/ancestor::div[@class='list js-list-content']//span[contains(text(),'"+card+"')]");
				bStatus = waitForElementVisibility(driver,lnkCard, GlobalVariables.mediumwait);
				Assert.assertTrue(bStatus,
						"Cards: " + card + " is not displayed in the list: "+list);
		}	
	}
	}
	
	public List<String> AddCardToMultipleLists(List<String> lists, int numberOfCards) throws InterruptedException {
		for(String list : lists) {
			By lnkAddACard = null;
			System.out.println("//*[text()='"+list.toString()+"']/ancestor::div[@class='list js-list-content']//*[text()='Add a card']");
			lnkAddACard = By.xpath("//*[text()='"+list.toString()+"']/ancestor::div[@class='list js-list-content']//*[text()='Add a card']");
			waitForElementVisibility(driver,lnkAddACard, GlobalVariables.mediumwait);
			waitForElementClickable(driver,lnkAddACard, GlobalVariables.mediumwait);		
			WebElement m=driver.findElement(lnkAddACard);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", m);
			for(int i=0; i<numberOfCards; i++) {
				cards.add("Card"+objGenerator.nextInt(200));
				enterCardTitle(cards.get(i));
				clickOnAddCard();
			}
		}
		return cards;
	}
	
	public void clickOnAddAList() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnAddAList, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnAddAList, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.btnAddAList);
	}
	
	public void clickOnShowMenu() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnShowMenu, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnShowMenu, GlobalVariables.shortwait);
		click(driver, CreatedBoardPageLocators.btnShowMenu);
	}
	
	public void clickOnOpenMore() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnOpenMore, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnOpenMore, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.btnOpenMore);
	}
	
	public void clickOnCloseBoard() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnCloseBoard, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnCloseBoard, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.btnCloseBoard);
	}
	
	public void clickOnClose() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnClose, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnClose, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.btnClose);
	}
	
	public void clickOnPermanentlyDeleteBoard() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.lnkPermanentlyDelete, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.lnkPermanentlyDelete, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.lnkPermanentlyDelete);
	}
	
	public void clickOnDelete() {
		waitForElementVisibility(driver,CreatedBoardPageLocators.btnDelete, GlobalVariables.shortwait);
		waitForElementClickable(driver,CreatedBoardPageLocators.btnDelete, GlobalVariables.shortwait);
		click(driver,CreatedBoardPageLocators.btnDelete);
	}
	
	
	
	
}
