package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/BoardsWithListAndCardsScenario.feature", glue = {
		"stepsdefinition" }, dryRun = false, plugin = { "html:target/cucumber-reports/cucumber-html-report.html" })
public class TestRunCuke extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {	
		return super.scenarios();
	}	
}

