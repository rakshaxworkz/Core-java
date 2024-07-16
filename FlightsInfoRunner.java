class FlightsInfoRunner{
	
  public static void main(String[] flight){
	
  System.out.println("Main started");
  
  String name = "Mumbai";
  double price = FlightsInfo.getFlightsPricebyDestination(name,2);
  System.out.println("The price for " + name + " is " + price);
  
  System.out.println("Main Ended");
  
  }
  
}

