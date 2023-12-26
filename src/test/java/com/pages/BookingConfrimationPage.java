package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass1;

public class BookingConfrimationPage extends BaseClass1 {

	public BookingConfrimationPage () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private WebElement orderid;

	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement btnBookedItinerary;

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement BookingConfrimMsg;

	public WebElement getOrderid() {
		return orderid;
	}


	public WebElement getBookingConfrimMsg() {
		return BookingConfrimMsg;
	}


	public WebElement getBtnBookedItinerary() {
		return btnBookedItinerary;
	}

	public String getOrderId() {
		String orderId = getAttributeValue(getOrderid());
		return orderId;

	}	



}
