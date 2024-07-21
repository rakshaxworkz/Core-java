class ShettyLaunchHomeJobRegistered{
        
		static String givenName ;
		static String midName ;
		static String surName ;
		static String add ;
		static String cit ;
		static String sta ;
		static String mailId ;
		static long mobileNumber ;
		static boolean stayInIndia ;
        static boolean highSchoolGraduate ;
        static boolean attendingSchool ;		
		
	   
	public static boolean createRestaurantRegistrationForm(String firstName, String middleName, String lastName, String address, String city, String state, String email, long phoneNumber, boolean isStayInIndia, boolean isHighSchoolGraduate, boolean isAttendingSchool){
	
	     boolean isRestaurantRegistrationFormCreated = false ;
		 givenName = firstName ;
		 midName = middleName ;
		 surName = lastName ;
		 add = address ;
		 cit = city ;
		 sta = state ;
		 mailId = email ;
		 mobileNumber = phoneNumber ;
		 stayInIndia = isStayInIndia ;
		 highSchoolGraduate = isHighSchoolGraduate ;
		 attendingSchool = isAttendingSchool ;
		 isRestaurantRegistrationFormCreated = true ;
		 
		 return isRestaurantRegistrationFormCreated ;
	
	}
    
	public static void readRestaurantStaffDetails(){
	
	    System.out.println("fetching...  Details...");
		System.out.println("The Restaurant Staff First Name is :" + givenName);
		System.out.println("The Staff Middle Name is :" + midName);
		System.out.println("The Staff Last Name is :" + surName);
		System.out.println("The Staff Address is :" + add);
		System.out.println("The Staff City is :" +cit);
		System.out.println("The Staff State is :" + sta);
		System.out.println("The Staff emailId is :" + mailId);
		System.out.println("The Staff Phone Number is :" + mobileNumber);
		System.out.println("The Staff is Stay in india or not :" + stayInIndia);
		System.out.println("The Staff is a high School Graduate or not :" + highSchoolGraduate);
		System.out.println("The Staff is attending a school or not :" + attendingSchool);
		
		
	
	}
}