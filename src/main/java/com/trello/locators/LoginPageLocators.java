package com.trello.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	  public static By lblTrello = By.xpath("//div//*[contains(text(),'Log in to Trello')]");
      public static By txtEmail = By.xpath("//div//input[@id='user']");
      public static By btnContinue = By.xpath("//input[@value='Continue']");
      public static By txtPassword = By.name("password");
      public static By btnLogin = By.xpath("//button//span[contains(text(),'Log in')]");
}
