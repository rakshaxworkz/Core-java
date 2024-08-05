class Bank{

    int bankId;
    String bankName;
	String branchName;
	String ifscCode;
	String swiftCode;
	int noOfWorker;
	String branchManagerName;
	
	public Bank(int bankId , String bankName , String branchName , String ifscCode , String swiftCode , int noOfWorker , String branchManagerName){
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.swiftCode = swiftCode;
		this.noOfWorker = noOfWorker;
		this.branchManagerName = branchManagerName;
	}
	public void displayInfo(){
		
		System.out.println("Bank Account Created");
		System.out.println("Bank Id is " + this.bankId);
		System.out.println("Bank Name is " + this.bankName);
		System.out.println("Branch Name is " + this.branchName);
		System.out.println("IFSC Code is " + this.ifscCode);
		System.out.println("Swift Code is " + this.swiftCode);
		System.out.println("Number of Worker is " + this.noOfWorker);
		System.out.println("Branch Manager Name is " + this.branchManagerName);
	}

}