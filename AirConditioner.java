class AirConditioner{
   static boolean isConnected=false;
   
   public static boolean onOrOff(){
   
   System.out.println("Start of OnorOff");
   if(isConnected==false){
   isConnected=true;
   System.out.println("Air Conditioner is turned On");
   }
   else if(isConnected==true){
   isConnected=false;
   System.out.println("Air Conditioner is turned Off");
   }
   System.out.println("End of OnOrOff");
   return isConnected;
   }
}
