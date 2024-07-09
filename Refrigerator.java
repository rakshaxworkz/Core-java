class Refrigerator{
   static boolean isConnected=false;
   
   public static boolean onOrOff(){
   
   System.out.println("Start of OnorOff");
   if(isConnected==false){
   isConnected=true;
   System.out.println("Refrigerator is turned On");
   }
   else if(isConnected==true){
   isConnected=false;
   System.out.println("Refrigerator is turned Off");
   }
   System.out.println("End of OnOrOff");
   return isConnected;
   }
}
