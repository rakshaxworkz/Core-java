class SangeethaMobile{
	
 public static double getMobilePricebyMobileBrand(String mobileBrandName){
	 
	 double mobilePrice = 0.0;
	 System.out.println("getMobilePricebyMobileBrand started");
	 
   if(mobileBrandName == "Redmi 5"){
    mobilePrice = 15000.00;
	return mobilePrice;
   }
  
  else if(mobileBrandName == "I Phone 12 Pro"){
    mobilePrice = 89000.00;
	return mobilePrice;
   }
  
  else if(mobileBrandName == "Vivo Y100"){
	  mobilePrice = 27000.00;
	  return mobilePrice;
   }
  
  else if(mobileBrandName == "Oppo"){
	  mobilePrice = 25000;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Redmi Note 8 pro"){
	  mobilePrice = 18000.98;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Realmi narzo"){
	  mobilePrice = 18977;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Samsung S22 FE"){
	  mobilePrice = 39000.00;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Nothing 2A"){
	  mobilePrice = 28000.00;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "One Plus"){
	  mobilePrice = 45000.00;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Redmi 9 prime"){
	  mobilePrice = 19999.98;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Redmi 8") {
	  mobilePrice = 17000.45;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Redmi 7 prime"){
	  mobilePrice = 16000.00;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Intel"){
	  mobilePrice = 10099.34;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "Motorola"){
	  mobilePrice = 14999.00;
	  return mobilePrice;
  }
  
  else if(mobileBrandName == "IQ00"){
	  mobilePrice = 18000.45;
	  return mobilePrice;
  }
  
  else{
  System.out.println(mobileBrandName + "Not found");
  }
  
  System.out.println("getMobilePricebyMobileBrand Ended");
  return mobilePrice;
  
  }
  
}