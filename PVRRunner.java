class PVRRunner{
	
  public static void main(String[] movies){
	
  System.out.println("Main started");
  
  String name = "Koti";
  double price = PVR.getMoviePricebyName(name,5);
  System.out.println("The price for " + name + " is " + price);
  
  System.out.println("Main Ended");
  
  }
  
}

