class MynthraAccount{
        
	    static String givenName ;
		static String surName ;
		static long phoneNumber ;
		static String mailId ;
		static String password ;
		static String confirmPassword ;
		
    public static boolean createUserAccount(String firstName, String lastName, long mobileNumber, String email, String pwd, String confirmPwd){
	
	     boolean isMynthraAccountCreated = false ;
		 givenName = firstName ;
		 surName = lastName;
		 phoneNumber = mobileNumber ;
		 mailId = email ;
		 password = pwd ;
		 confirmPassword = confirmPwd ;
		 isMynthraAccountCreated = true ;
		 
		 return isMynthraAccountCreated ;
	
	}
    
	public static void readUserAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The User First Name is :" + givenName);
		System.out.println("The User Last Name is :" + surName);
		System.out.println("The User Phone Number is :" + phoneNumber);
		System.out.println("The User email Id is :" + mailId);
		System.out.println("The User Password is :" + password);
		System.out.println("The User Confirm Password is :" + confirmPassword);
	
	}
}