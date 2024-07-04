class Foundation{
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
 String brand="Faces Canada";
 String shade="Rose Ivory011";
 int price=289;
 String finishType="Matte";
 String skinTone="All";
 String itemForm="Cream";
 String skinType="Light";
 System.out.println("Details of the Foundation are ");
 System.out.println("Brand is " + brand);
 System.out.println("Shade is " + shade);
 System.out.println("Price is " + price);
 System.out.println("Finish Type is " + finishType);
 System.out.println("Skin Tone is " + skinTone);
 System.out.println("Item Form is " + itemForm);
 System.out.println("Skin Type is " + skinType);
 System.out.println("getFeatures method ended");
 return;
}
}