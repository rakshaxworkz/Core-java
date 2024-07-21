class HDFCAccountCreatedRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    HDFCAccountCreated.createBankAccount("Raksha", "Shetty", "Sharavathi", "ChandraShekarshetty", 8197614012L, "India", "Bangalore", "Indian", "Udupi", "Karnataka", 8197614012L, "Kundapur");
		HDFCAccountCreated.readBankAccountDetails();
		System.out.println("Main Ended");
	
	}
}