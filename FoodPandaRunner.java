class FoodPandaRunner{
	
  public static void main(String[] movies){
	
  System.out.println("Main started");
  
  String name = "Vegetable Pizza";
  double price = FoodPanda.getFoodPricebyName(name, 10);
  System.out.println("The price for " + name + " is " + price);
  
  System.out.println("Main Ended");
  
  }
  
}

