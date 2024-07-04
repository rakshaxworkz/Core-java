class Spoon{
    public static void main(String[] sp){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Spoon");
	  String  brand   =  "E-COSMOS ";
	  String  colour    = "Black";
	  int      price   =  1500;
	  String meterial   =   "Plastic";
	  String  Capacity     =         "240 Milliliters";
	  String  weight    =   "150 g";
	  System.out.println("getFeatures method Ended");
	  
	  System.out.println("the barand Name is" + brand);
	  	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the meterial is" + meterial);
	  System.out.println("the Capacity is" + Capacity);
	  System.out.println("the weight of the Spoon is" + weight);
      return;
  
 }
}