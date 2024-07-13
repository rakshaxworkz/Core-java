class DominosRunner{
	
  public static void main(String[] movies){
	
  System.out.println("Main started");
  
  String name = "Farmhouse Pizza";
  double price = Dominos.getFoodPricebyName(name);
  System.out.println("The price for " + name + " is " + price);
  
  System.out.println("Main Ended");
  
  }
  
}

