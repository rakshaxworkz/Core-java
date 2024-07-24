class AmazonRunner{
 public static void main(String[] products){
 
   boolean addedProduct = Amazon.addProductName("Clothes");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Eyeliner");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("EyeShadow");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Lipstick");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Pencil");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Mobile");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Laptop");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Charger");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Hair Accessories");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Sandles");
   System.out.println("Added Product " + addedProduct );
   
   Amazon.addProductName("Makeup");
   System.out.println("Added Product " + addedProduct );
   
   
   
   Amazon.showProductNames();
 
 }




}