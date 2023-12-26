package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.ReportingJVM;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {}, snippets = SnippetType.CAMELCASE, strict = true, dryRun = false, plugin = {
		"pretty", "json:target/JVMReport.json" }, monochrome = true, features = {
				"src\\test\\resources\\Features" }, glue = { "com.stepdefinition" })

public class TestRunnerclasses {

	@AfterClass
	public static void afterclass() {

		ReportingJVM.GeneratesJVMReport("C:\\Users\\DELL\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\JVMReport.json");

	}
}
