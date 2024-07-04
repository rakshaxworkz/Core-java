class MenWatch{
public static void main(String[] fn){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Carlington";
 String color="Brown Silver";
 int price=798;
 int caseDiameter=51;
 String caseThickness="11mm";
 String materialType="Leather";
 String movementType="Quartz";
 System.out.println("Details of the Watch are ");
 System.out.println("Brand is " + brand);
 System.out.println("Color is " + color);
 System.out.println("Price is " + price);
 System.out.println("Case Diameter is " + caseDiameter);
 System.out.println("Case Thickness is " + caseThickness);
 System.out.println("Material Type is " + materialType);
 System.out.println("Movement Type is " + movementType);
 System.out.println("getFeatures method ended");
 return;
}
}