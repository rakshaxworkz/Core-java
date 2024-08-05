class BankRunner{

    public static void main(String banking[]){
	
	    System.out.println("Main Started");
	    Bank ref = new Bank(4256787 , "Bank of Baroda" , "Treasury Branch" , "BARB07687237" , "AAAABBCCDDDD" , 10 , "Sushil");
		
		ref.displayInfo();
		
		Bank ref1 = new Bank(162914 , "Canara bank" , "Mumbai" , "CNRB0RTGS01" , "AAAACDDDDYYY" , 12 , "Akshay");
		
		ref1.displayInfo();
		
		Bank ref2 = new Bank(764381 , "Federal Bank" ,"Mumbai" , "FEDB0000379" , "GGYYHHUUUULL" , 15 , "Chandrakala");
		
		ref2.displayInfo();
		
		Bank ref3 = new Bank(743971 , "HDFC Banj" , "Mumbai" , "HDFC0999999" ,"GGYYHHUUUULL" , 20 , "Arjun");

		ref3.displayInfo();
		
		Bank ref4 = new Bank(743895 , "ICICI Bank" , "Corporate Office- Treasury" , "ICIC0TREA00" , "GGGRRRHHHIII" , 14 ,"Shashikala" );

		ref4.displayInfo();
		
		Bank ref5 = new Bank(517468 , "Karnataka Bank" , "Head Office Treasuary Department" , "KARB0000001" , "AAAADDTTUUWW" , 8 , "Anushree" );
		
		ref5.displayInfo();
		
		Bank ref6 = new Bank(726138 , "State Bank of India" , "Treasury Branch" , "SBIN0004343" , "AAAAGGGGWWDD" , 16 ,  "Sushanth" );
		
		ref6.displayInfo();
		
		Bank ref7 = new Bank(7231649 , "Syndicate Bank" , "Mumbai" , "SYNB000RTGS" , "AABBTTHHKKLL" , 13 , "Saraswathi");
		
		ref7.displayInfo();
		
		Bank ref8 = new Bank(376190 , "Union Bank of India" , "Kolkatta" , "UTBI0HOA139" , "GGGGTTTTWWWW" , 18 , "Aarshika"  );
		
		ref8.displayInfo();
		
		
	
	}


}