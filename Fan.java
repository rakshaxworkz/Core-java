class  Fan {
    public static void main(String[] air){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Fan ");
	  String  brand   =  "Bajaj";
	  String  colour    = "Brown";
	  int      price   =  7000;
	  String powerSource   =   "Corded Electric";
	  String specialFeature      =  "high velocity";
	  String  style   =   "Star Rated";
       String type		 ="Living Room, Bedroom, Dining Room";
	  System.out.println("getFeatures method Started"); 
	  System.out.println("the barand Name is" + brand);
	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the powerSource  is" + powerSource );
	  System.out.println("the specialFeature is" +specialFeature);
	  System.out.println("the style     is" + style  );
	  System.out.println("the type is" + type);
	   System.out.println("getFeatures method Ended");
      return;
  
 }
}