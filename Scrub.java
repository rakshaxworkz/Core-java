class Scrub  {
    public static void main(String[] wash){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Scrub");
	  String  brand   =  "Scotch-Brite ";
	  String  colour    = "Green";
	  int      price   =  1500;
	  String specialFeature  =   "Long Lasting";
	  String  itemPackage      =         "Quantity 1";
	  System.out.println("getFeatures method Ended");
	  
	  System.out.println("the barand Name is" + brand);
	  	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("thespecialFeature is" + specialFeature);
	  System.out.println("theitemPackage is" + itemPackage);
      return;
  
 }
}