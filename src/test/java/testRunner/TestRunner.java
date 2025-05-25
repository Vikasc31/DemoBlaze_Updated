package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\VikasChavan\\eclipse-workspace\\Demoblaze1\\features\\home.feature",

		glue = "stepdef",

		plugin = { "pretty", "html:target/cucumber-reports.html",
		        "json:target/cucumber.json",
		        "junit:target/cucumber.xml"},

		dryRun = false

)

public class TestRunner {

}