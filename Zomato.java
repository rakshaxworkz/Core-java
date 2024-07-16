class Zomato{
	
 public static double getFoodPricebyName(String foodName , int qty){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Chicken Biryani")
	return foodPrice = 250.80 * qty;
  
  else if(foodName == "Butter Chicken")
	return foodPrice = 300.00 * qty;
  
  else if(foodName == "Fish Curry")
	  return foodPrice = 200.00 * qty;
  
  else if(foodName == "Chicken Tikka")
	  return foodPrice = 180.00 * qty;
  
  else if(foodName == "Mutton Rogan Josh")
	  return foodPrice = 350.98 * qty;
  
  else if(foodName == "Prawn Masala")
	  return foodPrice = 280.00 * qty;
  
  else if(foodName == "Egg Fried Rice")
	  return foodPrice = 150.00 * qty;
  
  else if(foodName == "Chicken Shawarma")
	  return foodPrice = 200.00 * qty;
  
  else if(foodName == "Fish Fry")
	  return foodPrice = 220.00 * qty;
  
  else if(foodName == "Chicken Korma")
	  return foodPrice = 280.98 * qty;
  
  else if(foodName == "Egg Curry") 
	  return foodPrice = 120.45 * qty;
  
  else if(foodName == "Mutton Biryani")
	  return foodPrice = 300.00 * qty;
  
  else if(foodName == "Chicken 65")
	  return foodPrice = 140.34 * qty;
  
  else if(foodName == "Fish Tandoori")
	  return foodPrice = 250.00 * qty;
  
  else if(foodName == "Keema Pav")
	  return foodPrice = 180.45 * qty;
  
  else if(foodName == "Chicken Lollipop")
	  return foodPrice = 160.45 * qty;
  
  else if(foodName == "Prawn Fried Rice")
	  return foodPrice = 280.45 * qty;
  
  else if(foodName == "Mutton Seekh Kebab")
	  return foodPrice = 300.45 * qty;
  
  else if(foodName == "Chicken Hakka Noodles")
	  return foodPrice = 200.45 * qty;
  
  else if(foodName == "Egg Bhurji")
	  return foodPrice = 140.45 * qty;
  
  else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getFoodPricebyName Ended");
  return foodPrice;
  
  }
  
}
