package TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = "StepDefinitionFile",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","junit:traget/cucumber-reports/reports_xml.xml"}
		
		)
		
public class Run {
	
	//Empty Class

}
