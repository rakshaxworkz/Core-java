class WashingMachine{
   static boolean isConnected=false;
   static int currentVolume;
   static int minValue=0;
   static int maxValue=7;
   public static boolean onOrOff(){
   
   System.out.println("Start of OnorOff");
  /*  if(!isConnected) 
	  isConnected=true; 
   
   else if(isConnected)
	  isConnected=false; 
*/
     isConnected= (isConnected==false) ? true:false;
	 // ref=condition ? value1:value2;
   
   System.out.println("End of OnOrOff");
   return isConnected;
   }
   
   public static void increaseVolume(){
	   System.out.println("Start of increase volume");
	   if(isConnected==true){
		   
		   if(currentVolume<maxValue){
			   currentVolume=currentVolume+1;
			   System.out.println("The current volume is " + currentVolume);
		   }
		   else {
			   System.out.println("Max volume reached");
		   }
	   }
	   else{
		   System.out.println("Connect the washingmachine");
	   }
   }
   
   public static void decreaseVolume(){
	   System.out.println("Start of decrease volume");
	   if(isConnected==true){
		   
		   if(currentVolume>minValue){
			   currentVolume=currentVolume-1;
			   System.out.println("The current volume is " + currentVolume);
		   }
		   else {
			   System.out.println("Min volume reached");
		   }
	   }
	   else{
		   System.out.println("Connect the washingmachine");
	   }
   }
}
