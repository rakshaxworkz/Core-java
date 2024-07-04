class Iron {
    public static void main(String[] hot){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Iron");
	  String  brand   =  "Bajaj ";
	  String  colour    = " White";
	  int      price   =  600;
	  String Dimensions   =   "11 Centimeters";
	  String modelName      =         "9 Watts";
	  String  Voltage    =   "240 Volts";
	  System.out.println("getFeatures method Ended");
	  
	  System.out.println("the barand Name is" + brand);
	  	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the Dimensions is" + Dimensions);
	  System.out.println("the modelName is" + modelName );
	  System.out.println("the Voltage of the Iron is" + Voltage);
      return;
  
 }
}