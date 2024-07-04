class OnePlus{
public static void main(String[] mobile){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="One Plus";
 String color="Blue";
 int price=39998;
 String memoryRAMSize="8GB";
 double screenSize=6.55;
 String cpuModel="SnapDragon";
 String memoryStorage="128GB";
 System.out.println("Details of the One Plus are ");
 System.out.println("Brand is " + brand);
 System.out.println("Color is " + color);
 System.out.println("Price is " + price);
 System.out.println("Memory RAM Size is " + memoryRAMSize);
 System.out.println("Screen Size is " + screenSize);
 System.out.println("CPU Model is " + cpuModel);
 System.out.println("Memory Storage is " + memoryStorage);
 System.out.println("getFeatures method ended");
 return;
}
}