package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions  ( features = {"src/test/resources/Features/"},
		            glue = { "stepDefinationFiles" }, 
		            plugin = { "pretty", "html:target/Reports/cucumber-reports", "json:target/Reports/junit-reports/cucumber.xml",
				               "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				               "rerun:target/failedReRun.txt" }, 
		            monochrome = true)

public class RunnerFile extends AbstractTestNGCucumberTests{

}
