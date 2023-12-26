package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingJVM {
	
	public static void GeneratesJVMReport(String jsonfile) {
	File file = new File("C:\\Users\\DELL\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");

	Configuration configuration = new Configuration(file, "Adactin Hotel");

	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Version", "103.0.5060.66");
	configuration.addClassifications("OS", "Windows10");

	List<String> jsonflies = new ArrayList<String>();

	jsonflies.add(jsonfile);
	ReportBuilder builder = new ReportBuilder(jsonflies, configuration);

	builder.generateReports();

}
}