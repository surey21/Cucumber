package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass1;

public class SelectHotelPage  extends BaseClass1 {
	public SelectHotelPage() {
	PageFactory.initElements(driver, this);
	}


	@FindBy(id="radiobutton_1")
	private WebElement btnRadioButton;

	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement checkSelectHotel;

	

	public void setCheckSelectHotel(WebElement checkSelectHotel) {
		this.checkSelectHotel = checkSelectHotel;
	}


	@FindBy(xpath="//label[@id='radiobutton_span']")
	private WebElement texterrorselect;

	public WebElement getBtnRadioButton() {
		return btnRadioButton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTexterrorselect() {
		return texterrorselect;
	}

	public void setTexterrorselect(WebElement texterrorselect) {
		this.texterrorselect = texterrorselect;
	}



	public void setBtnRadioButton(WebElement btnRadioButton) {
		this.btnRadioButton = btnRadioButton;
	}

	public void setBtnContinue(WebElement btnContinue) {
		this.btnContinue = btnContinue;
	}

	// Select hotel and continue 
	public void SelectHotel() {
		click(getBtnRadioButton());
		click(getBtnContinue());
	}

	public void SelectHotelwithoutSelect() {
		click(getBtnContinue());
		

	}

	public WebElement getCheckSelectHotel() {
		return checkSelectHotel;
	}

}
