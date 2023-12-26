package com.stepdefinition;


import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CancelBookingStep {
	
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should cancel booking with exisiting {string}")
	public void userShouldCancelBookingWithExisiting(String Orderid) {
		pom.getCancelHotelPage().CancelOrderid(Orderid);
	}

	@Then("User should verify after order id cancelled msg contains{string}")
	public void userShouldVerifyAfterOrderIdCancelledMsgContains(String Orderid) {
	String id = pom.getBookingconfrimationpage().getOrderId();
	pom.getCancelHotelPage().CancelBooking(Orderid);
	
	}
	
}
