package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import com.BaseClass.BaseClass1;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * 
 * @author Suresh
 *Description Generates Login page
 *Date 08-07-2022
 *
 */
public class LoginPageStep extends BaseClass1 {
	
	PageObjectManager pom = new PageObjectManager();

	@Given("User should entered in adactin hotel home page")
	public void userShouldEnteredInAdactinHotelHomePage() throws IOException {
		

	}

	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String userName, String password) {
		pom.getLoginPage().loginPage(userName, password);
	}

	@When("User should perform login {string},{string} with ENTER key")
	public void userShouldPerformLoginWithENTERKey(String userName, String password) throws AWTException {
		pom.getLoginPage().LoginPageEnter(userName,password);
	}

	@Then("Verify after Loginerror with invalid credentials  {string}")
	public void verifyAfterLoginerrorWithInvalidCredentials(String expectederrormsg) throws AWTException {
		expectederrormsg="Invalid Login details or Your Password might have expired.";
		WebElement loginError = pom.getLoginPage().getTexterrorlogin();
		String actualError = loginError.getText();
		System.out.println(actualError);
		boolean contains = actualError.contains(expectederrormsg);
		Assert.assertTrue(contains);

	}

}
