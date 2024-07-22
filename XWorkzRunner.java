class XWorkzRunner{
	
	public static void main(String[]institute){
		
		System.out.println("Main Started");
		boolean isXworkzCreated=XWorkz.createXWorkzAccount("Raksha Shetty","8197614012",null,"shettyraksha659@gmail.com",null,"BE","ISE","SDMIT");
		if(isXworkzCreated == true)
		XWorkz.readXWorkzAccount();
		System.out.println("Main ended");
	}
}