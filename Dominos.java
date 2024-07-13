class Dominos{
	
 public static double getFoodPricebyName(String foodName){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Veg Pizza"){
    foodPrice = 250.80;
	return foodPrice;
   }
  
  else if(foodName == "Margherita Pizza"){
    foodPrice = 199.00;
	return foodPrice;
   }
  
  else if(foodName == "Farmhouse Pizza"){
	  foodPrice = 275.00;
	  return foodPrice;
   }
  
  else if(foodName == "Peppy Paneer Pizza"){
	  foodPrice = 299.00;
	  return foodPrice;
  }
  
  else if(foodName == "Veg Extravaganza Pizza"){
	  foodPrice = 350.98;
	  return foodPrice;
  }
  
  else if(foodName == "Cheese Burst Pizza"){
	  foodPrice = 349.00;
	  return foodPrice;
  }
  
  else if(foodName == "Chicken Dominator Pizza"){
	  foodPrice = 399.00;
	  return foodPrice;
  }
  
  else if(foodName == "Pepperoni Pizza"){
	  foodPrice = 325.00;
	  return foodPrice;
  }
  
  else if(foodName == "Mexican Green Wave Pizza"){
	  foodPrice = 349.00;
	  return foodPrice;
  }
  
  else if(foodName == "Golden Corn Pizza"){
	  foodPrice = 280.98;
	  return foodPrice;
  }
  
  else if(foodName == "Indi Tandoori Paneer Pizza") {
	  foodPrice = 320.45;
	  return foodPrice;
  }
  
  else if(foodName == "Paneer Makhani Pizza"){
	  foodPrice = 349.00;
	  return foodPrice;
  }
  
  else if(foodName == "Non-Veg Supreme Pizza"){
	  foodPrice = 399.34;
	  return foodPrice;
  }
  
  else if(foodName == "Garlic Breadsticks"){
	  foodPrice = 129.00;
	  return foodPrice;
  }
  
  else if(foodName == "Stuffed Garlic Bread"){
	  foodPrice = 149.45;
	  return foodPrice;
  }
  
  else if(foodName == "Cheese Garlic Bread"){
	  foodPrice = 160.45;
	  return foodPrice;
  }
  
  else if(foodName == "Veg Parcel"){
	  foodPrice = 40.45;
	  return foodPrice;
  }
  
  else if(foodName == "Chicken Wings"){
	  foodPrice = 250.45;
	  return foodPrice;
  }
  
  else if(foodName == "Choco Lava Cake"){
	  foodPrice = 99.45;
	  return foodPrice;
  }
  
  else if(foodName == "Butterscotch Mousse Cake"){
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
