package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/BoardsWithListAndCardsScenario.feature", glue = {
		"stepsdefinition" }, dryRun = false, plugin = { "html:target/cucumber-reports/cucumber-html-report.html" })
public class TestRunCuke3 extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {	
		return super.scenarios();
	}
}
