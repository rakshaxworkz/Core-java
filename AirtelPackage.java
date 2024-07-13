class AirtelPackage{
	
 public static double getAirtelPricebyPlans(String airtelPlanName){
	 
	 double airtelPrice = 0.0;
	 System.out.println("getAirtelPricebyPlans started");
	 
   if(airtelPlanName == "28 Days with 1GB/day"){
    airtelPrice = 249.00;
	return airtelPrice;
   }
  
  else if(airtelPlanName == "28 Days with 1.5GB/day"){
    airtelPrice = 299.00;
	return airtelPrice;
   }
  
  else if(airtelPlanName == "28 Days with 2GB/day"){
	  airtelPrice = 349.00;
	  return airtelPrice;
   }
  
  else if(airtelPlanName == "56 Days with 1GB/day"){
	  airtelPrice = 549.09;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "56 Days with 1.5GB/day"){
	  airtelPrice = 599.98;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "56 Days with 2GB/day"){
	  airtelPrice = 629.45;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "72 Days with 1GB/day"){
	  airtelPrice = 799.00;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "72 Days with 1.5GB/day"){
	  airtelPrice = 849.00;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "72 Days with 2GB/day"){
	  airtelPrice = 899.78;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "6 months with 1GB/day"){
	  airtelPrice = 1099.98;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "6 months with 1.5GB/day") {
	  airtelPrice = 1199.45;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "6 months with 2GB/day"){
	  airtelPrice = 1299.00;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "1 year with 1GB/day"){
	  airtelPrice = 3499.34;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "1 year with 1.5GB/day"){
	  airtelPrice = 3699.00;
	  return airtelPrice;
  }
  
  else if(airtelPlanName == "1 year with 2GB/day"){
	  airtelPrice = 3999.45;
	  return airtelPrice;
  }
  
  else{
  System.out.println(airtelPlanName + "Not found");
  }
  
  System.out.println("getAirtelPricebyPlans Ended");
  return airtelPrice;
  
  }
  
}