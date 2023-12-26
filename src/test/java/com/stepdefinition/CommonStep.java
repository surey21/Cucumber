package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CommonStep {


	PageObjectManager pom = new PageObjectManager();

	@Then("Verify after Login {string}")
	public void verifyAfterLogin(String expectedLogInMsg) {

		expectedLogInMsg="Hello Suresh21!";
		WebElement txtloginSuccessful = pom.getLoginPage().getTextlogin();
		String text = txtloginSuccessful.getAttribute("value");
		System.out.println(text);
		Assert.assertEquals("verify message", expectedLogInMsg, text);
	}
	@Then("Verify after Search Hotels {string}")
	public void verifyAfterSearchHotels(String expectedSelectHotelMsg) {
		expectedSelectHotelMsg="Select Hotel";
		WebElement txtSelectHotelMsg = pom.getSelectHotelPage().getCheckSelectHotel();
		String text = txtSelectHotelMsg.getText();
		System.out.println(text);
		Assert.assertEquals("veryify message", expectedSelectHotelMsg, text);

	}
	@Then("User should verify After select hotel{string}")
	public void userShouldVerifyAfterSelectHotel(String expectedBookHotelMsg) {
		expectedBookHotelMsg="Book A Hotel";
		WebElement txtBookHotelmsg = pom.getBookHotelPage().getTxtBookingHotel();
		String text = txtBookHotelmsg.getText();
		System.out.println(text);
		Assert.assertEquals("verify message", expectedBookHotelMsg, text);

	}

	@Then("User should verify after book hotel {string}")
	public void userShouldVerifyAfterBookHotel(String expectdBookingConfirmationMsg) {
		expectdBookingConfirmationMsg="Booking Confirmation";
		WebElement txtBookingConfMsg = pom.getBookingconfrimationpage().getBookingConfrimMsg();
		String text = txtBookingConfMsg.getText();
		Assert.assertEquals(expectdBookingConfirmationMsg, text);

	}




}
