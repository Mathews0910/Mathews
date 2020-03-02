package com.adactin.stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.Manager.Administrator;
import com.adactin.pom.pomManager;
import com.adactin.runner.RunnerClass;

import adactin.baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Astepdefination extends BaseClass {
	
	public static WebDriver driv = RunnerClass.driver;
	public static pomManager pm =new pomManager(driv);

	@Given("User has to Launch the Application")
	public void user_has_to_Launch_the_Application() throws IOException {

		WebSite(Administrator.getManager().getconfi().url());

	}
	
	@When("User has to enter the user name  {string}")
	public void user_has_to_enter_the_user_name(String string) {
		
	}

	@Then("User has to Enter the Password {string}")
	public void user_has_to_Enter_the_Password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	

	@When("User has to enter the user name  {string} in the user name")
	public void user_has_to_enter_the_user_name_in_the_user_name(String string) {
		getInput(pm.loginmanage().getUsername(), string);
		
	}

	
	@When("User has to Enter the Password {string} in the password")
	public void user_has_to_Enter_the_Password_in_the_password(String string) {
		
		
	}




	/*@When("User has to enter the user name")
	public void user_has_to_enter_the_user_name() {

		getInput(pm.loginmanage().getUsername(), "manomala");

	}

	@Then("User has to Enter the Password")
	public void user_has_to_Enter_the_Password() {
		getInput(pm.loginmanage().getPassword(), "Maran@3718");;

	}*/

	@Then("User has to Click the Login Button")
	public void user_has_to_Click_the_Login_Button() {
		actionss(pm.loginmanage().getLoginbtn(), "Click");

		
	}

	@After
	public void matt(Scenario scene) throws IOException {
		String scenarioname = scene.getName();
		Status scenariostatus = scene.getStatus();
		  System.out.println(scenarioname+"  "+scenariostatus);
				  
		if (scene.isFailed()) {
			Takescreenshotzz("C:\\Users\\IMMANUEL ARUMUGAM\\eclipse-workspace\\CucumberProject\\screenshot"+scenarioname+".png");
		}

  
}	
}