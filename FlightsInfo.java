class FlightsInfo{
	
 public static double getFlightsPricebyDestination(String flightDestinationName){
	 
	 double flightPrice = 0.0;
	 System.out.println("getFlightsPricebyDestination started");
	 
   if(flightDestinationName == "Mumbai"){
    flightPrice = 6700.80;
	return flightPrice;
   }
  
  else if(flightDestinationName == "Pune"){
    flightPrice = 5740.00;
	return flightPrice;
   }
  
  else if(flightDestinationName == "Jaipur"){
	  flightPrice = 8000.00;
	  return flightPrice;
   }
  
  else if(flightDestinationName == "Patna"){
	  flightPrice = 8200.00;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Kolkatta"){
	  flightPrice = 4000.98;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Lucknow"){
	  flightPrice = 12077.00;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Chennai"){
	  flightPrice = 13000.00;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Kerala"){
	  flightPrice = 3000.00;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Dubai"){
	  flightPrice = 16000.00;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "USA"){
	  flightPrice = 39999.98;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Mangalore") {
	  flightPrice = 3000.45;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Shivamogga"){
	  flightPrice = 3000.00;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Hubli"){
	  flightPrice = 3500.34;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Goa"){
	  flightPrice = 4500.00;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Paris"){
	  flightPrice = 30999.45;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Thailand"){
	  flightPrice = 15000.45;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "South Korea"){
	  flightPrice = 49999.45;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "China"){
	  flightPrice = 39000.45;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "Japan"){
	  flightPrice = 54000.45;
	  return flightPrice;
  }
  
  else if(flightDestinationName == "South Korea"){
	  flightPrice = 59999.45;
	  return flightPrice;
  }
  
  else{
  System.out.println(flightDestinationName + "Not found");
  }
  
  System.out.println("getFlightsPricebyDestination Ended");
  return flightPrice;
  
  }
  
}