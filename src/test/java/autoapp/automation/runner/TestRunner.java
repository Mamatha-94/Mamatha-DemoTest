package autoapp.automation.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/autoapp/automation/features",
	glue = { "autoapp/automation/stepDef",	"autoapp/automation/utility" }, 
	plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-json/cucumber.json","junit:target/cucumber.xml","html:target/cucumber-reports"},
	tags = "@summerDressItemValidation",
	monochrome=true)

public class TestRunner {
}
