class Telivision{
   static boolean isSwitchedOn=false;
   
   public static void turnOn(){
   
   System.out.println("Start of turnOn");
   if(isSwitchedOn==false){
   isSwitchedOn=true;
   System.out.println("Telivision is turned On");
   }
   System.out.println("End of turnOn");
   }
   
   
   public static void turnOff(){
   
   System.out.println("Start of turnOff");
   if(isSwitchedOn==true){
   isSwitchedOn=false;
   System.out.println("Telivision is turned Off");
   }
   System.out.println("End of turnOff");
   }

}