class LinkedlnRunner{
	
	public static void main(String[]job){
		
		System.out.println("Main Started");
		
		boolean isLinkedlnCreated =Linkedln.createLinkedlnAccount("Raksha",null,"shetty@gmail.com","qwerty@567","qwerty@567","India","560010","Microsoft","SDE","3years","IT","BE");
		if(isLinkedlnCreated == true)
	    Linkedln.readLinkedlnAccount();

		System.out.println("Main ended");
	}

}