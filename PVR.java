class PVR{
	
 public static double getMoviePricebyName(String movieName){
	 
	 double moviePrice = 0.0;
	 System.out.println("getMoviePricebyName started");
	 
   if(movieName == "Dharmadha daiva"){
    moviePrice = 280.80;
	return moviePrice;
   }
  
  else if(movieName == "Love li"){
    moviePrice = 430.00;
	return moviePrice;
   }
  
  else if(movieName == "Koti"){
	  moviePrice = 300.00;
	  return moviePrice;
   }
  
  else if(movieName == "Circus"){
	  moviePrice = 200.00;
	  return moviePrice;
  }
  
  else if(movieName == "Hostel Hudugru"){
	  moviePrice = 400.98;
	  return moviePrice;
  }
  
  else if(movieName == "Saptha Sagaradhache ello"){
	  moviePrice = 507.00;
	  return moviePrice;
  }
  
  else if(movieName == "Saptha Sagaradhache ello 2"){
	  moviePrice = 580.00;
	  return moviePrice;
  }
  
  else if(movieName == "Kalki"){
	  moviePrice = 300.00;
	  return moviePrice;
  }
  
  else if(movieName == "Bahubali 1"){
	  moviePrice = 400.00;
	  return moviePrice;
  }
  
  else if(movieName == "Kateera"){
	  moviePrice = 309.98;
	  return moviePrice;
  }
  
  else if(movieName == "KGF 1") {
	  moviePrice = 300.45;
	  return moviePrice;
  }
  
  else if(movieName == "KGF 2"){
	  moviePrice = 350.00;
	  return moviePrice;
  }
  
  else if(movieName == "Kantara"){
	  moviePrice = 430.34;
	  return moviePrice;
  }
  
  else if(movieName == "Mr Madhimaye"){
	  moviePrice = 400.00;
	  return moviePrice;
  }
  
  else if(movieName == "Harata"){
	  moviePrice = 399.45;
	  return moviePrice;
  }
  
  else if(movieName == "Adhipatra"){
	  moviePrice = 300.45;
	  return moviePrice;
  }
  
  else if(movieName == "Kalpana 1"){
	  moviePrice = 492.45;
	  return moviePrice;
  }
  
  else if(movieName == "Kalpana 2"){
	  moviePrice = 390.45;
	  return moviePrice;
  }
  
  else if(movieName == "Kanchana"){
	  moviePrice = 540.45;
	  return moviePrice;
  }
  
  else if(movieName == "Kanchana 2"){
	  moviePrice = 599.45;
	  return moviePrice;
  }
  
  else{
  System.out.println(movieName + "Not found");
  }
  
  System.out.println("getMoviePricebyName Ended");
  return moviePrice;
  
  }
  
}

// 7356068123