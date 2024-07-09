class AirConditionerRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  boolean connect=AirConditioner.onOrOff();
  System.out.println("Is connected :"+ connect);
  connect=AirConditioner.onOrOff();
  System.out.println("Is connected :"+ connect);
  System.out.println("Main Ended");
  }

}