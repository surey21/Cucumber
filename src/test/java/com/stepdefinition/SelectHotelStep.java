package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * 
 * @author Suresh
 * Description Generate SelectHotel
 *Date 08-07-2002
 */

public class SelectHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should select hotel and click continue")
	public void userShouldSelectHotelAndClickContinue() {
		pom.getSelectHotelPage().SelectHotel();
	}

	@Then("User should click continue without select any hotel")
	public void userShouldClickContinueWithoutSelectAnyHotel() {
		pom.getSelectHotelPage().SelectHotelwithoutSelect();
	}

	@Then("User should verify After select hotel error msg{string}")
	public void userShouldVerifyAfterSelectHotelErrorMsg(String expectederrormsg) {
		expectederrormsg="Please Select a Hotel";
		WebElement txtSelectHotelMsg = pom.getSelectHotelPage().getTexterrorselect();
		String text = txtSelectHotelMsg.getText();
		System.out.println(text);
		Assert.assertEquals("veryify message", expectederrormsg, text);


	}




}
