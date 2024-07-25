class MRPStoreRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean alcoholNamesAdded = MRPStore.addalcoholNames("Gin");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Vodka");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Whiskey");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Tequila");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Rum");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Brandy");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Absinthe");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Benedictine ");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Campari");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Jagermeister");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		alcoholNamesAdded = MRPStore.addalcoholNames("Licor 43 ");
		System.out.println("medicine Names added " +alcoholNamesAdded);
		
		MRPStore.readalcoholNames();
		
		boolean alcoholNamesUpdate = MRPStore.updatealcoholNames("OldMonk" , "Jagermeister");
		System.out.println("Alcohol Name is updated" + alcoholNamesUpdate);
		
		MRPStore.readalcoholNames();
		
		boolean alcoholNamesDelete = MRPStore.deletealcoholNames("Campari");
		System.out.println("Alcohol Name is Deleted" +alcoholNamesDelete);
		
		MRPStore.readalcoholNames();
		System.out.println("Main Ended");
	}
}