package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	public static By VerifyLoginPage = By.xpath("//h1[text()='Log in to Trello']");
	public static By email = By.cssSelector("input#user");
	public static By Continue = By.cssSelector("input.button ");
	public static By password = By.cssSelector("input#password");
	public static By login = By.cssSelector("#login-submit");
}
