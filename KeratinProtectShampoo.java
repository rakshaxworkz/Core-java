class KeratinProtectShampoo{
public static void main(String[] shampoo){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Wella Pofessionals";
 String itemForm="Oil";
 int price=2700;
 String hairType="All";
 String volume="200ML";
 String uses="Dryness";
 System.out.println("Details of the Shampoo are ");
 System.out.println("Brand is " + brand);
 System.out.println("Item Form is " + itemForm);
 System.out.println("Price is " + price);
 System.out.println("Hair Type is " + hairType);
 System.out.println("Volume is " + volume);
 System.out.println("Uses is " + uses);
 System.out.println("getFeatures method ended");
 return;
}
}