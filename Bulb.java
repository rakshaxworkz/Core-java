class Bulb {
    public static void main(String[] led){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Bulb");
	  String  brand   =  "wipro ";
	  String  colour    = "Warm White";
	  int      price   =  1500;
	  String type   =   "LED";
	  String  Wattage     =         "9 Watts";
	  String  Voltage    =   "240 Volts";
	  System.out.println("getFeatures method Ended");
	  
	  System.out.println("the barand Name is" + brand);
	  	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the type is" + type);
	  System.out.println("the Wattage is" + Wattage);
	  System.out.println("the Voltage of the Bulb is" + Voltage);
      return;
  
 }
}