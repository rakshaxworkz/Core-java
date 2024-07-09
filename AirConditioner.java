class AirConditioner{
   static boolean isConnected=false;
   
   public static void turnOn(){
   
   System.out.println("Start of turnOn");
   if(isConnected==false){
   isConnected=true;
   System.out.println("Air Conditioner is turned On");
   }
   System.out.println("End of turnOn");
   }
   
   
   public static void turnOff(){
   
   System.out.println("Start of turnOff");
   if(isConnected==true){
   isConnected=false;
   System.out.println("Air Conditioner is turned Off");
   }
   System.out.println("End of turnOff");
   }

}