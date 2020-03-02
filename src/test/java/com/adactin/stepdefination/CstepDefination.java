package com.adactin.stepdefination;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.pomManager;
import com.adactin.runner.RunnerClass;

import adactin.baseclass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CstepDefination extends BaseClass{
		
	public static WebDriver driverr= RunnerClass.driver ;
	public static pomManager pm = new pomManager(driverr);
	
@When("Select the Hotel")
public void select_the_Hotel() {
	actionss(pm.confirmationmanage().getConfirmRadioButton(), "click");
		
}

@Then("User has to click on the Continue Button")
public void user_has_to_click_on_the_Continue_Button() {
    
	actionss(pm.confirmationmanage().getContinue(), "Click");
}

@When(": User has to Enter the FirstName")
public void user_has_to_Enter_the_FirstName() {
   getInput(pm.confirmationmanage().getFirstName(), "Mathew");
	
}

@When(": User has to Enter the Last Name")
public void user_has_to_Enter_the_Last_Name() {
    getInput(pm.confirmationmanage().getLastName(), "Praveen");
}

@When(": User has to Enter the Billing Address")
public void user_has_to_Enter_the_Billing_Address() {
   getInput(pm.confirmationmanage().getAddress(), "No 123, Abc street,Def Nagar");
}

@When(": User has to Enter the CreditCard Number")
public void user_has_to_Enter_the_CreditCard_Number() {
    getInput(pm.confirmationmanage().getCcNumber(), "1111222233334444");
}

@When(": User has to Select the CardType from dropDown")
public void user_has_to_Select_the_CardType_from_dropDown() {
   dropdown("SelectBytext", "VISA", pm.confirmationmanage().getCcType());
}

@When(": User has to Enter the Card Expiry date and Month and CVV")
public void user_has_to_Enter_the_Card_Expiry_date_and_Month_and_CVV() {
    
	dropdown("selectbyText", "October", pm.confirmationmanage().getCcMonth());
    dropdown("Selectbyvalue", "2022", pm.confirmationmanage().getCcYear());
    getInput(pm.confirmationmanage().getCvv(), "123");
    
    

}

@Then(": User has to Click on Book Now Button")
public void user_has_to_Click_on_Book_Now_Button() {
   actionss(pm.confirmationmanage().getBookNow(), "click");
	
}

}
