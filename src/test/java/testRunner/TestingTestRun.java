package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = "src/test/java/Features/", 
 glue = "stepDefinitions", 
 dryRun = false,
 monochrome=true
 //plugin = { "pretty", "html:test-output" }

)

public class TestingTestRun extends AbstractTestNGCucumberTests{

	

	
	
}
