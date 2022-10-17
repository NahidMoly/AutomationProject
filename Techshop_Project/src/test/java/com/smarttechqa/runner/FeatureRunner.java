package com.smarttechqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/NegativeLoginStepDefinition","Features/ LoginStepDefinition.feature"},
		//it is explain where is my feature file stored
		glue = {"com.smarttechqa.stepdef", "com.smarttechqa.hooks"},
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
	  //tags = "@Smoke",
		
	) 

public class FeatureRunner extends AbstractTestNGCucumberTests {
	

}
