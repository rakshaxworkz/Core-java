class TelivisionRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  
  boolean connect=Telivision.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  Telivision.increaseVolume();
  Telivision.increaseVolume();
  Telivision.increaseVolume();
  Telivision.increaseVolume();
  Telivision.increaseVolume();
  Telivision.increaseVolume();
  Telivision.increaseVolume();
  Telivision.increaseVolume();
  
  Telivision.increaseVolume();
  Telivision.decreaseVolume();
  Telivision.decreaseVolume();
  Telivision.decreaseVolume();
  Telivision.decreaseVolume();
  Telivision.decreaseVolume();
  Telivision.decreaseVolume();
  Telivision.decreaseVolume();
  Telivision.decreaseVolume();
  
  connect=Telivision.onOrOff();
  System.out.println("Is connected :"+ connect);
  Telivision.increaseVolume();
  Telivision.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}