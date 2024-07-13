class SwiggyRunner{
	
  public static void main(String[] movies){
	
  System.out.println("Main started");
  
  String name = "Gobi";
  double price = Swiggy.getFoodPricebyName(name);
  System.out.println("The price for " + name + " is " + price);
  
  System.out.println("Main Ended");
  
  }
  
}

