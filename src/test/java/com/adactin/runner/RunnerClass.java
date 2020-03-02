package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Manager.Administrator;

import adactin.baseclass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
				 glue = "com\\adactin\\stepdefination",
				 plugin = "html:Reports",
				 monochrome = true)
public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Throwable {
		driver = BaseClass.getDriver(Administrator.getManager().getconfi().Manager());

	}

}
