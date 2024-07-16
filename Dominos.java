class Dominos{
	
 public static double getFoodPricebyName(String foodName , int qty){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Veg Pizza")
	return foodPrice = 250.80 * qty;
  
  else if(foodName == "Margherita Pizza")
	return foodPrice = 199.00 * qty;
  
  else if(foodName == "Farmhouse Pizza")
	  return foodPrice = 275.00 * qty;
  
  else if(foodName == "Peppy Paneer Pizza")
	  return foodPrice = 299.00 * qty;
  
  else if(foodName == "Veg Extravaganza Pizza")
	  return foodPrice = 350.98 * qty;
  
  else if(foodName == "Cheese Burst Pizza")
	  return foodPrice = 349.00 * qty;
  
  else if(foodName == "Chicken Dominator Pizza")
	  return foodPrice = 399.00 * qty;
  
  else if(foodName == "Pepperoni Pizza")
	  return foodPrice = 325.00 * qty;
  
  else if(foodName == "Mexican Green Wave Pizza")
	  return foodPrice = 349.00 * qty;
  
  else if(foodName == "Golden Corn Pizza")
	  return foodPrice = 280.98 * qty;
  
  else if(foodName == "Indi Tandoori Paneer Pizza") 
	  return foodPrice = 320.45 * qty;
  
  else if(foodName == "Paneer Makhani Pizza")
	  return foodPrice = 349.00 * qty;
  
  else if(foodName == "Non-Veg Supreme Pizza")
	  return foodPrice = 399.34 * qty;
  
  else if(foodName == "Garlic Breadsticks")
	  return foodPrice = 129.00 * qty;
  
  else if(foodName == "Stuffed Garlic Bread")
	  return foodPrice = 149.45 * qty;
  
  else if(foodName == "Cheese Garlic Bread")
	  return foodPrice = 160.45 * qty;
  
  else if(foodName == "Veg Parcel")
	  return foodPrice = 40.45 * qty;
  
  else if(foodName == "Chicken Wings")
	  return foodPrice = 250.45 * qty;
  
  else if(foodName == "Choco Lava Cake")
	  return foodPrice = 99.45 * qty;
  
  else if(foodName == "Butterscotch Mousse Cake")
	  return foodPrice = 140.45 * qty;
  
  else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getFoodPricebyName Ended");
  return foodPrice;
  
  }
  
}
