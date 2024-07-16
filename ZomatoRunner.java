class ZomatoRunner{
	
  public static void main(String[] movies){
	
  System.out.println("Main started");
  
  String name = "Chicken Biryani";
  double price = Zomato.getFoodPricebyName(name);
  double price1 = Zomato.getFoodPricebyName(name,2);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("The price for " + name + " is " + price1);
  
  System.out.println("Main Ended");
  
  }
  
}

