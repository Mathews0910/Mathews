package com.adactin.Manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ConfigurationManager {
public static  Properties prop;
	
public ConfigurationManager() throws IOException {

	File F = new File("C:\\Users\\IMMANUEL ARUMUGAM\\eclipse-workspace\\CucumberProject\\src\\test\\java\\com\\adactin\\configurationReader\\configuration.properties");
    FileInputStream fis = new FileInputStream(F);
	prop = new Properties();
	prop.load(fis);
	

}	
public String Manager() {
   String browser = prop.getProperty("browser");
  return browser;

}	
public String url() {
  String website = prop.getProperty("website");
  return website;
}

}
