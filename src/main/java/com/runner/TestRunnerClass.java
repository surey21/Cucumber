package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(tags = {""},snippets =SnippetType.CAMELCASE,strict = true,dryRun = false,plugin = {"pretty","json:target/output.json"},monochrome = true,features = {"src\\test\\resourcesFeatures\\TC5_CancelBooking.Feature"},glue = {"com\\Stepdefinition"})
public class TestRunnerClass {

	
	@AfterClass
	public static void AfterClass() {
		
		
	}
}
