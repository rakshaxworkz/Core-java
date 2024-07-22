class LoanApplicationRunner{

    public static void main(String[]loan){
		
		System.out.println("Main Started");
		boolean isLoanCreated=LoanApplication.createLoanAccount(null,"Personal Loan ","Raksha","State Bank of India","8.7","10 yr");
		if(isLoanCreated == true)
		LoanApplication.readLoanAccount();
		System.out.println("Main ended");
	}
}