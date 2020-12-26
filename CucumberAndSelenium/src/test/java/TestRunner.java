import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features = "classpath:",
		//glue ="stepdefs",
		plugin = {"pretty","html:target/CucumberRr"},
		tags ="",
		dryRun=false
		
		
		
		)

public class TestRunner {

}
