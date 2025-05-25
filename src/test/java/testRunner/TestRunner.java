package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\VikasChavan\\eclipse-workspace\\Demoblaze1\\features\\home.feature",
		
		glue = "stepdef",
		
		dryRun = false
			
		)

public class TestRunner {

}