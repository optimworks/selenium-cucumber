package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import locators.HomePageLocators;
import locators.LoginPageLocators;
import utilities.BaseClass;

public class LoginPage extends BaseClass {
	WebDriverWait wait;

	public void verifyloginPage() {
		String text = BaseClass.driver.findElement(LoginPageLocators.VerifyLoginPage).getText();
		Assert.assertEquals(text, "Log in to Trello");
	}

	public void enterUsernameAndClickOnContinueButton(String username) throws InterruptedException {

//		wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(20000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.email))
//				.sendKeys(username);
		sendKeys(driver,LoginPageLocators.email , username);
		click(driver, LoginPageLocators.Continue);

//		String username = "janardhan.bhukya@optimworks.com";
//		WebDriverUtility.sendKeys(driver, LoginPageLocators.email, username);
	}

	public void enterPassword(String password) {
//		wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.password))
//				.sendKeys(password);
	sendKeys(driver, LoginPageLocators.password, password);
	}

	public void clickLoginButton() {
		String loginbutton = BaseClass.driver.findElement(LoginPageLocators.login).getText();
		System.out.println(loginbutton);
		Assert.assertEquals(loginbutton, "Log in");
		click(driver, LoginPageLocators.login);

	}

	public void verifyHomepageElements() {
		WebElement ele = BaseClass.driver.findElement(HomePageLocators.createButton);
		ele.isDisplayed();
	}

}
