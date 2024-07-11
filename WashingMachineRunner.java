class WashingMachineRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  
  boolean connect=WashingMachine.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  
  WashingMachine.increaseVolume();
  WashingMachine.decreaseVolume();
  WashingMachine.decreaseVolume();
  WashingMachine.decreaseVolume();
  WashingMachine.decreaseVolume();
  WashingMachine.decreaseVolume();
  WashingMachine.decreaseVolume();
  WashingMachine.decreaseVolume();
  WashingMachine.decreaseVolume();
  
  connect=WashingMachine.onOrOff();
  System.out.println("Is connected :"+ connect);
  WashingMachine.increaseVolume();
  WashingMachine.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}