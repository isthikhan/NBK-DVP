package com.DVP.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/DVP/features",
		glue= "com.DVP.stepDefinitions",
		//tags = "@Regression",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class cucumberRunner {
//tags= {"@DeletePlace"}  compile test verify
}

