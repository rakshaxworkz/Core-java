class SbiRunner{
	
	public static void main(String[]bank){
		
		System.out.println("Main Started");
		
		boolean isSbiCreated = Sbi.createSbiAccount("8197614012",null,"SBIN04103","8197614012","India","Uew256f");
		if(isSbiCreated == true)
		Sbi.readSbiAccount();
		
		System.out.println("Main ended");
	}
}