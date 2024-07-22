class SpotifyRegister{
	static String fName;
	static String lName;
	static String db;
	static String eml;
	static String pd;
	
  // Create operation
  public static boolean createUserAccount(String firstName , String lastName , String dob , String emailId , String password){
    boolean isAccountCreated = false;
	
	boolean isFirstNameValid = false;
	boolean isLastNameValid = false;
	boolean isDobValid = false;
	boolean isEmailIdValid = false;
	boolean isPasswordValid = false;
	 
	// null check or validation
	if(firstName!=null){
		fName = firstName;
		isFirstNameValid = true;
	}
	else{
		System.out.println("First Name is invalid");
	}
	if(lastName!=null){
		lName = lastName;
		isLastNameValid = true;
	}
	else{
		System.out.println("Last Name is invalid");
	}
	if(dob!=null){
		db = dob;
		isDobValid = true;
	}
	else{
		System.out.println("Date of Birth is invalid");
	}
	
	if(emailId!=null){
		eml = emailId;
		isEmailIdValid = true;
	}
	else{
		System.out.println("Email ID is invalid");
	}
	if(password!=null){
		pd = password;
		isPasswordValid = true;
	}
	else{
		System.out.println("Password is invalid");
	}
	
	
	 if(isFirstNameValid == true && isLastNameValid == true && isDobValid == true && isEmailIdValid == true && isPasswordValid == true ){
	isAccountCreated = true;
	}
	
    return isAccountCreated;
	
  }
  
  public static void readUserDetails(){
	  
	  System.out.println("fetching... User Details....");
	  
	  System.out.println("The First Name " + fName);
	  System.out.println("The Last Name " + lName);
	  System.out.println("The Date of Birth " + db);
	  System.out.println("The Email Id is " + eml);
	  System.out.println("The Password is" + pd);
	 
	  
	  System.out.println("Creating the user Account on Spotify completed");
	  
	  
  }

}