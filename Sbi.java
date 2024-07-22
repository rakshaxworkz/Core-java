class Sbi{
	
     static String account;
	 static String cif;
	 static String branch;
	 static String mobile;
	 static String nation;
	 static String cap;

 public static boolean createSbiAccount(String accountNumber, String cifNumber, String branchCode, String mobileNumber,String country, String captcha){
		boolean isSbiCreated = false;
		
		boolean isAccountNumberValid = false;
		boolean isCifNumberValid = false;
		boolean isBranchCodeValid = false;
		boolean isMobileNumberValid = false;
		boolean isCountryValid = false;
		boolean isCaptchaValid = false;
		
		if( accountNumber!=null){
			account = accountNumber;
			isAccountNumberValid = true;
		}
		else
			System.out.println(" Account Number is Invalid");
		
		if( cifNumber!=null){
			cif = cifNumber;
			isCifNumberValid = true;
		}
		else
			System.out.println("CIF Number is Invalid");
		
		if( branchCode!=null){
			branch = branchCode;
			isBranchCodeValid = true;
		}
		else
			System.out.println("Branch Code is Invalid");
		
		if( mobileNumber!=null){
			mobile = mobileNumber;
			isMobileNumberValid = true;
		}
		else
			System.out.println(" Mobile Number is Invalid");
		
		if( country!=null){
			nation = country;
			isCountryValid =true;
		}
		else
			System.out.println(" Country is Invalid");
		
		if( captcha!=null){
			cap = captcha;
			isCaptchaValid =true;
		}
		else
			System.out.println(" Captcha is Invalid");
		
		if(isAccountNumberValid == true && isCifNumberValid ==true && isBranchCodeValid == true && isMobileNumberValid == true && isCountryValid == true && isCaptchaValid == true){
			isSbiCreated = true;
		}
		return isSbiCreated;
	}
	
	public static void readSbiAccount(){
		
		System.out.println("SBI registration");
		System.out.println("Account number:"+account);
		System.out.println("CIF number:"+cif);
		System.out.println("Branch Code:"+branch);
		System.out.println("Registrated mobile number:"+mobile);
		System.out.println("Country:"+nation);
		System.out.println("Captcha:"+cap);
		
	}
}