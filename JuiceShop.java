import java.util.Arrays;
class JuiceShop{
static String juiceNames[] = {null,null,null,null,null,null};
static int start;
public static boolean addJuiceName(String juiceName){
  boolean isJuiceNameAdded = false;
  if(start<juiceNames.length){
  if(juiceName != null){
  juiceNames[start++] = juiceName;
  isJuiceNameAdded = true;
  }
  else
  System.out.println("JuiceName is Invalid");

}
else{
  System.out.println("Juice Names is full");
}
return isJuiceNameAdded;

}
public static void showJuiceNames(){

for(String juiceName:juiceNames){
   System.out.println(juiceName);
}

}

// Update Operation
   public static boolean updateJuiceName(String newJuiceName , String oldJuiceName){
	   
	   System.out.println("Update operation on Juice name is started");
	   boolean isJuiceNameUpdated = false;
	   for(int position = 0; position < juiceNames.length ; position++ ){
		   if(juiceNames[position] == oldJuiceName){
			   juiceNames[position] = newJuiceName ;
			   isJuiceNameUpdated = true;
		   }
	   }
	   if(isJuiceNameUpdated == false)
		   System.out.println(oldJuiceName + " not found");
   
   System.out.println("Update operation on Juice name is Ended");
   return isJuiceNameUpdated;
   }
   
   // Delete Operation
   public static boolean deleteJuiceName(String juiceName){
	   boolean isJuiceNameDeleted = false;
	   int position , newPosition;
	   for(position=0,newPosition=0;position<juiceNames.length;position++){
		   if(juiceNames[position]!=juiceName){
			   juiceNames[newPosition] = juiceNames[position];
			   newPosition++;
		   }
		   else isJuiceNameDeleted = true;
	   }
	   int newLength = newPosition;
	   juiceNames = Arrays.copyOf(juiceNames,newLength);
	   
	   if(isJuiceNameDeleted == false){
		   System.out.println(juiceName + "not found");
	   }
	   
	   return isJuiceNameDeleted;
   }
}