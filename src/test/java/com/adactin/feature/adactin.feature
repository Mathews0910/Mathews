Feature: Adactin Application 


		
		
		
@signIn 
Scenario: SignIN  in Adactin Application 
	Given  User has to Launch the Application 
	When User has to enter the user name  "matt"
    Then User has to Enter the Password "123" 
	And User has to Click the Login Button 
	
	
	
	
@HotelSearch 
Scenario: Entering the Details for Hotel Search 
	When Select the locations from the DropDown 
	Then Select the Hotels from the Dropdown 
	And Select the Type of Room from the Drodown 
	And Select the Number of Room from the DropDown 
	And User has to Enter the Check IN Date 
	And User has to Enter the Check Out Date 
	And User has to Enter the Details of Adult Per Room 
	And User has to Enter the Details of Child Per Room 
	Then User has to Click on Search Button 
	
@confirmHotel 
Scenario: Select the  Hotel 
	When Select the Hotel 
	Then User has to click on the Continue Button 
	
@enterPersonalDetails 
Scenario: User has to Enter the Personal Details 
	When : User has to Enter the FirstName 
	And : User has to Enter the Last Name 
	And : User has to Enter the Billing Address 
	And : User has to Enter the CreditCard Number 
	And : User has to Select the CardType from dropDown 
	And : User has to Enter the Card Expiry date and Month and CVV 
	Then : User has to Click on Book Now Button 
	
	
	
	
	
	
	
	
	
	    