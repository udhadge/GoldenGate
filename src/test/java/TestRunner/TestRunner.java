package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "src/main/java/features"
		,glue="StepDefinitions",
		tags={"@Smoke"}
		)
public class TestRunner {

}
   