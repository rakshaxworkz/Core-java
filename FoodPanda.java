class FoodPanda{
	
 public static double getFoodPricebyName(String foodName , int qty){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Vegetable Pizza")
	return foodPrice = 250.80 * qty;
  
  else if(foodName == "Vegetable Upma")
	return foodPrice = 60.00 * qty;
  
  else if(foodName == "Vegetable Sandwich")
	  return foodPrice = 80.00 * qty;
  
  else if(foodName == "Methi Malai Matar")
	  return foodPrice = 160.00 * qty;
  
  else if(foodName == "Aloo Tikki")
	  return foodPrice = 40.98 * qty;
  
  else if(foodName == "Palak Paneer")
	  return foodPrice = 180.00 * qty;
  
  else if(foodName == "Aloo Paratha")
	  return foodPrice = 100.00 * qty;
  
  else if(foodName == "Vegetable Spring Rolls")
	  return foodPrice = 40.00 * qty;
  
  else if(foodName == "Gobi Manchurian")
	  return foodPrice = 160.00 * qty;
  
  else if(foodName == "Vegetable Soup")
	  return foodPrice = 80.98 * qty;
  
  else if(foodName == "Vegetable Idli") 
	  return foodPrice = 60.45 * qty;
  
  else if(foodName == "Vegetable Frankie")
	  return foodPrice = 150.00 * qty;
  
  else if(foodName == "Veg Fried Rice")
	  return foodPrice = 140.34 * qty;
  
  else if(foodName == "Vegetable Pasta")
	  return foodPrice = 180.00 * qty;
  
  else if(foodName == "Mixed Vegetable Raita")
	  return foodPrice = 80.45 * qty;
  
  else if(foodName == "Stuffed Capsicum")
	  return foodPrice = 160.45 * qty;
  
  else if(foodName == "Vegetable Stew")
	  return foodPrice = 140.45 * qty;
  
  else if(foodName == "Vegetable Poha")
	  return foodPrice = 120.45 * qty;
  
  else if(foodName == "Vegetable Kebabs")
	  return foodPrice = 180.45 * qty;
  
  else if(foodName == "Aloo Gobi ")
	  return foodPrice = 140.45 * qty;
  
  else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getFoodPricebyName Ended");
  return foodPrice;
  
  }
  
}
