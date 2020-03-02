package com.adactin.stepdefination;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.pomManager;
import com.adactin.runner.RunnerClass;

import adactin.baseclass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bstepdefination extends BaseClass {

	public static WebDriver drive = RunnerClass.driver;
	public static pomManager pm = new pomManager(drive);

	@When("Select the locations from the DropDown")
	public void select_the_locations_from_the_DropDown() {
		dropdown("Selectbytext", "Sydney", pm.searchhotelmanage().getLocation());

	}

	@When("Select the Hotels from the Dropdown")
	public void select_the_Hotels_from_the_Dropdown() {
    dropdown("Selectbytext", "Hotel Creek",pm.searchhotelmanage().getHotels());
	}

	@When("Select the Type of Room from the Drodown")
	public void select_the_Type_of_Room_from_the_Drodown() {
		dropdown("selectbyindex", "2", pm.searchhotelmanage().getRoomtype());
	}

	@When("Select the Number of Room from the DropDown")
	public void select_the_Number_of_Room_from_the_DropDown() {
		dropdown("selectbyvalue", "245", pm.searchhotelmanage().getRoomno());

	}

	@When("User has to Enter the Check IN Date")
	public void user_has_to_Enter_the_Check_IN_Date() {
		pm.searchhotelmanage().getCheckInDate().clear();
		getInput(pm.searchhotelmanage().getCheckInDate(), "23/02/2020");

	}

	@When("User has to Enter the Check Out Date")
	public void user_has_to_Enter_the_Check_Out_Date() {
		pm.searchhotelmanage().getCheckOutDate().clear();
		getInput(pm.searchhotelmanage().getCheckOutDate(), "25/02/2020");
	}

	@When("User has to Enter the Details of Adult Per Room")
	public void user_has_to_Enter_the_Details_of_Adult_Per_Room() {
		dropdown("selectbyvalue", "2", pm.searchhotelmanage().getAdultroom());
	}

	@When("User has to Enter the Details of Child Per Room")
	public void user_has_to_Enter_the_Details_of_Child_Per_Room() {
		dropdown("selectbyvalue", "2", pm.searchhotelmanage().getChildRoom());

	}

	@Then("User has to Click on Search Button")
	public void user_has_to_Click_on_Search_Button() {
		actionss(pm.searchhotelmanage().getSubmit(), "click");

	}

}
