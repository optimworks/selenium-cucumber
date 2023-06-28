package stepsdefinition;

import org.openqa.selenium.WebDriver;

import com.trello.pages.BoardsPage;
import com.trello.pages.CreatedBoardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BoardsPageSteps {
	public WebDriver driver;
	BoardsPage boards;
	String sBoardName;
	CreatedBoardPage board;
	
	private BaseClass bContextSteps;
	
	public BoardsPageSteps (BaseClass contextSteps) {
		  bContextSteps = contextSteps;
	      driver = contextSteps.getDriver();
	      System.out.println("Boardpage steps constructor");
	   }
	
	@Then("user should navigate to board page")
	public void user_should_be_able_to_navigate_board_page() throws InterruptedException {
		boards = new BoardsPage(driver);
		boards.verifyBoardPageDisplayed();
	}

	// Board page steps
	
	@When("user clicks on Create New Board button")
	public void user_clicks_on_create_new_board_button() {
		boards.clickOnCreateNewBoard();
	}

	@And("user enters Board name {string}")
	public void user_enters_board_name(String boardName) {
		boards.enterBoardName(boardName);
		sBoardName = boardName;
	}

	@And("user clicks on Create Board")
	public void user_clicks_on_create_board() {
		boards.clickOnCreate();
	}
	
	@And("user clicks on existing board {string}")
	public void user_clicks_on_existing_board(String existingBoard) {
		boards.clickOnExistingBoard(existingBoard);
	}
	
	@And("user clicks on Back to home")
	public void user_clicks_on_back_to_home() {
		boards.clickOnBackToHome();
	}
	
	@When("user clicks on Account")
	public void user_clicks_on_account() {
		boards.clickOnAccout();
	}

	@And("user clicks on LogOut")
	public void user_clicks_on_log_out() {
	   boards.clickOnLogout();
	}
	
	

}
