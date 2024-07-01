class BackChair{
    public static void main(String[] chair){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Chair");
	  String  brand   =  "MA Stuff";
	  String  colour    = "Brown";
	  int      price   =  15900;
	  String meterial   =   "Acrylic";
	  String size      =         "Standard";
	  String  weight    =   "5 kg";
	  System.out.println("getFeatures method Ended");
	  
	  System.out.println("the barand Name is" + brand);
	  	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the meterial is" + meterial);
	  System.out.println("the size is" + size);
	  System.out.println("the weight of the chair is" + weight);
      return;
  
 }
}