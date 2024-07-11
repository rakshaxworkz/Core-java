class CoolerRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  
  boolean connect=Cooler.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  Cooler.increaseVolume();
  Cooler.increaseVolume();
  Cooler.increaseVolume();
  Cooler.increaseVolume();
  Cooler.increaseVolume();
  Cooler.increaseVolume();
  Cooler.increaseVolume();
  Cooler.increaseVolume();
  
  Cooler.increaseVolume();
  Cooler.decreaseVolume();
  Cooler.decreaseVolume();
  Cooler.decreaseVolume();
  Cooler.decreaseVolume();
  Cooler.decreaseVolume();
  Cooler.decreaseVolume();
  Cooler.decreaseVolume();
  Cooler.decreaseVolume();
  
  connect=Cooler.onOrOff();
  System.out.println("Is connected :"+ connect);
  Cooler.increaseVolume();
  Cooler.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}