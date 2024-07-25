import java.util.*;

class MedicalStore{
	static String  medicineNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addmedicineNames(String medicineName){
			boolean ismedicineNameAdded = false;
			if(start < medicineNames.length){
				if(medicineName!=null){
					medicineNames[start] = medicineName;
					start++;
				ismedicineNameAdded = true;
				}
				else
				System.out.println("medicine Name is invalid");
			}else
				System.out.println("Sorry medicine name is full");
		return ismedicineNameAdded;
		}
		public static void readmedicineNames(){
			System.out.println("medicine Names available are");
			for(String medicineName : medicineNames){
				System.out.println(medicineName);
			}
		}
		public static boolean updateMedicineNames(String newMedicineName , String oldMedicineName){
			System.out.println("Update method is Started");
			boolean isUpdateMedicineNames = false;
			for(int ref=0; ref<medicineNames.length;ref++){
				if(medicineNames[ref] == oldMedicineName){
					medicineNames[ref] = newMedicineName;
					isUpdateMedicineNames = true;
				}
			}
			if(isUpdateMedicineNames==false)
				System.out.println(oldMedicineName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateMedicineNames;
		}
		public static boolean deleteTouristPlaceNames(String medicineName){
			boolean isDeleteMedicineName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<medicineNames.length; ref++){
				if(medicineNames[ref] != medicineName){
					medicineNames[newRef] = medicineNames[ref];
					newRef++;
				}
				else
					isDeleteMedicineName = true;
			}
			int newlength = newRef;
			medicineNames = Arrays.copyOf(medicineNames , newlength);
			
			if(isDeleteMedicineName == false){
				System.out.println(medicineNames + "not found");
			}
		return isDeleteMedicineName;
		}
}