package stepsdefinition;

import org.openqa.selenium.WebDriver;

import com.trello.pages.LogOutPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutPageSteps {
	
	public WebDriver driver;
	LogOutPage logOut;
	private BaseClass contextSteps;
	
	public LogOutPageSteps (BaseClass contextSteps) {
	      this.contextSteps = contextSteps;
	      driver = contextSteps.getDriver();
	      System.out.println("Logoutpagesteps constructor");
	   }
		@Then("user should navigate to LogOut page")
		public void user_should_navigate_to_log_out_page() {
			logOut = new LogOutPage(driver);
		   logOut.verifyLogOutPageDisplayed();
		}

		@And("user clicks on Logout button")
		public void user_clicks_on_logout_button() {
		    logOut.clickOnLogOut();
		    
		}
}
