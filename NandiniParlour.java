class NandiniParlour{
	
 public static double getProductPricebyName(String productName){
	 
	 double productPrice = 0.0;
	 System.out.println("getProductPricebyName started");
	 
   if(productName == "Milk"){
    productPrice = 28.80;
	return productPrice;
   }
  
  else if(productName == "Curd"){
    productPrice = 26.00;
	return productPrice;
   }
  
  else if(productName == "Butter"){
	  productPrice = 300.00;
	  return productPrice;
   }
  
  else if(productName == "Ghee"){
	  productPrice = 400.00;
	  return productPrice;
  }
  
  else if(productName == "Panneer"){
	  productPrice = 450.98;
	  return productPrice;
  }
  
  else if(productName == "Ice cream"){
	  productPrice = 507.00;
	  return productPrice;
  }
  
  else if(productName == "Lassi"){
	  productPrice = 30.00;
	  return productPrice;
  }
  
  else if(productName == "Flavoured Milk"){
	  productPrice = 30.00;
	  return productPrice;
  }
  
  else if(productName == "MilkShakes"){
	  productPrice = 45.00;
	  return productPrice;
  }
  
  else if(productName == "Dairy Whitener"){
	  productPrice = 309.98;
	  return productPrice;
  }
  
  else{
  System.out.println(productName + "Not found");
  }
  
  System.out.println("getProductPricebyName Ended");
  return productPrice;
  
  }
  
}
