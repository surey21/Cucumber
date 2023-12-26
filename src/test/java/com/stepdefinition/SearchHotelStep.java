package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SearchHotelStep {



	PageObjectManager pom = new PageObjectManager();

	@Then("User should Search a hotel with {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSearchAHotelWithAnd(String Location,String Hotels,String RoomType,String noOfRooms,String
			CheckInDate,String CheckOutDate,String AdultsPerRoom,String ChildrenPerRoom) {

		pom.getSearchHotelPage().SearchHotel(Location, Hotels, RoomType, noOfRooms, CheckInDate, CheckOutDate,
				AdultsPerRoom, ChildrenPerRoom);

	}

	@Then("User should Search a hotel with {string},{string},{string},{string} and {string}")
	public void userShouldSearchAHotelWithAnd(String Location,String noOfRooms,String CheckInDate,String
			CheckOutDate,String AdultsPerRoom) {
		pom.getSearchHotelPage().MandatoryFileds(Location, noOfRooms, CheckInDate, CheckOutDate, AdultsPerRoom);

	}

	@Then("User should Search a hotel with invalid date {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSearchAHotelWithInvalidDateAnd(String Location,String Hotels,String RoomType,String noOfRooms,String
			CheckInDate,String CheckOutDate,String AdultsPerRoom,String ChildrenPerRoom) {
		pom.getSearchHotelPage().SearchHotelwithoutfileds(Location, Hotels, RoomType, noOfRooms, CheckInDate, CheckOutDate, AdultsPerRoom, ChildrenPerRoom);

	}
	@Then("Verify after Search Hotels error date msg  {string} , {string}")
	public void verifyAfterSearchHotelsErrorDateMsg(String expectederrormsg, String expectederrormsg2) {

		expectederrormsg="Check-In Date shall be before than Check-Out Date";
		expectederrormsg2="Check-Out Date shall be after than Check-In Date";

		WebElement txtcheckInDate = pom.getSearchHotelPage().getGeterrorcheckin();
		String text = txtcheckInDate.getText();
		System.out.println(text);
		Assert.assertEquals("verify message",expectederrormsg, text);
		WebElement txtcheckOutDate = pom.getSearchHotelPage().getGeterrorcheckout();
		String text2 = txtcheckOutDate.getText();
		System.out.println(text2);
		Assert.assertEquals("verify message", expectederrormsg2,text2);
	}

	@Then("User should perform Search a hotel without any credentials")
	public void userShouldPerformSearchAHotelWithoutAnyCredentials() {
		pom.getSearchHotelPage().SearchHotelWithoutFileds();
	}

	@Then("Verify after Search Hotels error select files msg {string}")
	public void verifyAfterSearchHotelsErrorSelectFilesMsg(String expectederrormsg) {

		expectederrormsg="Please Select a Location";		
		WebElement txtlocationmsg = pom.getSearchHotelPage().getTxtLocationError();
		String textlocation = txtlocationmsg.getText();
		System.out.println(textlocation);
		Assert.assertEquals("verify message", expectederrormsg, textlocation);
	}






}
