class FanRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  
  boolean connect=Fan.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  Fan.increaseVolume();
  Fan.increaseVolume();
  Fan.increaseVolume();
  Fan.increaseVolume();
  Fan.increaseVolume();
  Fan.increaseVolume();
  Fan.increaseVolume();
  Fan.increaseVolume();
  
  Fan.increaseVolume();
  Fan.decreaseVolume();
  Fan.decreaseVolume();
  Fan.decreaseVolume();
  Fan.decreaseVolume();
  Fan.decreaseVolume();
  Fan.decreaseVolume();
  Fan.decreaseVolume();
  Fan.decreaseVolume();
  
  connect=Fan.onOrOff();
  System.out.println("Is connected :"+ connect);
  Fan.increaseVolume();
  Fan.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}