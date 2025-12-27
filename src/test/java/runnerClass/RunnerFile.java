package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions  ( features = {"C:/Users/atulm/Desktop/Selenium_Programs/VinothAcademyProject/src/test/resources/Features"},
		            glue = {"stepDefinationFiles"}, 
		            plugin = { "pretty", "html:target/Reports/cucumber-reports", "json:target/cucumber.json",
				               "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				               "rerun:target/failedReRun.txt" }, 
		            monochrome = true)

public class RunnerFile extends AbstractTestNGCucumberTests{

}