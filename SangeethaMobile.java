class SangeethaMobile{
	
 public static double getMobilePricebyMobileBrand(String mobileBrandName , int quantity){
	 
	 double mobilePrice = 0.0;
	 System.out.println("getMobilePricebyMobileBrand started");
	 
   if(mobileBrandName == "Redmi 5")
	return mobilePrice = 15000.00 * quantity;
   
  
  else if(mobileBrandName == "I Phone 12 Pro")
	return mobilePrice = 89000.00 * quantity;
  
  else if(mobileBrandName == "Vivo Y100")
	  return mobilePrice = 27000.00 * quantity;
  
  else if(mobileBrandName == "Oppo")
	  return mobilePrice = 25000 * quantity;
  
  else if(mobileBrandName == "Redmi Note 8 pro")
	  return mobilePrice = 18000.98 * quantity;
  
  else if(mobileBrandName == "Realmi narzo")
	  return mobilePrice = 18977 * quantity;
  
  else if(mobileBrandName == "Samsung S22 FE")
	  return mobilePrice = 39000.00 * quantity;
  
  else if(mobileBrandName == "Nothing 2A")
	  return mobilePrice = 28000.00 * quantity;
  
  else if(mobileBrandName == "One Plus")
	  return mobilePrice = 45000.00 * quantity;
  
  else if(mobileBrandName == "Redmi 9 prime")
	  return mobilePrice = 19999.98 * quantity;
  
  else if(mobileBrandName == "Redmi 8") 
	  return mobilePrice = 17000.45 * quantity;
  
  else if(mobileBrandName == "Redmi 7 prime")
	  return mobilePrice = 16000.00 * quantity;
  
  else if(mobileBrandName == "Intel")
	  return mobilePrice = 10099.34 * quantity;
  
  else if(mobileBrandName == "Motorola")
	  return mobilePrice = 14999.00 * quantity;
  
  else if(mobileBrandName == "IQ00")
	  return mobilePrice = 18000.45 * quantity;
  
  else{
  System.out.println(mobileBrandName + "Not found");
  }
  
  System.out.println("getMobilePricebyMobileBrand Ended");
  return mobilePrice;
  
  }
  
}