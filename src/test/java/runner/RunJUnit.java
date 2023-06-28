package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/OpenBrowserAndNavigateToURL.feature",
		glue= {"stepsdefinition"},
		plugin={ "html:target/cucumber-reports/cucumber-html-report.html" }
		)
public class RunJUnit {
	
	

}
