class AirConditionerRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  
  boolean connect=AirConditioner.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  AirConditioner.increaseVolume();
  AirConditioner.increaseVolume();
  AirConditioner.increaseVolume();
  AirConditioner.increaseVolume();
  AirConditioner.increaseVolume();
  AirConditioner.increaseVolume();
  AirConditioner.increaseVolume();
  AirConditioner.increaseVolume();
  
  AirConditioner.increaseVolume();
  AirConditioner.decreaseVolume();
  AirConditioner.decreaseVolume();
  AirConditioner.decreaseVolume();
  AirConditioner.decreaseVolume();
  AirConditioner.decreaseVolume();
  AirConditioner.decreaseVolume();
  AirConditioner.decreaseVolume();
  AirConditioner.decreaseVolume();
  
  connect=AirConditioner.onOrOff();
  System.out.println("Is connected :"+ connect);
  AirConditioner.increaseVolume();
  AirConditioner.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}