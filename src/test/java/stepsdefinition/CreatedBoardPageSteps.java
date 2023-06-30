package stepsdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.trello.pages.CreatedBoardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatedBoardPageSteps {
	public WebDriver driver;
	CreatedBoardPage board;
	String sBoardName;
	List<String> cards=new ArrayList<String>();  
	List<String> lists = new ArrayList<String>();
	
	private BaseClass contextSteps;
	
	public CreatedBoardPageSteps (BaseClass contextSteps) {
	      this.contextSteps = contextSteps;
	      driver = contextSteps.getDriver();
	      System.out.println("created board page steps constructor");
	   }
	
	@Then("user should navigate to Created Board Page {string}")
	public void user_should_be_able_to_navigate_created_board_page(String sBoardName) {
		board = new CreatedBoardPage(driver);
		board.verifyCreatedBoardPageDisplayed(sBoardName);
	}
	
	
	@When("user enters list title {string}")
	public void user_enters_list_title(String listTitle) {
	   board.enterListTitle(listTitle);
	}

	@And("user clicks on Add list button")
	public void user_clicks_on_add_list_button() {
	  board.clickOnAddList();
	}

	@And("user clicks on Add a Card button")
	public void user_clicks_on_add_a_card_button() {
	   board.clickOnAddACard();
	}
	
	@And("user enters card title {string}")
	public void user_enters_card_title(String cardName) {
	    board.enterCardTitle(cardName);
	}

	@Then("user should be able to view Created Card")
	public void user_should_be_able_to_view_created_card() {
	  
	}
	
	@And("user adds {string} cards")
	public void user_adds_cards(String iNumberOfCards) {
		cards = board.addMultipleCard(Integer.parseInt(iNumberOfCards));  	
	}
	
	@And("user should be able to view added Cards")
	public void user_should_be_able_to_view_added_cards() {
		board.verifyMultipleCards(cards);
	}
	
	@When("user adds {int} lists")
	public void user_adds_multiple_lists(int iNumberOfLists) {
	    lists = board.addMultipleLists(iNumberOfLists);
	}
	
	@Then("user should be able to view created lists")
	public void user_should_be_able_to_view_created_lists() {
	   // board.verifyMultipleLists(lists);
	}
	
	@When("user adds {int} cards in respective lists")
	public void user_adds_multiple_cards(int iNumberOfCards) throws InterruptedException {
	     board.AddCardToMultipleLists(lists, iNumberOfCards);
	}
	
	@Then("user should be able to view created cards in respective lists")
	public void user_should_be_able_to_view_created_cards_in_respective_lists() {
		 board.verifyMultipleCardsInLists(lists, cards); 
	}
	
	@And("user adds multiple cards")
	public void user_adds_multiple_cards(io.cucumber.datatable.DataTable dataTable) {
		cards = dataTable.asList();
		board.addMultipleCard(cards);
	}
	
	
	@And("user clicks on Show menu")
	public void user_clicks_on_show_menu() {
	    board.clickOnShowMenu();
	}
	
	@And("user clicks on open-more")
	public void user_clicks_on_open_more() {
	    board.clickOnOpenMore();
	}
	
	@And("user clicks on Closeboard")
	public void user_clicks_on_closeboard() {
	    board.clickOnCloseBoard();
	}
	
	@And("user clicks on Close")
	public void user_clicks_on_close() {
	    board.clickOnClose();
	}
	
	@And("user clicks on Permanently delete board link")
	public void user_clicks_on_permanently_delete_board_link() {
	    board.clickOnPermanentlyDeleteBoard();
	}
	
	@And("user clicks on delete button")
	public void user_clicks_on_delete_button() {
	   board.clickOnDelete();
	}
	
	
	@And("user drags cards to {string}")
	public void user_drags_cards_to(String sListName, io.cucumber.datatable.DataTable dataTable) {
		cards = dataTable.asList();
		board.dragAndDropCards(sListName, cards);
	}
	
	@And("user clicks on Add another list")
	public void user_clicks_on_add_another_list() {
	    board.clickOnAddAnotherList();
	}
	
	@And("user enters another listname {string}")
	public void user_enters_another_listname(String sListName) {
	   board.enterAnotherListTitle(sListName);
	}

}
