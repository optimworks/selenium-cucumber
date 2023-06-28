package stepsdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowserSteps {
	private WebDriver driver;

    @Given("I launch browser")
    public void launchBrowser() {
    	String browser = System.getProperty("browser");
    	System.out.println("Broser name :" +browser);
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }
    }

    @When("I navigate to url")
    public void navigateToURL() {
    	String url = System.getProperty("url");
        driver.get(url);
    }

   
}
