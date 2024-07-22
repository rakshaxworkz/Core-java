class Amazon{

static String fullName;
static String email;
static String passwd;
static String confirm;
static String birth;
static String phone;

    public static boolean createAmazonAccount(String name, String emailId, String pwd, String confirmpwd,String dob,String phoneNumber){
		boolean isAmazonCreated = false;
		
		boolean isNameValid =false;
		boolean isEmailIdValid = false;
		boolean isPwdValid = false;
		boolean isConfirmpwdValid = false;
		boolean isBirthValid = false;
		boolean isPhoneValid = false;
	
	if(name != null){
		fullName=name;
		isNameValid = true;
	}
	else
		System.out.println("Name is invalid");
	
	if(emailId != null){
		email=emailId;
		isEmailIdValid = true;
	}
	else{
		System.out.println("EmailId is invalid");
	}
	
	if(pwd != null){
	passwd=pwd;
	isPwdValid = true;
}
	else{
		System.out.println("Password is invalid");
	}

if(confirmpwd != null){
	confirm=confirmpwd;
	isConfirmpwdValid = true;
}
	else{
		System.out.println("Confirm Password is invalid");
	}

if(phoneNumber != null){
	phone=phoneNumber;
         isPhoneValid= true;
	}
	else{
		System.out.println("Phone number is invalid");
	}
	
	if(dob != null){
	birth=dob;
	isBirthValid = true;
}
	else{
		System.out.println("Date of birth is invalid");
	}
	
	
	if(isNameValid == true && isEmailIdValid == true && isPwdValid == true && isConfirmpwdValid == true && isBirthValid == true && isPhoneValid == true){
		isAmazonCreated = true;
	}
	return isAmazonCreated;
	}
	
	public static void readAmazonAccount(){
		
		System.out.println("Amazon registration");
		System.out.println("Name:"+fullName);
		System.out.println("Email Id:"+email);
		System.out.println("Password:"+passwd);
		System.out.println("Confirm:"+confirm);
		System.out.println("Date of birth:"+birth);
		System.out.println("Phone number:"+phone);

	}
}