class MedicalStore{
static String productNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;
public static boolean addProductName(String productName){
  boolean isProductNameAdded = false;
  if(start<productNames.length){
  if(productName != null){
  productNames[start++] = productName;
  isProductNameAdded = true;
  }
  else
  System.out.println("Product Name is Invalid");

}
else{
  System.out.println("Product Names is full");
}
return isProductNameAdded;

}
public static void showProductNames(){

for(String productName:productNames){
   System.out.println(productName);
}

}
}