package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	
	private static WebDriver driver;

		@FindBy(id = "username")
		private WebElement username;
		
	
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="login")
		private WebElement loginbtn;
		
		public LoginClass(WebDriver driv) {
        this.driver = driv;
        PageFactory.initElements(driver, this);
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
}
