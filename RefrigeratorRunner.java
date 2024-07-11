class RefrigeratorRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  
  boolean connect=Refrigerator.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  Refrigerator.increaseVolume();
  Refrigerator.increaseVolume();
  Refrigerator.increaseVolume();
  Refrigerator.increaseVolume();
  Refrigerator.increaseVolume();
  Refrigerator.increaseVolume();
  Refrigerator.increaseVolume();
  Refrigerator.increaseVolume();
  
  Refrigerator.increaseVolume();
  Refrigerator.decreaseVolume();
  Refrigerator.decreaseVolume();
  Refrigerator.decreaseVolume();
  Refrigerator.decreaseVolume();
  Refrigerator.decreaseVolume();
  Refrigerator.decreaseVolume();
  Refrigerator.decreaseVolume();
  Refrigerator.decreaseVolume();
  
  connect=Refrigerator.onOrOff();
  System.out.println("Is connected :"+ connect);
  Refrigerator.increaseVolume();
  Refrigerator.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}