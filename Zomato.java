class Zomato{
	
 public static double getFoodPricebyName(String foodName){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Chicken Biryani"){
    foodPrice = 250.80;
	return foodPrice;
   }
  
  else if(foodName == "Butter Chicken"){
    foodPrice = 300.00;
	return foodPrice;
   }
  
  else if(foodName == "Fish Curry"){
	  foodPrice = 200.00;
	  return foodPrice;
   }
  
  else if(foodName == "Chicken Tikka"){
	  foodPrice = 180.00;
	  return foodPrice;
  }
  
  else if(foodName == "Mutton Rogan Josh"){
	  foodPrice = 350.98;
	  return foodPrice;
  }
  
  else if(foodName == "Prawn Masala"){
	  foodPrice = 280.00;
	  return foodPrice;
  }
  
  else if(foodName == "Egg Fried Rice"){
	  foodPrice = 150.00;
	  return foodPrice;
  }
  
  else if(foodName == "Chicken Shawarma"){
	  foodPrice = 200.00;
	  return foodPrice;
  }
  
  else if(foodName == "Fish Fry"){
	  foodPrice = 220.00;
	  return foodPrice;
  }
  
  else if(foodName == "Chicken Korma"){
	  foodPrice = 280.98;
	  return foodPrice;
  }
  
  else if(foodName == "Egg Curry") {
	  foodPrice = 120.45;
	  return foodPrice;
  }
  
  else if(foodName == "Mutton Biryani"){
	  foodPrice = 300.00;
	  return foodPrice;
  }
  
  else if(foodName == "Chicken 65"){
	  foodPrice = 140.34;
	  return foodPrice;
  }
  
  else if(foodName == "Fish Tandoori"){
	  foodPrice = 250.00;
	  return foodPrice;
  }
  
  else if(foodName == "Keema Pav"){
	  foodPrice = 180.45;
	  return foodPrice;
  }
  
  else if(foodName == "Chicken Lollipop"){
	  foodPrice = 160.45;
	  return foodPrice;
  }
  
  else if(foodName == "Prawn Fried Rice"){
	  foodPrice = 280.45;
	  return foodPrice;
  }
  
  else if(foodName == "Mutton Seekh Kebab"){
	  foodPrice = 300.45;
	  return foodPrice;
  }
  
  else if(foodName == "Chicken Hakka Noodles"){
	  foodPrice = 200.45;
	  return foodPrice;
  }
  
  else if(foodName == "Egg Bhurji"){
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
