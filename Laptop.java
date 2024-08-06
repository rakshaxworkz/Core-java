class Laptop{
	int hpPrice=60000;
	int dellPrice=70000;
	int	lenovoPrice=90000;
	int acerPrice=50000;
	int mousePrice=700;
	int keyboardPrice=2000;

	boolean offerAdded;
	
	String laptopName[] = {"HP" , "DELL" , "LENOVO" , "ACER"};
	
	
public  int laptopPrice(String name , boolean offerAdded){
	int totalPrice=0;
		
			if(name == laptopName[0]){
				if(offerAdded){
					System.out.println("Offer added");
					 totalPrice = totalPrice + hpPrice - mousePrice;
					return totalPrice;
				}
				else {
					System.out.println("Offer Not added");
					 totalPrice = hpPrice;
					return totalPrice;
				}
				
			}
			else if(name == laptopName[1]){
				if(offerAdded){
					System.out.println("Offer added");
					 totalPrice = totalPrice + dellPrice - keyboardPrice;
					return totalPrice;
				}
				else {
					System.out.println("Offer Not added");
					 totalPrice = hpPrice;
					return totalPrice;
				}
				
			}
			else if(name == laptopName[2]){
				if(offerAdded){
					System.out.println("Offer added");
					 totalPrice = totalPrice + lenovoPrice - keyboardPrice - mousePrice;
					return totalPrice;
				}
				else {
					System.out.println("Offer Not added");
					 totalPrice = lenovoPrice;
					return totalPrice;
				}
				
			}
			else if(name == laptopName[3]){
				if(offerAdded){
					System.out.println("Offer added");
					 totalPrice =totalPrice +  acerPrice - keyboardPrice - mousePrice;
					return totalPrice;
				}
				else {
					System.out.println("Offer Not added");
					 totalPrice = lenovoPrice;
					return totalPrice;
				}
				
			}
			
				System.out.println("Laptop Unavailable");
			return totalPrice;
			
			
	}
		
	
	}
	
		

	
   
