class AmazonRunner{
	
	public static void main(String[]ecommerce){
		
		System.out.println("Main Started");
		
		boolean isAmazonCreated = Amazon.createAmazonAccount(null,"Shetty@gmail.com","raksha@123","raksha@123","14/01/2003","8197614012");
		if(isAmazonCreated == true)
	    Amazon.readAmazonAccount();

		System.out.println("Main ended");
	}
}