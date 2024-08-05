class Country{

    int countryId;
	int noOfStates;
	String primeMinister;
	String population;
	
	public Country(int countryId , int noOfStates , String primeMinister , String population){
		this.countryId = countryId;
		this.noOfStates = noOfStates;
		this.primeMinister = primeMinister;
		this.population = population;
	}

	public void displayInfo(){
		System.out.println("Country's generated");
		System.out.println("Country Id of India is " + this.countryId);
		System.out.println("Number of States in India is " + this.noOfStates);
		System.out.println("Prime Minister in India is " + this.primeMinister);
		System.out.println("Population in India is " + this.population);
	}
}