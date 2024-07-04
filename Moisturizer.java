class Moisturizer{
public static void main(String[] ms){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Dot and Key";
 String qty="100gm";
 int price=332;
 String targetGender="Unisex";
 String skinType="Combination,Sensitive,Dry,Normal";
 String itemForm="Cream";
 String origin="India";
 System.out.println("Details of the Moisturizer are ");
 System.out.println("Brand is " + brand);
 System.out.println("Quantity is " + qty);
 System.out.println("Price is " + price);
 System.out.println("Target Gender is " + targetGender);
 System.out.println("Skin Type is " + skinType);
 System.out.println("Item Form is " + itemForm);
 System.out.println("Country of origin is " + origin);
 System.out.println("getFeatures method ended");
 return;
}
}