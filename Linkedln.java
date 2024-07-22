class Linkedln{
	
	static String first;
	static String last;
    static String email;
    static String pword;
    static String confirm;
    static String nation;
    static String pin;
    static String comp;
    static String role;
	static String exp;
    static String ind;
    static String edu;

	 public static boolean createLinkedlnAccount(String firstName, String lastName,String emailId, String pwd,String confirmPwd,String country,String pinCode, String company, String title, String experience,String industry,String education){
		boolean isLinkedlnCreated = false;
	
	boolean isfirstNameValid = false;
	boolean islastNameValid = false;
	boolean isemailIdValid = false;
	boolean ispwdValid = false;
	boolean isconfirmPwdValid = false;
	boolean iscountryValid = false;
	boolean ispinCodeValid = false;
	boolean iscompanyValid = false;
	boolean istitleValid = false;
	boolean isexperienceValid = false;
	boolean isindustryValid = false;
	boolean iseducationValid = false;
	
	if( firstName!= null){
		first = firstName;
		isfirstNameValid= true;
	}
	else
		System.out.println(" firstName is Invalid");
	
	if( lastName!= null){
		last = lastName;
		islastNameValid= true;
	}
	else
		System.out.println("lastName is Invalid");
	
	if( emailId!= null){
		email = emailId;
		isemailIdValid= true;
	}
	else
		System.out.println("emailId is Invalid");
	
	if( pwd!= null){
		pword = pwd;
		ispwdValid= true;
	}
	else
		System.out.println("pwd is Invalid");
	
	if(confirmPwd != null){
		confirm = confirmPwd;
		isconfirmPwdValid= true;
	}
	else
		System.out.println("confirmPwd is Invalid");
	
	if( country!= null){
	  nation = country;
		iscountryValid= true;
	}
	else
		System.out.println("country is Invalid");
	
	if( pinCode!= null){
		pin = pinCode;
		ispinCodeValid= true;
	}
	else
		System.out.println("pinCode is Invalid");
	
	
	if(company != null){
		comp = company;
		iscompanyValid= true;
	}
	else
		System.out.println("company is Invalid");
	
	
	if(title != null){
		role = title;
		istitleValid= true;
	}
	else
		System.out.println("title is Invalid");
	
	if(experience != null){
		exp = experience;
		isexperienceValid= true;
	}
	else
		System.out.println(" experience is Invalid");
	
	if( industry!= null){
		ind = industry;
		isindustryValid= true;
	}
	else
		System.out.println("industry is Invalid");
	
	if( education!= null){
		edu = education;
		iseducationValid= true;
	}
	else
		System.out.println("education is Invalid");
	
	
	if(isfirstNameValid== true && islastNameValid== true && isemailIdValid== true && ispwdValid== true && isconfirmPwdValid== true && iscountryValid== true && ispinCodeValid== true && iscompanyValid== true && istitleValid== true && isexperienceValid== true && isindustryValid== true && iseducationValid== true){
		isLinkedlnCreated = true;
	}
	return isLinkedlnCreated;		
	}
	
	public static void readLinkedlnAccount(){
		
		System.out.println("details...");
		System.out.println("First Name:"+first);
		System.out.println("Last Name:"+last);
		System.out.println("email Id:"+email);
		System.out.println("Password:"+pword);
		System.out.println("Confirm Password:"+confirm);
		System.out.println("Country:"+nation);
		System.out.println("Pin Code:"+pin);
		System.out.println("Company:"+comp);
		System.out.println("Title:"+role);
		System.out.println("Experience:"+exp);
		System.out.println("Industry:"+ind);
		System.out.println("Education:"+edu);
		
	}
}