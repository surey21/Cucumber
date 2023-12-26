package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BaseClass1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.masterthought.cucumber.json.Output;

public class HooksClass extends BaseClass1 {
	@Before
	public void beforeScenario() throws IOException {
		getDriver(getPropertyFileValue("browsertype"));
		loadurl(getPropertyFileValue("url"));
		maximize();
		implicitwait(20);
		getPropertyFileValue("userName");
		getPropertyFileValue("password");

	}

	@After
	public void afterScenario(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] bs = screenshot.getScreenshotAs(OutputType.BYTES);
			sc.embed(bs, "Every Scenario");
		}

		closeWindow();
	}



}
