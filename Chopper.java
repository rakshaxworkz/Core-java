class  Chopper {
    public static void main(String[] juice){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Chopper ");
	  String  brand   =  "Pigeon";
	  String  colour    = "Green";
	  int      price   =  16900;
	  String material   =   "Polypropylene";
	  String specialFeature      =  "Manual";
	  String  bladeLength    =   "10 Nanometre";
	  String weight	 ="250 Grams";
	  System.out.println("getFeatures method Started"); 
	  System.out.println("the barand Name is" + brand);
	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the  material is" + material);
	  System.out.println("the specialFeature is" +specialFeature);
	  System.out.println("the bladeLength   is" + bladeLength );
	  System.out.println("the weight is" + weight);
	   System.out.println("getFeatures method Ended");
      return;
  
 }
}