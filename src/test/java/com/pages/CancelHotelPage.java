package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass1;

public class CancelHotelPage extends BaseClass1{

	public CancelHotelPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement BookedItinerary;

	@FindBy(id="order_id_text")	
	private WebElement TxtSearch;

	@FindBy(id="search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath="//input[@type='button']")
	private WebElement BtnCancelid;







	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}

	public void setBookedItinerary(WebElement bookedItinerary) {
		BookedItinerary = bookedItinerary;
	}

	public WebElement getTxtSearch() {
		return TxtSearch;
	}

	public void setTxtSearch(WebElement txtSearch) {
		TxtSearch = txtSearch;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public void setBtnGo(WebElement btnGo) {
		this.btnGo = btnGo;
	}
	public WebElement getBtnCancelid() {
		return BtnCancelid;
	}

	public void setBtnCancelid(WebElement btnCancelid) {
		BtnCancelid = btnCancelid;
	}

	
	
	
	
	
	public void CancelBooking(String OrderId) {
		click(getBookedItinerary());
		Type(getTxtSearch(), OrderId);
		click(getBtnGo());
		click(getBtnCancelid());
		alerts();

	}

	public void CancelOrderid(String exsitingOrderId) {
		click(getBookedItinerary());
		Type(getTxtSearch(), exsitingOrderId);
		click(getBtnGo());
		click(getBtnCancelid());
		alerts();


























	}


}
