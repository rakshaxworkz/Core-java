import java.util.*;

class TouristCompany{
	static String  touristPlaceNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addtouristPlaceNames(String touristPlaceName){
			boolean istouristPlaceNameAdded = false;
			if(start < touristPlaceNames.length){
				if(touristPlaceName!=null){
					touristPlaceNames[start] = touristPlaceName;
					start++;
				istouristPlaceNameAdded = true;
				}
				else
				System.out.println("touristPlace Name is invalid");
			}else
				System.out.println("Sorry touristPlaceNames name is full");
		return istouristPlaceNameAdded;
		}
		public static void readtouristPlaceNames(){
			System.out.println("touristPlace Names available are");
			for(String touristPlaceName : touristPlaceNames){
				System.out.println(touristPlaceName);
			}
		}
		public static boolean updateTouristPlaceName(String newTouristPlaceName , String oldTouristPlaceName){
			System.out.println("Update method is Started");
			boolean isUpdateTouristPlaceName = false;
			for(int ref=0; ref<touristPlaceNames.length;ref++){
				if(touristPlaceNames[ref] == oldTouristPlaceName){
					touristPlaceNames[ref] = newTouristPlaceName;
					isUpdateTouristPlaceName = true;
				}
			}
			if(isUpdateTouristPlaceName==false)
				System.out.println(oldTouristPlaceName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateTouristPlaceName;
		}
		public static boolean deleteTouristPlaceName(String touristPlaceName){
			boolean isDeleteTouristPlaceName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<touristPlaceNames.length; ref++){
				if(touristPlaceNames[ref] != touristPlaceName){
					touristPlaceNames[newRef] = touristPlaceNames[ref];
					newRef++;
				}
				else
					isDeleteTouristPlaceName = true;
			}
			int newlength = newRef;
			touristPlaceNames = Arrays.copyOf(touristPlaceNames , newlength);
			
			if(isDeleteTouristPlaceName == false){
				System.out.println(touristPlaceNames + "not found");
			}
		return isDeleteTouristPlaceName;
		}
}