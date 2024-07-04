class HandBag{
public static void main(String[] hb){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Fostelo";
 String closureType="Zipper";
 int price=599;
 String style="Diva";
 String color="Brown";
 String material="Polyurethane";
 System.out.println("Details of the Hand Bag are ");
 System.out.println("Brand is " + brand);
 System.out.println("Closure Type is " + closureType);
 System.out.println("Price is " + price);
 System.out.println("Style is " + style);
 System.out.println("Color is " + color);
 System.out.println("Material is " + material);
 System.out.println("getFeatures method ended");
 return;
}
}