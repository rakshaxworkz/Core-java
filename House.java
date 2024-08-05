class House{

    int houseId;
	int noOfRooms;
	int noOfFloors;
	String houseName;
	int areaInSqrt;
	int noOfMembers;
	
	public House(int houseId , int noOfRooms , int noOfFloors , String houseName , int areaInSqrt ,int noOfMembers){
		this.houseId = houseId;
		this.noOfRooms = noOfRooms;
		this.noOfFloors = noOfFloors;
		this.houseName = houseName;
		this.areaInSqrt = areaInSqrt;
		this.noOfMembers = noOfMembers;
	}
	
	public void displayInfo(){
		System.out.println("House BluePrint are");
		System.out.println("House Id is " + this.houseId);
		System.out.println("Number of Rooms in the house are " + this.noOfRooms);
		System.out.println("Number of Floors in the house are " + this.noOfFloors);
		System.out.println("House Name is " + this.houseName);
		System.out.println("House Square feet of the area is " + this.areaInSqrt);
		System.out.println("Number of Members in the house are " + this.noOfMembers);
	}


}