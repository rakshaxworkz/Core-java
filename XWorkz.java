class XWorkz{
	
	static String fullname;
	static String contact;
	static String whatsApp;
	static String email;
	static String usn;
	static String qual;
	static String branch;
	static String college;
	
	 public static boolean createXWorkzAccount(String name, String contactNumber, String whatsAppNumber, String emailId, String usnNumber, String qualification,String stream, String collegeName){
		boolean isXworkzCreated = false;
		
		boolean isnameValid = false;
		boolean iscontactNumberValid = false;
		boolean iswhatsAppNumberValid = false;
		boolean isemailIdValid = false;
		boolean isusnNumberValid = false;
		boolean isqualificationValid = false;
		boolean isstreamValid = false;
		boolean iscollegeNameValid = false;
		
		if(name != null){
			fullname = name;
			isnameValid= true;
		}
		else
			System.out.println(" name is Invalid");
		
		if( contactNumber != null){
			contact = contactNumber;
			iscontactNumberValid = true;
		}
		else
			System.out.println("contactNumber is Invalid");
		
		if( whatsAppNumber!= null){
			whatsApp = whatsAppNumber;
			iswhatsAppNumberValid= true;
		}
		else
			System.out.println("whatsAppNumber is Invalid");
		
		if( emailId!= null){
			email = emailId;
			isemailIdValid= true;
		}
		else
			System.out.println("emailId is Invalid");
		
		if(usnNumber != null){
			usn = usnNumber;
			isusnNumberValid = true;
		}
		else
			System.out.println("usnNumber is Invalid");
		
		
		if(qualification!= null){
			qual = qualification;
			isqualificationValid= true;
		}
		else
			System.out.println("qualification is Invalid");
		
		if( stream!= null){
			branch = stream;
			isstreamValid= true;
		}
		else
			System.out.println("stream is Invalid");
		
		if(collegeName != null){
			college = collegeName;
			iscollegeNameValid= true;
		}
		else
			System.out.println("collegeName is Invalid");
		
		if(isnameValid == true && iscontactNumberValid == true && iswhatsAppNumberValid == true && isemailIdValid== true && isusnNumberValid== true && isqualificationValid== true && isstreamValid== true && iscollegeNameValid == true){
			isXworkzCreated = true;
		}
		
		return isXworkzCreated;
	}
	
	public static void readXWorkzAccount(){
		
		System.out.println("Xworkz registration");
		System.out.println("Full name:"+fullname);
		System.out.println("Contact Number:"+contact);
		System.out.println("WhatsApp Number:"+whatsApp);
		System.out.println("Email Id:"+email);
		System.out.println("USN:"+usn);
		System.out.println("Qualification:"+qual);
		System.out.println("Stream:"+branch);
		System.out.println("College Name:"+college);
		
		
	}
}