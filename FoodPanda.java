class FoodPanda{
	
 public static double getFoodPricebyName(String foodName){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Vegetable Pizza"){
    foodPrice = 250.80;
	return foodPrice;
   }
  
  else if(foodName == "Vegetable Upma"){
    foodPrice = 60.00;
	return foodPrice;
   }
  
  else if(foodName == "Vegetable Sandwich"){
	  foodPrice = 80.00;
	  return foodPrice;
   }
  
  else if(foodName == "Methi Malai Matar"){
	  foodPrice = 160.00;
	  return foodPrice;
  }
  
  else if(foodName == "Aloo Tikki"){
	  foodPrice = 40.98;
	  return foodPrice;
  }
  
  else if(foodName == "Palak Paneer"){
	  foodPrice = 180.00;
	  return foodPrice;
  }
  
  else if(foodName == "Aloo Paratha"){
	  foodPrice = 100.00;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Spring Rolls"){
	  foodPrice = 40.00;
	  return foodPrice;
  }
  
  else if(foodName == "Gobi Manchurian"){
	  foodPrice = 160.00;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Soup"){
	  foodPrice = 80.98;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Idli") {
	  foodPrice = 60.45;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Frankie"){
	  foodPrice = 150.00;
	  return foodPrice;
  }
  
  else if(foodName == "Veg Fried Rice"){
	  foodPrice = 140.34;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Pasta"){
	  foodPrice = 180.00;
	  return foodPrice;
  }
  
  else if(foodName == "Mixed Vegetable Raita"){
	  foodPrice = 80.45;
	  return foodPrice;
  }
  
  else if(foodName == "Stuffed Capsicum"){
	  foodPrice = 160.45;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Stew"){
	  foodPrice = 140.45;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Poha"){
	  foodPrice = 120.45;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Kebabs"){
	  foodPrice = 180.45;
	  return foodPrice;
  }
  
  else if(foodName == "Aloo Gobi "){
	  foodPrice = 140.45;
	  return foodPrice;
  }
  
  else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getFoodPricebyName Ended");
  return foodPrice;
  
  }
  
}
