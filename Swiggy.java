class Swiggy{
	
 public static double getFoodPricebyName(String foodName){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Gobi")
	return foodPrice = 180.80 ;
  
  else if(foodName == "Masala Dosa")
	return foodPrice = 60.00;
  
  else if(foodName == "Paneer Butter Masala")
	  return foodPrice = 200.00 ;
  
  else if(foodName == "Vegetable Biryani")
	  return foodPrice = 180.00 ;
  
  else if(foodName == "Chole Bhature")
	  return foodPrice = 120.98 ;
  
  else if(foodName == "Palak Paneer")
	  return foodPrice = 180.00 ;
  
  else if(foodName == "Aloo Paratha")
	  return foodPrice = 100.00 ;
  
  else if(foodName == "Veg Pulao")
	  return foodPrice = 150.00 ;
  
  else if(foodName == "Vegetable Manchurian")
	  return foodPrice = 160.00 ;
  
  else if(foodName == "Pav Bhaji")
	  return foodPrice = 100.98 ;
  
  else if(foodName == "Dal Makhani") 
	  return foodPrice = 180.45 ;
  
  else if(foodName == "Rajma Chawal")
	  return foodPrice = 150.00 ;
  
  else if(foodName == "Vegetable Pakora")
	  return foodPrice = 80.34 ;
  
  else if(foodName == "Mix Veg Sabzi")
	  return foodPrice = 150.00;
  
  else if(foodName == "Jeera Rice")
	  return foodPrice = 100.45;
  
  else if(foodName == "Vegetable Cutlet")
	  return foodPrice = 30.45 ;
  
  else if(foodName == "Vegetable Hakka Noodles")
	  return foodPrice = 140.45 ;
  
  else if(foodName == "Veg Momos")
	  return foodPrice = 120.45 ;
  
  else if(foodName == "Vegetable Korma")
	  return foodPrice = 180.45 ;
  
  else if(foodName == "Samosa")
	  return foodPrice = 20.45 ;
  
  else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getFoodPricebyName Ended");
  return foodPrice;
  
  }
  public static double getFoodPricebyName(String foodName , int qty){
	 
	 double foodPrice = 0.0;
	 System.out.println("getFoodPricebyName started");
	 
   if(foodName == "Gobi")
	return foodPrice = 180.80 * qty;
  
  else if(foodName == "Masala Dosa")
	return foodPrice = 60.00 * qty;
  
  else if(foodName == "Paneer Butter Masala")
	  return foodPrice = 200.00 * qty;
  
  else if(foodName == "Vegetable Biryani")
	  return foodPrice = 180.00 * qty;
  
  else if(foodName == "Chole Bhature")
	  return foodPrice = 120.98 * qty;
  
  else if(foodName == "Palak Paneer")
	  return foodPrice = 180.00 * qty;
  
  else if(foodName == "Aloo Paratha")
	  return foodPrice = 100.00 * qty;
  
  else if(foodName == "Veg Pulao")
	  return foodPrice = 150.00 * qty;
  
  else if(foodName == "Vegetable Manchurian")
	  return foodPrice = 160.00 * qty;
  
  else if(foodName == "Pav Bhaji")
	  return foodPrice = 100.98 * qty;
  
  else if(foodName == "Dal Makhani") 
	  return foodPrice = 180.45 * qty;
  
  else if(foodName == "Rajma Chawal")
	  return foodPrice = 150.00 * qty;
  
  else if(foodName == "Vegetable Pakora")
	  return foodPrice = 80.34 * qty;
  
  else if(foodName == "Mix Veg Sabzi")
	  return foodPrice = 150.00 * qty;
  
  else if(foodName == "Jeera Rice")
	  return foodPrice = 100.45 * qty;
  
  else if(foodName == "Vegetable Cutlet")
	  return foodPrice = 30.45 * qty;
  
  else if(foodName == "Vegetable Hakka Noodles")
	  return foodPrice = 140.45 * qty;
  
  else if(foodName == "Veg Momos")
	  return foodPrice = 120.45 * qty;
  
  else if(foodName == "Vegetable Korma")
	  return foodPrice = 180.45 * qty;
  
  else if(foodName == "Samosa")
	  return foodPrice = 20.45 * qty;
  
  else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getFoodPricebyName Ended");
  return foodPrice;
  
  }
  
}
