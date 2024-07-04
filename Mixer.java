class  Mixer {
    public static void main(String[] juice){
	System.out.println("main Started");
	getFeatures();
    System.out.println("main Ended");
}

  public static void getFeatures()
  {
      System.out.println("getFeatures method started");
	  System.out.println("Details of Mixer ");
	  String  brand   =  "nutripro";
	  String  colour    = "Silver";
	  int      price   =  16900;
	  String Capacity   =   "0.3 litres";
	  String specialFeature      =  "Food blender";
	  String  powerSource    =   "Corded Electric";
	  String style ="countertop_blender";
	  System.out.println("getFeatures method Started"); 
	  System.out.println("the barand Name is" + brand);
	  System.out.println("the colour is" + colour);
	  System.out.println(" the price is"+ price);
	  System.out.println("the Capacity is" + Capacity);
	  System.out.println("the specialFeature is" +specialFeature);
	  System.out.println("the powerSource  is" + powerSource);
	  System.out.println("the style  is" + style);
	   System.out.println("getFeatures method Ended");
      return;
  
 }
}