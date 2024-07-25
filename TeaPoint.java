import java.util.Arrays;

class TeaPoint{
   static String teaNames[] = {null,null,null,null,null};
   static int start;
   // Create Operation
   public static  boolean addTeaName(String teaName){
    boolean isTeaNameAdded=false;
	
	if(start < teaNames.length){
   
     if(teaName !=null){
	 teaNames[start++]=teaName;
       //start ++;
     isTeaNameAdded = true; 	   
	 }
	 else
	 System.out.println("Tea Name is Invalid");
	}
	else{
		System.out.println("Tea NAmes is full");
	}
	 
	return isTeaNameAdded;
   
   }
   
   // Read Operation
   public static void showTeaNames(){
   
   for(String teaName : teaNames){
	   System.out.println(teaName);
   }
  
   }
   
   // Update Operation
   public static boolean updateTeaName(String newTeaName , String oldTeaName){
	   
	   System.out.println("Update operation on Tea name is started");
	   boolean isTeaNameUpdated = false;
	   for(int position = 0; position < teaNames.length ; position++ ){
		   if(teaNames[position] == oldTeaName){
			   teaNames[position] = newTeaName ;
			   isTeaNameUpdated = true;
		   }
	   }
	   if(isTeaNameUpdated == false)
		   System.out.println(oldTeaName + " not found");
   
   System.out.println("Update operation on Tea name is Ended");
   return isTeaNameUpdated;
   }
   
   // Delete Operation
   public static boolean deleteTeaName(String teaName){
	   boolean isTeaNameDeleted = false;
	   int position , newPosition;
	   for(position=0,newPosition=0;position<teaNames.length;position++){
		   if(teaNames[position]!=teaName){
			   teaNames[newPosition] = teaNames[position];
			   newPosition++;
		   }
		   else isTeaNameDeleted = true;
	   }
	   int newLength = newPosition;
	   teaNames = Arrays.copyOf(teaNames,newLength);
	   
	   if(isTeaNameDeleted == false){
		   System.out.println(teaName + "not found");
	   }
	   
	   return isTeaNameDeleted;
   }
  
}