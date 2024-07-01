class  ElectricBoiler{
    public static void main(String[] egg){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of ElectricEggBoiler");
	  String  brand   =  "Amazon basics";
	  String  colour    = "White";
	  int      price   =  15900;
	  String meterial   =   "Plastic";
	  String Dimensions	      =  "15.2H Centimeters";
	  String  weight    =   "310 g";
	  System.out.println("getFeatures method Ended");
	  
	  System.out.println("the barand Name is" + brand);
	  	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the meterial is" + meterial);
	  System.out.println("the Dimensions is" + Dimensions);
	  System.out.println("the weight  is" + weight);
      return;
  
 }
}