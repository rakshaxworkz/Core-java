class DominosRunner{
	
  public static void main(String[] movies){
	
  System.out.println("Main started");
  
  String name = "Farmhouse Pizza";
  double price = Dominos.getFoodPricebyName(name);
  double price1 = Dominos.getFoodPricebyName(name,4);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("The price for " + name + " is " + price1);
  
  System.out.println("Main Ended");
  
  }
  
}

