package sdf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.JavaUtility;
import pages.CreatedashBoardPage;

public class CreateBoardSteps extends JavaUtility {
//	String boardName = "jana"+JavaUtility.randomNumber;
//	String listName1 = "BMW"+JavaUtility.randomNumber;
//	String listName2 = "Honda"+JavaUtility.randomNumber;
//	String listName3 = "Audi"+JavaUtility.randomNumber;
//	
//	String card1 = "BMW"+JavaUtility.randomNumber;
//	String card2 = "BMW"+JavaUtility.randomNumber;
//	String card3 = "BMW"+JavaUtility.randomNumber;
//	String card4 = "Honda"+JavaUtility.randomNumber;
//	String card5 = "Honda"+JavaUtility.randomNumber;
//	String card6 = "Honda"+JavaUtility.randomNumber;
//	String card7 ="Audi"+JavaUtility.randomNumber;
//	String card8 = "Audi"+JavaUtility.randomNumber;
//	String card9 = "Audi"+JavaUtility.randomNumber;

	HomePage hp = new HomePage();
	JavaUtility jutil = new JavaUtility();
	CreatedashBoardPage cb = new CreatedashBoardPage();

	@Given("verify create button is present")
	public void verify_create_button_is_present() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("click on create button")
	public void click_on_create_button() {
		hp.verifyHomePage();
		hp.clickOnCreateButton();
	}

	@Then("select create board option")
	public void select_create_board_option() {
		hp.clickOnCreateDashBoard();
	}

	@Then("enter board title name {string}")
	public void enter_board_title_name(String boardTitle) {
		hp.enterBoardName(boardTitle);
	}

	@Then("click on the Create board button")
	public void click_on_the_create_board_button() {
		hp.clickOnCreateBoardButton();
	}

	@When("navigating to create board Page & verify Create board Page {string}")
	public void navigating_to_create_board_page_verify_create_board_page(String boardName) {
		cb.verifyCreatedDashBoardPage(boardName);
	}

	@Given("enter frist list title name {string}")
	public void enter_frist_list_title_name(String listName1) {
		cb.enterFristListName(listName1);
	}

	@When("click on add list button")
	public void click_on_add_list_button() {
		cb.clickAddListButton();
	}

	@Then("click on Add a card In frist list")
	public void click_on_add_a_card_in_frist_list() {
		cb.clickOnAddACardButtonInFristList();
	}

	@Then("enter frist card title name {string}")
	public void enter_frist_card_title_name(String card1) {
		cb.enterFristCardTitleName(card1);
	}

	@Then("click on add card  button")
	public void click_on_add_card_button() {
		cb.clickOnAddCardButton();
	}

	@Then("enter second card title name {string}")
	public void enter_second_card_title_name(String card2) {
		cb.enterSecondCardTitleName(card2);
	}

	@Then("enter third card title name {string}")
	public void enter_third_card_title_name(String card3) {
		cb.enterThirdCardTitleName(card3);
	}

	@Then("click on close icon")
	public void click_on_close_icon() {
		cb.clickOnCloseIcon();
	}

	@Given("enter second list title name {string}")
	public void enter_second_list_title_name(String listName2) {
		cb.enterSecondListName(listName2);
	}

	@Then("enter four card title name {string}")
	public void enter_four_card_title_name(String card4) {
		cb.enterSevenCardTitleName(card4);
	}

	@Then("enter five card title name {string}")
	public void enter_five_card_title_name(String card5) {
		cb.enterEigthCardTitleName(card5);
	}

	@Then("enter six card title name {string}")
	public void enter_six_card_title_name(String card6) {
		cb.enterNignthCardTitleName(card6);
	}

	@Given("enter Thrid list title name {string}")
	public void enter_thrid_list_title_name(String listName3) {
		cb.enterThirdCardTitleName(listName3);
	}

	@Then("enter seven card title name {string}")
	public void enter_seven_card_title_name(String card7) {
		cb.enterSevenCardTitleName(card7);
	}

	@Then("enter Eight card title name {string}")
	public void enter_Eight_card_title_name(String card8) {
		cb.enterEigthCardTitleName(card8);
	}

	@Then("enter Nine card title name {string}")
	public void enter_Nine_card_title_name(String card9) {
		cb.enterNignthCardTitleName(card9);
	}

	@Then("click on Add another list")
	public void click_on_Add_another_list() {
		cb.clickOnAddAnotherList();
	}

	@Then("click on Add a card In second list")
	public void click_on_Add_a_card_In_second_list() {
		cb.clickOnAddACardButtonInsecondList();
	}

	@Then("click on Add a card In Third list")
	public void click_on_Add_a_card_In_third_list() {
		cb.clickOnAddACardButtonInthirdList();
	}

}
