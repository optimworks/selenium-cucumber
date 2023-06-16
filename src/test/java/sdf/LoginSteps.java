package sdf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.BaseClass;

public class LoginSteps extends BaseClass {
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();

	@Given("Launch URL and login to the application")
	public void launch_url_and_login_to_the_application() {
		openBrowser("https://trello.com/create-first-team");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		lp.enterUsernameAndClickOnContinueButton(username);
		lp.enterPassword(password);
	}
 
	@When("Click on login button")
	public void click_on_login_button() {
		lp.clickLoginButton();
	}

}
