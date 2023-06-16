package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/createBoard.feature", glue = {
		"sdf" }, dryRun = false, monochrome = true, tags= "@smokeTest @RegressionTest",plugin = { "pretty",
				"html:target/cucumber-reports/cucumber-html-report.html" })
public class TestRun extends AbstractTestNGCucumberTests {

}
