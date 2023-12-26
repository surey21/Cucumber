package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfrimationPage;
import com.pages.CancelHotelPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
import com.stepdefinition.LoginPageStep;

public class PageObjectManager {

	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private	BookHotelPage bookHotelPage;
	private BookingConfrimationPage  bookingconfrimationpage;
	private	CancelHotelPage cancelHotelPage;
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage = new LoginPage() : loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}
	public CancelHotelPage getCancelHotelPage() {
		return (cancelHotelPage==null)? cancelHotelPage = new CancelHotelPage():cancelHotelPage;
	}
	public BookingConfrimationPage getBookingconfrimationpage() {
		return (bookingconfrimationpage==null)? bookingconfrimationpage = new BookingConfrimationPage():bookingconfrimationpage;
	}

}
