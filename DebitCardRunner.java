class DebitCardRunner{

    public static void main(String debit[]){
	
	    System.out.println("Main Started");
	    DebitCard card = new DebitCard(680909, "Raksha Shetty" , 8776643345678L , "12/08/2025" , 567 );
		
		card.displayInfo();
		
		DebitCard card1 = new DebitCard(798066, "Samith", 6578709433211345L ,"25/06/2025",123 );
	
		card1.displayInfo();
		
		DebitCard card2 = new DebitCard(62458 ,"Abhi" , 4567234509876548L, "28/12/2025" , 908 );
		
		card2.displayInfo();
		
		DebitCard card3 = new DebitCard(5687 , "Naspan" , 6362707518636096L , "08/05/2025" , 781);

		card3.displayInfo();
		
		DebitCard card4 = new DebitCard(634271 , "Harshith" , 6360961244996428L , "22/06/2026" , 398 );
		
		card4.displayInfo();
		
		DebitCard card5 = new DebitCard(76785 , "Sudarshan" , 9964285658546289L , "12/10/2026" , 459 );
		
		card5.displayInfo();
		
		DebitCard card6 = new DebitCard(45579 , "Amith" , 4567321890765434L , "01/09/2026" , 324);
		
		card6.displayInfo();
		
		DebitCard card7 = new DebitCard(68980 , "Sinchana" , 4678876521225439L , "05/02/2026" , 743  );
		
		card7.displayInfo();
		
		DebitCard card8 = new DebitCard(47658 , "Chandra", 6543332178907654L , "02/03/2027" , 886 );
	
		card8.displayInfo();
		
		
	}

}