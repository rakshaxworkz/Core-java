class Parfume{
public static void main(String[] pf){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Global Desi";
 String flavour="Mythical Bloom and Soulful Trance";
 int price=1190;
 String qty="1000gm";
 String origin="India";
 System.out.println("Details of the Parfume are ");
 System.out.println("Brand is " + brand);
 System.out.println("Flovour is " + flavour);
 System.out.println("Price is " + price);
 System.out.println("Quantity is " + qty);
 System.out.println("Country of origin is " + origin);
 System.out.println("getFeatures method ended");
 return;
}
}