class Kajal{
public static void main(String[] kj){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Faces Canada";
 String finishType="Matte";
 int price=402;
 String itemForm="Pencil";
 String color="Black";
 String coverage="Full";
 System.out.println("Details of the Kajal are ");
 System.out.println("Brand is " + brand);
 System.out.println("Finish Type is " + finishType);
 System.out.println("Price is " + price);
 System.out.println("Item Form is " + itemForm);
 System.out.println("Color is " + color);
 System.out.println("Coverage is " + coverage);
 System.out.println("getFeatures method ended");
 return;
}
}