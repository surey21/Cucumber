package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class BookHotelStep {



	PageObjectManager pom = new PageObjectManager();


	@Then("User should book hotel {string},{string} and {string}")
	public void userShouldBookHotelAnd(String FirstName, String LastName, String BillingAddress, io.cucumber.datatable.DataTable dataTable) throws InterruptedException
	{

		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> map = maps.get(0);
		String CreditCardNo = map.get("CcNum");
		String CreditCardType = map.get("CreditCardType");
		String ExpiryMonth = map.get("ExpiryMonth");
		String ExpiryYear = map.get("ExpiryYear");
		String CVVNO = map.get("CVVNO");
		pom.getBookHotelPage().BookaHotel(FirstName, LastName, BillingAddress, CreditCardNo, CreditCardType, ExpiryMonth, ExpiryYear, CVVNO, dataTable);

	}
	@Then("User should perform book a hotel without any details")
	public void userShouldPerformBookAHotelWithoutAnyDetails() {

		pom.getBookHotelPage().BookHotelWithoutfileds();


	}
	@Then("User Should verify after book hotel error with msg {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterBookHotelErrorWithMsgAnd(String expectederrormsgFNamw, String expectederrormsgLName, String errorPleaseEnteryourAddress, String errorPleaseEnteryourCreditCardNumber, String errorPleaseSelectCreditCardType, String errorPleaseSelectyourCreditCardExpiryMonth, String errorEnteryourCreditCardCVVNumber) {

		expectederrormsgFNamw="Please Enter your First Name";
		expectederrormsgLName="Please Enter you Last Name";
		errorPleaseEnteryourAddress="Please Enter your Address";
		errorPleaseEnteryourCreditCardNumber="Please Enter your 16 Digit Credit Card Number";
		errorPleaseSelectCreditCardType="Please Select your Credit Card Type";
		errorPleaseSelectyourCreditCardExpiryMonth="Please Select your Credit Card Expiry Month";
		errorEnteryourCreditCardCVVNumber="Please Enter your Credit Card CVV Number";

		WebElement txtEnterFirstName = pom.getBookHotelPage().getTexterrorFirstname();
		String fname = txtEnterFirstName.getText();
		System.out.println(fname);
		//Assert.assertEquals("verify msg", expectederrormsgFNamw, fname);

		WebElement txtEnterLastName = pom.getBookHotelPage().getTexterrorlastname();
		String lname = txtEnterLastName.getText();
		System.out.println(lname);
		//Assert.assertEquals("verify message", expectederrormsgLName, lname);

		WebElement txtEnterAddressMsg = pom.getBookHotelPage().getTexterroraddress();
		String address = txtEnterAddressMsg.getText();
		System.out.println(address);
		//Assert.assertEquals("verify message", errorPleaseEnteryourAddress, address);

		WebElement txtEnterCardNoMsg = pom.getBookHotelPage().getTexterrorcardno();
		String cardno = txtEnterCardNoMsg.getText();
		System.out.println(cardno);
		//Assert.assertEquals("verify message", errorPleaseEnteryourCreditCardNumber, cardno);

		WebElement txtEnterCardTypeMsg = pom.getBookHotelPage().getTexterrorcardtype();
		String cardType = txtEnterCardTypeMsg.getText();
		System.out.println(cardType);
		//Assert.assertEquals("verify message", errorPleaseSelectCreditCardType, cardType);

		WebElement txtEnterExpiryMsg = pom.getBookHotelPage().getTexterrorexpirydate();
		String expiryMsg = txtEnterExpiryMsg.getText();
		System.out.println(expiryMsg);
		//Assert.assertEquals("verify message",errorPleaseSelectyourCreditCardExpiryMonth , expiryMsg);

		WebElement txtEnterCVVNoMsg = pom.getBookHotelPage().getTexterrorcvvno();
		String ccvNoMsg = txtEnterCVVNoMsg.getText();
		System.out.println(ccvNoMsg);
		//Assert.assertEquals(errorEnteryourCreditCardCVVNumber, ccvNoMsg);
	}









}
