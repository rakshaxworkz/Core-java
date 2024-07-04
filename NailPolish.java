class NailPolish{
public static void main(String[] np){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="OPI";
 String color="White";
 int price=722;
 String volume="15ML";
 String type="Base";
 String specialFeature="Chip Resistant";
 System.out.println("Details of the NailPolish are ");
 System.out.println("Brand is " + brand);
 System.out.println("Color is " + color);
 System.out.println("Price is " + price);
 System.out.println("Volume is " + volume);
 System.out.println("Type is " + type);
 System.out.println("Special Feature is " + specialFeature);
 System.out.println("getFeatures method ended");
 return;
}
}