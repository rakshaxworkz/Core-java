class Swiggy{
	
 public static double getFoodPricebyName(String foodName){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Gobi"){
    foodPrice = 180.80;
	return foodPrice;
   }
  
  else if(foodName == "Masala Dosa"){
    foodPrice = 60.00;
	return foodPrice;
   }
  
  else if(foodName == "Paneer Butter Masala"){
	  foodPrice = 200.00;
	  return foodPrice;
   }
  
  else if(foodName == "Vegetable Biryani"){
	  foodPrice = 180.00;
	  return foodPrice;
  }
  
  else if(foodName == "Chole Bhature"){
	  foodPrice = 120.98;
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
  
  else if(foodName == "Veg Pulao"){
	  foodPrice = 150.00;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Manchurian"){
	  foodPrice = 160.00;
	  return foodPrice;
  }
  
  else if(foodName == "Pav Bhaji"){
	  foodPrice = 100.98;
	  return foodPrice;
  }
  
  else if(foodName == "Dal Makhani") {
	  foodPrice = 180.45;
	  return foodPrice;
  }
  
  else if(foodName == "Rajma Chawal"){
	  foodPrice = 150.00;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Pakora"){
	  foodPrice = 80.34;
	  return foodPrice;
  }
  
  else if(foodName == "Mix Veg Sabzi"){
	  foodPrice = 150.00;
	  return foodPrice;
  }
  
  else if(foodName == "Jeera Rice"){
	  foodPrice = 100.45;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Cutlet"){
	  foodPrice = 30.45;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Hakka Noodles"){
	  foodPrice = 140.45;
	  return foodPrice;
  }
  
  else if(foodName == "Veg Momos"){
	  foodPrice = 120.45;
	  return foodPrice;
  }
  
  else if(foodName == "Vegetable Korma"){
	  foodPrice = 180.45;
	  return foodPrice;
  }
  
  else if(foodName == "Samosa"){
	  foodPrice = 20.45;
	  return foodPrice;
  }
  
  else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getFoodPricebyName Ended");
  return foodPrice;
  
  }
  
}
