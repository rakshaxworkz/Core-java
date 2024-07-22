class LoanApplication{
	
	static String credit;
	static String loan;
	static String name;
	static String bank;
	static  String interest;
	static String years;
	
	 public static boolean createLoanAccount(String creditScore , String loanType , String loanApplicantName , String bankName , String rateOfInterest , String yearsOfLoan){
		boolean isLoanCreated = false;
		
		boolean iscreditScoreValid = false;
		boolean isloanTypeValid = false;
		boolean isloanApplicantNameValid = false;
		boolean isbankNameValid = false;
		boolean israteOfInterestValid = false;
		boolean isyearsOfLoanValid = false;
		
		if( creditScore!= null){
			credit = creditScore;
			iscreditScoreValid= true;
		}
		else
			System.out.println("creditScore is Invalid");
		
		
		if( loanType!= null){
			loan = loanType;
			isloanTypeValid= true;
		}
		else
			System.out.println("loanType is Invalid");
		
		
		if( loanApplicantName!= null){
			name = loanApplicantName;
			isloanApplicantNameValid= true;
		}
		else
			System.out.println("loanApplicantNameis Invalid");
		
		
		if( bankName!= null){
			bank = bankName;
			isbankNameValid= true;
		}
		else
			System.out.println("bankName is Invalid");
		
		
		if( rateOfInterest!= null){
			interest = rateOfInterest;
			israteOfInterestValid= true;
		}
		else
			System.out.println("rateOfInterest is Invalid");
		
		
		if(yearsOfLoan != null){
			years = yearsOfLoan;
			isyearsOfLoanValid= true;
		}
		else
			System.out.println(" yearsOfLoanis Invalid");
		
		
		if( iscreditScoreValid == true && isloanTypeValid == true && isloanApplicantNameValid== true && isbankNameValid== true && israteOfInterestValid == true && isyearsOfLoanValid== true){
			isLoanCreated = true;
		}
		return isLoanCreated;
	}
	
	public static void readLoanAccount(){
		
		System.out.println("Loan Application");
		System.out.println("Credit Score:"+credit);
		System.out.println("Loan Type:"+loan);
		System.out.println("Applicant name:"+name);
		System.out.println("Bank Name:"+bank);
		System.out.println("Rate Of Interest:"+interest);
		System.out.println("Term of years:"+years);

	}
}