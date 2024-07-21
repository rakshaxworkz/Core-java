class MynthraAccountRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
		MynthraAccount.createUserAccount("Raksha", "Shetty", 8197614012L, "raksha@gmail.com", "shetty@1234", "shetty@1234");
		MynthraAccount.readUserAccountDetails();
		System.out.println("Main Ended");
	
	}
}