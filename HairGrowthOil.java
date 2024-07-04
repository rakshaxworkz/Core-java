class HairGrowthOil{
public static void main(String[] oil){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Pilgrim";
 String hairType="All";
 int price=248;
 String origin="India";
 String activeIngredients="Rosemary";
 System.out.println("Details of the Hair Oil are ");
 System.out.println("Brand is " + brand);
 System.out.println("Hair Type is " + hairType);
 System.out.println("Price is " + price);
 System.out.println("Country of origin is " + origin);
 System.out.println("Active Ingredients is " + activeIngredients);
 System.out.println("getFeatures method ended");
 return;
}
}