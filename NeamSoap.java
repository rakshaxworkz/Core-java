class NeamSoap{
public static void main(String[] sp){
 System.out.println("Main started");
 // invoke a method
 // call a method
 getFeatures();
 System.out.println("Main ended");
}
public static void getFeatures(){
 System.out.println("getFeatures method started");
 // local variable
 String brand="Margo";
 String skinType="All";
 int price=242;
 String origin="India";
 String color="Green";
 String materialTypeFree="Animal Fat free , Paraben free";
 System.out.println("Details of the Neam Soap are ");
 System.out.println("Brand is " + brand);
 System.out.println("Skin Type is " + skinType);
 System.out.println("Price is " + price);
 System.out.println("Country of origin is " + origin);
 System.out.println("Color is " + color);
 System.out.println("Material Type Free is " + materialTypeFree);
 System.out.println("getFeatures method ended");
 return;
}
}