class HDFCAccountCreated{
        
	    static String givenName ;
		static String midName ;
		static String motherName ;
		static String fatherName ;
		static long AadhaarNo ;
		static String countryBirth ;
		static String cityBirth ;
		static String nation ;
		static String dis ;
		static String sta ;
		static long phoneNumber ;
		static String address ;
		
    public static boolean createBankAccount(String firstName, String middleName, String mothersName, String fathersName, long AadhaarNumber, String countryOfBirth, String cityOfBirth, String nationality, String district, String state, long mobileNumber, String permanentAddress){
	
	     boolean isBankAccountCreated = false ;
		 givenName = firstName ;
		 midName = middleName ;
		 motherName = mothersName ;
		 fatherName = fathersName ;
		 AadhaarNo = AadhaarNumber ;
		 countryBirth = countryOfBirth ;
		 cityBirth = cityOfBirth ;
		 nation = nationality ;
		 dis = district ;
		 sta = state ;
		 phoneNumber = mobileNumber ;
		 address = permanentAddress ;
		 isBankAccountCreated = true ;
		 
		 return isBankAccountCreated ;
	
	}
    
	public static void readBankAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The Customer First Name is :" + givenName);
		System.out.println("The Customer Middle Name is :" + midName);
		System.out.println("The Customer Mother Name is :" + motherName);
		System.out.println("The Customer Father Name is :" + fatherName);
		System.out.println("The Customer Aadhaar Number is :" + AadhaarNo);
		System.out.println("The Customer Country of Birth is :" + countryBirth);
		System.out.println("The Customer City of Birth is :" + cityBirth);
		System.out.println("The Customer Nationality is :" +nation);
		System.out.println("The Customer District is :" + dis);
		System.out.println("The Customer State is :" + sta);
		System.out.println("The Customer Mobile Number is :" + phoneNumber);
		System.out.println("The Customer Permanent Address is :" + address);
		
		
	
	}
}