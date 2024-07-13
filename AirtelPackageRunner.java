class AirtelPackageRunner{
	
  public static void main(String[] airtel){
	
  System.out.println("Main started");
  
  String name = "72 Days with 1GB/day";
  double price = AirtelPackage.getAirtelPricebyPlans(name);
  System.out.println("The price for " + name + " is " + price);
  
  System.out.println("Main Ended");
  
  }
  
}

