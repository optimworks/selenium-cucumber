package stepsdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseClass {
	private static boolean initialized = false;

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		if (System.getProperty("browser") != null) {
			String browser = System.getProperty("browser");
			System.out.println("Browser name :" + browser);
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
		} else {
			driver = new ChromeDriver();
		}
		// initialized = true;
		// mvn test -Dbrowser=chrome -Durl=https://trello.com/home
	}

	public WebDriver getDriver() {
		return driver;
	}

	/*
	 * if (!initialized) { // initialize the driver driver = new ChromeDriver();
	 * initialized = true; }
	 */
	/*
	 * @After(order=1) public void tearDown() { driver = getDriver(); driver.quit();
	 * }
	 */
	@After
	public void screenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot scrn = (TakesScreenshot) driver;
			byte[] screenshot = scrn.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed TestScenario : " + scenario.getName());
		} else {
			TakesScreenshot scrn = (TakesScreenshot) driver;
			byte[] screenshot = scrn.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Passed TestScenario : " + scenario.getName());
		}
	}

}
