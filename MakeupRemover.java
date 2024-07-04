class MakeupRemover{
public static void main(String[] mv){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Lacto Calamine";
 String scent="Aloe Vera";
 int price=99;
 String benefit="Cleansing";
 String useFor="Face";
 String itemForm="Gel";
 String skinType="All";
 System.out.println("Details of the MakeUp Remover are ");
 System.out.println("Brand is " + brand);
 System.out.println("Scent is " + scent);
 System.out.println("Price is " + price);
 System.out.println("Benefits is " + benefit);
 System.out.println("Used for " + useFor);
 System.out.println("Item Form is " + itemForm);
 System.out.println("Skin Type is " + skinType);
 System.out.println("getFeatures method ended");
 return;
}
}