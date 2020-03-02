package com.adactin.Manager;

import java.io.IOException;

public class Administrator {
private Administrator() {

}	

public ConfigurationManager getconfi() throws IOException {
	ConfigurationManager cf = new ConfigurationManager();	
    return cf;
}	
	
public static Administrator getManager() {
   Administrator admin = new Administrator();
   return admin;
}
}
