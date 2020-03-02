package com.adactin.pom;

import org.openqa.selenium.WebDriver;
public class pomManager {
	
	
	private WebDriver driverthis;
	private LoginClass lc;
	private SearchHotel sh;
	private HotelConfirmation hc;
	public pomManager(WebDriver mattdriv) {
	this.driverthis = mattdriv;
	
	}


	 public LoginClass loginmanage() {
		 lc = new LoginClass(driverthis);
		 return lc;
	}
	
	 public SearchHotel searchhotelmanage() {
		 sh = new  SearchHotel(driverthis);
		 return sh;
	}
	
	 public HotelConfirmation confirmationmanage() {
		 hc = new HotelConfirmation(driverthis);
		 return hc;
	}
	 

}
		 
	
	
	
		 
		 

	
