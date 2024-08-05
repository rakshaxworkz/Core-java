class DebitCard{

    int cardId;
	String cardHolderName;
	long cardNo;
	String expDate;
	int cvv;
	
	public DebitCard(int cardId , String cardHolderName ,long cardNo ,String expDate ,int cvv){
		this.cardId = cardId;
		this.cardHolderName = cardHolderName;
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.cvv = cvv;
	}
	public void displayInfo(){
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + this.cardId);
		System.out.println("Debit Card Holder Name is " + this.cardHolderName);
		System.out.println("Debit Card Number is " + this.cardNo);
		System.out.println("Expiry Date of Debit Card is " + this.expDate);
		System.out.println("Debit Card Verification Value is " + this.cvv);
	}
}