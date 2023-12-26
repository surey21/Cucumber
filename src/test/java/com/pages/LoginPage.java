package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass1;


public class LoginPage extends BaseClass1   {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtuserName;

	@FindBy(id="password")
	private WebElement TxtPassword;

	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(xpath="//input[@value='Hello Suresh21!']")
	private WebElement textlogin;

    @FindBy(xpath="//div[@class='auth_error']")
	private WebElement texterrorlogin;



	public WebElement getTextlogin() {
		return textlogin;
	}


	public WebElement getTexterrorlogin() {
		return texterrorlogin;
	}


	public WebElement getTxtuserName() {
		return txtuserName;
	}

	public WebElement getTxtPassword() {
		return TxtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}




	public void loginPage(String userName, String password) {

		Type(getTxtuserName(), userName);
		Type(getTxtPassword(), password);
		click(getBtnLogin());

	}

	public void LoginPageEnter(String userName,String password) throws AWTException {

		Type(getTxtuserName(), userName);
		Type(getTxtPassword(), password);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


	}
	
	public void LoginMsg() {
		getText(getTextlogin());

	}

	public void LoginPageError() {

		
		click(getBtnLogin());
		getText(getTexterrorlogin());

	}



}

