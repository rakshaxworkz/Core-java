class InstagramAccountGenerated{
        
		static String email ;
		static String pwd ;
		static String givenName ;
		static boolean product ;
		static int code ;
		
    public static boolean createUserAccount(String emailId, String password, String userName, boolean productUpdates, int launchCode){
	
	     boolean isGithubAccountGenerated = false ;
		 
		 email = emailId ;
		 pwd = password ;
		 givenName = userName ;
		 product = productUpdates ;
		 code = launchCode ;
		 isGithubAccountGenerated = true ;
		 
		 return isGithubAccountGenerated ;
	
	}
    
	public static void readUserAccountDetails(){
	
	    System.out.println("fetching... Details...");
		System.out.println("The User email address is :" + email);
		System.out.println("The User Password is :" + pwd);
		System.out.println("The User Name is :" + givenName);
		System.out.println("The User Product Update is :" + product);
		System.out.println("The User email sent the launch code is :" + code);
	
	}
}