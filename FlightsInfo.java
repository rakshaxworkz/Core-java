class FlightsInfo{
	
 public static double getFlightsPricebyDestination(String flightDestinationName , int quantity){
	 
	 double flightPrice = 0.0;
	 System.out.println("getFlightsPricebyDestination started");
	 
   if(flightDestinationName == "Mumbai")
	return flightPrice = 6700.80 * quantity;
  
  else if(flightDestinationName == "Pune")
	return flightPrice = 5740.00 * quantity;
  
  else if(flightDestinationName == "Jaipur")
	  return flightPrice = 8000.00 * quantity;
  
  else if(flightDestinationName == "Patna")
	  return flightPrice = 8200.00 * quantity;
  
  else if(flightDestinationName == "Kolkatta")
	  return flightPrice = 4000.98 * quantity;
  
  else if(flightDestinationName == "Lucknow")
	  return flightPrice = 12077.00 * quantity;
  
  else if(flightDestinationName == "Chennai")
	  return flightPrice = 13000.00 * quantity;
  
  else if(flightDestinationName == "Kerala")
	  return flightPrice = 3000.00 * quantity;
  
  else if(flightDestinationName == "Dubai")
	  return flightPrice = 16000.00 * quantity;
  
  else if(flightDestinationName == "USA")
	  return flightPrice = 39999.98 * quantity;
  
  else if(flightDestinationName == "Mangalore") 
	  return flightPrice = 3000.45 * quantity;
  
  else if(flightDestinationName == "Shivamogga")
	  return flightPrice = 3000.00 * quantity;
  
  else if(flightDestinationName == "Hubli")
	  return flightPrice = 3500.34 * quantity;
  
  else if(flightDestinationName == "Goa")
	  return flightPrice = 4500.00 * quantity;
  
  else if(flightDestinationName == "Paris")
	  return flightPrice = 30999.45 * quantity;
  
  else if(flightDestinationName == "Thailand")
	  return flightPrice = 15000.45 * quantity;
  
  else if(flightDestinationName == "South Korea")
	  return flightPrice = 49999.45 * quantity;
  
  else if(flightDestinationName == "China")
	  return flightPrice = 39000.45 * quantity;
  
  else if(flightDestinationName == "Japan")
	  return flightPrice = 54000.45 * quantity;
  
  else if(flightDestinationName == "South Korea")
	  return flightPrice = 59999.45 * quantity;
  
  else{
  System.out.println(flightDestinationName + "Not found");
  }
  
  System.out.println("getFlightsPricebyDestination Ended");
  return flightPrice;
  
  }
  
}