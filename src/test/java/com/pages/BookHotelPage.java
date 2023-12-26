package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass1;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass1 {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement TxtFirstName;

	@FindBy(id="last_name")
	private WebElement TxtLastName;

	@FindBy(id="address")
	private WebElement TxtBillingAddress;

	@FindBy(id="cc_num")
	private WebElement TxtCreditCardNo;

	@FindBy(id="cc_type")
	private WebElement TxtCreditCardType;

	@FindBy(id="cc_exp_month")
	private WebElement txtMonth;

	@FindBy(id="cc_exp_year")
	private WebElement txtYear;

	@FindBy(id="cc_cvv")
	private WebElement TxtCvvNo;

	@FindBy(id="book_now")
	private WebElement btnBookNow;

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtBookingHotel;

	@FindBy(xpath="(//label[@class='reg_error'])")
	private WebElement texterrorFirstname;

	@FindBy(xpath="(//label[@class='reg_error'])[2]")
	private WebElement texterrorlastname;

	@FindBy(xpath="(//label[@class='reg_error'])[3]")
	private WebElement texterroraddress;

	@FindBy(xpath="(//label[@class='reg_error'])[4]")
	private WebElement texterrorcardno;

	@FindBy(xpath="(//label[@class='reg_error'])[5]")
	private WebElement texterrorcardtype;

	@FindBy(xpath="(//label[@class='reg_error'])[6]")
	private WebElement texterrorexpirydate;

	@FindBy(xpath="(//label[@class='reg_error'])[7]")
	private WebElement texterrorcvvno;


	public WebElement getTxtFirstName() {
		return TxtFirstName;
	}
	public void setTxtFirstName(WebElement txtFirstName) {
		TxtFirstName = txtFirstName;
	}
	public WebElement getTxtLastName() {
		return TxtLastName;
	}
	public void setTxtLastName(WebElement txtLastName) {
		TxtLastName = txtLastName;
	}
	public WebElement getTxtBillingAddress() {
		return TxtBillingAddress;
	}
	public void setTxtBillingAddress(WebElement txtBillingAddress) {
		TxtBillingAddress = txtBillingAddress;
	}
	public WebElement getTxtCreditCardNo() {
		return TxtCreditCardNo;
	}
	public void setTxtCreditCardNo(WebElement txtCreditCardNo) {
		TxtCreditCardNo = txtCreditCardNo;
	}
	public WebElement getTxtCreditCardType() {
		return TxtCreditCardType;
	}
	public void setTxtCreditCardType(WebElement txtCreditCardType) {
		TxtCreditCardType = txtCreditCardType;
	}
	public WebElement getTxtMonth() {
		return txtMonth;
	}
	public void setTxtMonth(WebElement txtMonth) {
		this.txtMonth = txtMonth;
	}
	public WebElement getTxtYear() {
		return txtYear;
	}
	public void setTxtYear(WebElement txtYear) {
		this.txtYear = txtYear;
	}
	public WebElement getTxtCvvNo() {
		return TxtCvvNo;
	}
	public void setTxtCvvNo(WebElement txtCvvNo) {
		TxtCvvNo = txtCvvNo;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public void setBtnBookNow(WebElement btnBookNow) {
		this.btnBookNow = btnBookNow;
	}
	public WebElement getTxtBookingHotel() {
		return txtBookingHotel;
	}
	public void setTxtBookingHotel(WebElement txtBookingHotel) {
		this.txtBookingHotel = txtBookingHotel;
	}
	public WebElement getTexterrorFirstname() {
		return texterrorFirstname;
	}
	public void setTexterrorFirstname(WebElement texterrorFirstname) {
		this.texterrorFirstname = texterrorFirstname;
	}
	public WebElement getTexterrorlastname() {
		return texterrorlastname;
	}
	public void setTexterrorlastname(WebElement texterrorlastname) {
		this.texterrorlastname = texterrorlastname;
	}
	public WebElement getTexterroraddress() {
		return texterroraddress;
	}
	public void setTexterroraddress(WebElement texterroraddress) {
		this.texterroraddress = texterroraddress;
	}
	public WebElement getTexterrorcardno() {
		return texterrorcardno;
	}
	public void setTexterrorcardno(WebElement texterrorcardno) {
		this.texterrorcardno = texterrorcardno;
	}
	public WebElement getTexterrorcardtype() {
		return texterrorcardtype;
	}
	public void setTexterrorcardtype(WebElement texterrorcardtype) {
		this.texterrorcardtype = texterrorcardtype;
	}
	public WebElement getTexterrorexpirydate() {
		return texterrorexpirydate;
	}
	public void setTexterrorexpirydate(WebElement texterrorexpirydate) {
		this.texterrorexpirydate = texterrorexpirydate;
	}
	public WebElement getTexterrorcvvno() {
		return texterrorcvvno;
	}
	public void setTexterrorcvvno(WebElement texterrorcvvno) {
		this.texterrorcvvno = texterrorcvvno;
	}
	public void BookaHotel(String FirstName,String LastName,String BillingAddress,String CcNum,String
			CreditCardType,String ExpiryMonth,String ExpiryYear, String CVVNO,DataTable datatable) throws InterruptedException  {
		Type(getTxtFirstName(),FirstName);
		Type(getTxtLastName(),LastName);
		Type(getTxtBillingAddress(),BillingAddress);
		Type(getTxtCreditCardNo(), CcNum);
		selectOptionByText(getTxtCreditCardType(), CreditCardType);
		Type(getTxtMonth(),ExpiryMonth);
		Type(getTxtYear(),ExpiryYear);
		Type(getTxtCvvNo(),CVVNO);
		click(getBtnBookNow());
		java.lang.Thread.sleep(7000);

	}
	public void BookHotelWithoutfileds() {

		click(getBtnBookNow());



	}
}
