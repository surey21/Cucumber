package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass1;

public class SearchHotelPage extends BaseClass1 {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement dDnLocation;

	@FindBy(xpath="//select[@id='hotels']")
	private WebElement dDnHotels;

	@FindBy(id="room_type")
	private WebElement dDnRoomType;

	@FindBy(id="room_nos")
	private WebElement dDnnoOfRooms;

	@FindBy(id="datepick_in")
	private WebElement TxtCheckInDate;

	@FindBy(id="datepick_out")
	private WebElement TxtCheckOutDate;

	@FindBy(id="adult_room")
	private WebElement dDnAdultPerRoom;

	@FindBy(id="child_room")
	private WebElement dDnChilrenPerRoom;

	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	@FindBy(id="checkin_span")
	private WebElement geterrorcheckin;
	
	@FindBy(id="checkout_span")
	private WebElement geterrorcheckout;
	
	@FindBy(id="location_span")
	private WebElement TxtLocationError;

	
	public WebElement getTxtLocationError() {
		return TxtLocationError;
	}
	public void setTxtLocationError(WebElement txtLocationError) {
		TxtLocationError = txtLocationError;
	}
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public void setdDnLocation(WebElement dDnLocation) {
		this.dDnLocation = dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	public void setdDnHotels(WebElement dDnHotels) {
		this.dDnHotels = dDnHotels;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public void setdDnRoomType(WebElement dDnRoomType) {
		this.dDnRoomType = dDnRoomType;
	}
	public WebElement getdDnnoOfRooms() {
		return dDnnoOfRooms;
	}
	public void setdDnnoOfRooms(WebElement dDnnoOfRooms) {
		this.dDnnoOfRooms = dDnnoOfRooms;
	}
	public WebElement getTxtCheckInDate() {
		return TxtCheckInDate;
	}
	public void setTxtCheckInDate(WebElement txtCheckInDate) {
		TxtCheckInDate = txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return TxtCheckOutDate;
	}
	public void setTxtCheckOutDate(WebElement txtCheckOutDate) {
		TxtCheckOutDate = txtCheckOutDate;
	}
	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}
	public void setdDnAdultPerRoom(WebElement dDnAdultPerRoom) {
		this.dDnAdultPerRoom = dDnAdultPerRoom;
	}
	public WebElement getdDnChilrenPerRoom() {
		return dDnChilrenPerRoom;
	}
	public void setdDnChilrenPerRoom(WebElement dDnChilrenPerRoom) {
		this.dDnChilrenPerRoom = dDnChilrenPerRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	public WebElement getGeterrorcheckin() {
		return geterrorcheckin;
	}
	public void setGeterrorcheckin(WebElement geterrorcheckin) {
		this.geterrorcheckin = geterrorcheckin;
	}
	public WebElement getGeterrorcheckout() {
		return geterrorcheckout;
	}
	public void setGeterrorcheckout(WebElement geterrorcheckout) {
		this.geterrorcheckout = geterrorcheckout;
	}
	public void SearchHotel(String Location,String Hotels,String RoomType,String noOfRooms,
			String CheckInDate,String CheckOutDate,String AdultsPerRoom,String ChildrenPerRoom) {
		// Select by all fileds 
		Type(getdDnLocation(), Location);
		//Type(getdDnHotels(), Hotels);
		Type(getdDnRoomType(), RoomType);
		Type(getdDnnoOfRooms(), noOfRooms);
		Type(getTxtCheckInDate(), CheckInDate);
		Type(getTxtCheckOutDate(), CheckOutDate);
		Type(getdDnAdultPerRoom(), AdultsPerRoom);
		Type(getdDnChilrenPerRoom(), ChildrenPerRoom);
		click(getBtnSubmit());
	}
	// Select by mandatory fileds
	public void MandatoryFileds(String Location,String noOfRooms,
			String CheckInDate,String CheckOutDate,String AdultsPerRoom) {

		Type(getdDnLocation(), Location);
		Type(getdDnnoOfRooms(), noOfRooms);
		Type(getTxtCheckInDate(), CheckInDate);
		Type(getTxtCheckOutDate(), CheckOutDate);
		Type(getdDnAdultPerRoom(), AdultsPerRoom);
		click(getBtnSubmit());

	}
	public void SearchHotelwithoutfileds(String Location, String Hotels, String RoomType, String noOfRooms, String CheckInDate, String CheckOutDate, String AdultsPerRoom, String ChildrenPerRoom) {
		Type(getdDnLocation(), Location);
		//Type(getdDnHotels(), Hotels);
		Type(getdDnRoomType(), RoomType);
		Type(getdDnnoOfRooms(), noOfRooms); 
		Clear(getTxtCheckInDate());
		Type(getTxtCheckInDate(), CheckInDate);
		Clear(getTxtCheckInDate());
		Type(getTxtCheckInDate(), CheckOutDate);
		Type(getdDnAdultPerRoom(), AdultsPerRoom);
		Type(getdDnChilrenPerRoom(), ChildrenPerRoom);
		click(getBtnSubmit());
	}
	public void SearchHotelWithoutFileds() {
		click(getBtnSubmit());
		getText(getTxtLocationError());

	}

	}





















