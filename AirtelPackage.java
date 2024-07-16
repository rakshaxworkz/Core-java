class AirtelPackage{
	
 public static double getAirtelPricebyPlans(String airtelPlanName){
	 
	 double airtelPrice = 0.0;
	 System.out.println("getAirtelPricebyPlans started");
	 
   if(airtelPlanName == "28 Days with 1GB/day")  
     return airtelPrice = 249.0;
  
  else if(airtelPlanName == "28 Days with 1.5GB/day")
	return airtelPrice = 299.00;
  
  else if(airtelPlanName == "28 Days with 2GB/day")
	 return airtelPrice = 349.00;
  
  else if(airtelPlanName == "56 Days with 1GB/day")
	  return  airtelPrice = 549.09;
  
  else if(airtelPlanName == "56 Days with 1.5GB/day")
	  return airtelPrice = 599.98;
  
  else if(airtelPlanName == "56 Days with 2GB/day")
	  return airtelPrice = 629.45;
  
  else if(airtelPlanName == "72 Days with 1GB/day")
	  return airtelPrice = 799.00;
  
  else if(airtelPlanName == "72 Days with 1.5GB/day")
	  return airtelPrice = 849.00;
  
  else if(airtelPlanName == "72 Days with 2GB/day")
	  return airtelPrice = 899.78;
  
  else if(airtelPlanName == "6 months with 1GB/day")
	  return airtelPrice = 1099.98;
  
  else if(airtelPlanName == "6 months with 1.5GB/day") 
	  return airtelPrice = 1199.45;
  
  else if(airtelPlanName == "6 months with 2GB/day")
	  return airtelPrice = 1299.00;
  
  else if(airtelPlanName == "1 year with 1GB/day")
	  return airtelPrice = 3499.34;
  
  else if(airtelPlanName == "1 year with 1.5GB/day")
	  return airtelPrice = 3699.00;
  
  else if(airtelPlanName == "1 year with 2GB/day")
	  return airtelPrice = 3999.45;
  
  else{
  System.out.println(airtelPlanName + "Not found");
  }
  
  System.out.println("getAirtelPricebyPlans Ended");
  return airtelPrice;
  
  }
  
}