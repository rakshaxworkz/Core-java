class ZomatoRunner{
	
  public static void main(String[] movies){
	
  System.out.println("Main started");
  
  String name = "Chicken Biryani";
  double price = Zomato.getFoodPricebyName(name);
  System.out.println("The price for " + name + " is " + price);
  
  System.out.println("Main Ended");
  
  }
  
}

