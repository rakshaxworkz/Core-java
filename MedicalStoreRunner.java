class MedicalStoreRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean medicineNamesAdded = MedicalStore.addmedicineNames("5 Flucel 250mg Injection");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Abirapro 250mg Tablet");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Abritiga 250mg Tablet");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Abura 250mg Tablet");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Acabrunat 100mg Capsule");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Acalaside 100mg Capsule");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Adcist 10mg Injection");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Bdenza 40mg Capsule");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Bdenza OS Oral Solution");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Bdparp 150mg Tablet 56'S");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		medicineNamesAdded = MedicalStore.addmedicineNames("Carbowemb 450mg Injection");
		System.out.println("medicine Names added " +medicineNamesAdded);
		
		MedicalStore.readmedicineNames();
		
		boolean medicineNamesUpdate = MedicalStore.updateMedicineNames("Dollo 650" , "Bdparp 150mg Tablet 56'S");
		System.out.println("Medicine Name is updated" + medicineNamesUpdate);
		
		MedicalStore.readmedicineNames();
		
		boolean medicineNamesDelete = MedicalStore.deleteTouristPlaceNames("Bdenza 40mg Capsule");
		System.out.println("Medicine Name is Deleted" +medicineNamesDelete);
		
		MedicalStore.readmedicineNames();
		System.out.println("Main Ended");
	}
		
}