package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(	
				features={".//Features/"},
				glue={"StepDefinitions"},					
//				tags="@t1",			
				dryRun=false,
			    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber.json"}

		)

public class Testrunners {
	
	

}
