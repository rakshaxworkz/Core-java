import java.util.*;

class MRPStore{
static String  alcoholNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addalcoholNames(String alcoholName){
			boolean isalcoholNameAdded = false;
			if(start < alcoholNames.length){
				if(alcoholName!=null){
					alcoholNames[start] = alcoholName;
					start++;
				isalcoholNameAdded = true;
				}
				else
				System.out.println("alcohol Names is invalid");
			}else
				System.out.println("Sorry alcohol Names is full");
		return isalcoholNameAdded;
		}
		public static void readalcoholNames(){
			System.out.println("alcohol Names available are");
			for(String alcoholName : alcoholNames){
				System.out.println(alcoholName);
			}
		}
		public static boolean updatealcoholNames(String newAlcohoName , String oldAlcoholName){
			System.out.println("Update method is Started");
			boolean isUpdateAlcoholNames = false;
			for(int ref=0; ref<alcoholNames.length;ref++){
				if(alcoholNames[ref] == oldAlcoholName){
					alcoholNames[ref] = newAlcohoName;
					isUpdateAlcoholNames = true;
				}
			}
			if(isUpdateAlcoholNames==false)
				System.out.println(oldAlcoholName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateAlcoholNames;
		}
		public static boolean deletealcoholNames(String alcoholName){
			boolean isDeleteAlcoholName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<alcoholNames.length; ref++){
				if(alcoholNames[ref] != alcoholName){
					alcoholNames[newRef] = alcoholNames[ref];
					newRef++;
				}
				else
					isDeleteAlcoholName = true;
			}
			int newlength = newRef;
			alcoholNames = Arrays.copyOf(alcoholNames , newlength);
			
			if(isDeleteAlcoholName == false){
				System.out.println(alcoholNames + "not found");
			}
		return isDeleteAlcoholName;
		}
}