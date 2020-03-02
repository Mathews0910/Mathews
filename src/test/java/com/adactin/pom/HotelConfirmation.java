package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelConfirmation {
	private WebDriver driverrr;
	
@FindBy (id = "radiobutton_0")
private WebElement confirmRadioButton;

@FindBy(id = "continue")
private WebElement continuee;

@FindBy(id= "first_name")
private WebElement firstName;

@FindBy(id= "last_name")
private WebElement lastName;



@FindBy(id= "address")
private WebElement address;

@FindBy(id = "cc_num")
private WebElement ccNumber;

@FindBy(id="cc_type")
private WebElement ccType;

@FindBy(id = "cc_exp_month")
private WebElement ccMonth;

@FindBy(id="cc_exp_year")
private WebElement ccYear;

@FindBy(id = "cc_cvv")
private WebElement cvv;


@FindBy(id = "book_now")
private WebElement bookNow;

public HotelConfirmation(WebDriver driverr) {
this.driverrr= driverr;
PageFactory.initElements(driverrr, this);
}


public WebElement getConfirmRadioButton() {
	return confirmRadioButton;
}


public WebElement getContinue() {
	return continuee;
}


public WebElement getFirstName() {
	return firstName;
}


public WebElement getLastName() {
	return lastName;
}


public WebElement getAddress() {
	return address;
}


public WebElement getCcNumber() {
	return ccNumber;
}


public WebElement getCcType() {
	return ccType;
}


public WebElement getCcMonth() {
	return ccMonth;
}


public WebElement getCcYear() {
	return ccYear;
}


public WebElement getCvv() {
	return cvv;
}


public WebElement getBookNow() {
	return bookNow;
}






}
