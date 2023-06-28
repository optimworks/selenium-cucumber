package stepsdefinition;

import org.openqa.selenium.WebDriver;

import com.trello.pages.BoardsPage;
import com.trello.pages.HomePage;
import com.trello.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
	public WebDriver driver;
	private BaseClass contextSteps;
	HomePage home;
	LoginPage login;
	BoardsPage boards;
	
	//Login Page steps
	public LoginPageSteps (BaseClass contextSteps) {
	      this.contextSteps = contextSteps;
	      driver = contextSteps.getDriver();
	      System.out.println("LoginPageSteps Constructor");
	   }
	
	@Given("user navigates to the home page")
	public void user_navigates_to_the_home_page() throws InterruptedException {
		if(System.getProperty("url")!=null) {
		driver.get(System.getProperty("url"));
		}else {
			driver.get("https://trello.com/home");
		}
		home = new HomePage(driver);
		home.verifyHomePageDisplayed();
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		home.clickOnLogin();
	}

	@Then("user should be able to navigate login page")
	public void user_validates_the_login_page() {
		login = new LoginPage(driver);
		login.verifyTrelloLoginPageDisplayed();
	}

	@Then("user enters valid credentials")
	public void user_enters_valid_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		//Thread.sleep(7000);
		login.enterEmail(dataTable.asMap().get("username"));
		login.clickOnContinue();
		login.enterPassword(dataTable.asMap().get("password"));
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickOnLogin();
	}

}
