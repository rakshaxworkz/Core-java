class SpotifyRegisterRunner{
  
  public static void main(String passport[]){
  
   boolean createAccount=SpotifyRegister.createUserAccount("Raksha" , "Shetty" , "14-01-2003" , "shettyraksha659@gmail.com" , "Shetty@123" );
   
   if(createAccount==true)
	   SpotifyRegister.readUserDetails();
   
   
  }

}